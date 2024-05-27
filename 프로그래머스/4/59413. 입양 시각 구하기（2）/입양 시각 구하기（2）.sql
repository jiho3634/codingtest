WITH RECURSIVE Hours AS (
    SELECT 0 AS Hour
    UNION ALL
    SELECT Hour + 1 
    FROM Hours 
    WHERE Hour < 23
)

SELECT 
    Hours.Hour, 
    COUNT(a.animal_id) AS count
FROM 
    Hours
LEFT JOIN 
    animal_outs a
ON 
    Hours.Hour = HOUR(a.datetime)
GROUP BY 
    Hours.Hour
ORDER BY 
    Hours.Hour;