WITH J AS (
    SELECT 
        FLAVOR, 
        SUM(TOTAL_ORDER) AS T
    FROM 
        JULY
    GROUP BY 
        FLAVOR
)

SELECT 
    F.FLAVOR
FROM 
    FIRST_HALF AS F
JOIN 
    J
ON 
    F.FLAVOR = J.FLAVOR
ORDER BY 
    (F.TOTAL_ORDER + J.T) DESC
LIMIT 3;
