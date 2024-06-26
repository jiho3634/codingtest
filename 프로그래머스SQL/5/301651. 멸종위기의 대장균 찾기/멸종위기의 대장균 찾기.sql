WITH RECURSIVE CTE AS (
    SELECT
        ID,
        PARENT_ID,
        1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    
    UNION ALL
    
    SELECT
        C.ID,
        C.PARENT_ID,
        CTE.GENERATION + 1
    FROM ECOLI_DATA AS C
    JOIN CTE
    ON C.PARENT_ID = CTE.ID),
PID AS (SELECT PARENT_ID FROM CTE)

SELECT COUNT(ID) AS COUNT, GENERATION
FROM CTE 
WHERE ID NOT IN (SELECT PARENT_ID FROM CTE WHERE PARENT_ID IS NOT NULL GROUP BY PARENT_ID)
GROUP BY GENERATION
ORDER BY GENERATION ASC;