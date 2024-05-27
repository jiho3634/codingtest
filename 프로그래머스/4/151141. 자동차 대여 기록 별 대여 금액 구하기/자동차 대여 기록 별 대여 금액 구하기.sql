WITH tmp AS (
    SELECT 
        h.history_id, 
        h.car_id, 
        DATEDIFF(h.end_date, h.start_date) + 1 AS a, 
        c.car_type, 
        c.daily_fee, 
        (DATEDIFF(h.end_date, h.start_date) + 1) * c.daily_fee AS total,
        CASE
            WHEN DATEDIFF(h.end_date, h.start_date) + 1 >= 90 THEN '90일 이상'
            WHEN DATEDIFF(h.end_date, h.start_date) + 1 >= 30 THEN '30일 이상'
            WHEN DATEDIFF(h.end_date, h.start_date) + 1 >= 7 THEN '7일 이상'
            ELSE NULL
        END AS duration_type
    FROM 
        CAR_RENTAL_COMPANY_RENTAL_HISTORY AS h
    JOIN 
        CAR_RENTAL_COMPANY_CAR AS c
    ON 
        h.car_id = c.car_id
    WHERE 
        c.car_type = '트럭'
)

SELECT 
    tmp.history_id, 
    ROUND(tmp.total * (100 - IFNULL(p.discount_rate, 0)) / 100) AS FEE
FROM 
    tmp
LEFT OUTER JOIN 
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS p
ON 
    tmp.duration_type = p.duration_type 
    AND p.car_type = tmp.car_type
ORDER BY 
    FEE DESC, 
    tmp.history_id DESC;