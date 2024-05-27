WITH h AS (
    SELECT 
        car_id
    FROM 
        CAR_RENTAL_COMPANY_RENTAL_HISTORY AS h
    WHERE 
        h.start_date BETWEEN '2022-11-01 00:00:00' AND '2022-11-30 23:59:59'
        OR h.end_date BETWEEN '2022-11-01 00:00:00' AND '2022-11-30 23:59:59'
        OR (h.start_date < '2022-11-01 00:00:00' AND h.end_date > '2022-11-30 23:59:59')
)
SELECT 
    q.car_id, 
    q.car_type, 
    q.FEE
FROM (
    SELECT 
        c.car_id, 
        c.car_type, 
        ROUND(
            c.daily_fee * 30 * (100 - (
                SELECT 
                    discount_rate 
                FROM 
                    CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS p 
                WHERE 
                    p.car_type = c.car_type 
                    AND p.duration_type = '30일 이상'
            )) / 100
        ) AS FEE
    FROM 
        CAR_RENTAL_COMPANY_CAR AS c
    WHERE 
        car_id NOT IN (SELECT h.car_id FROM h)
        AND c.car_type IN ('세단', 'suv')
) AS q
WHERE 
    q.FEE >= 500000 
    AND q.FEE < 2000000
ORDER BY 
    q.FEE DESC, 
    q.car_type ASC, 
    q.car_id DESC;
