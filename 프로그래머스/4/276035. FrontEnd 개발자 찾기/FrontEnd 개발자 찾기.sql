SELECT DISTINCT 
    d.ID, 
    d.EMAIL, 
    d.FIRST_NAME, 
    d.LAST_NAME
FROM 
    developers AS d
JOIN 
    (SELECT 
         CODE
     FROM 
         skillcodes
     WHERE 
         CATEGORY = 'Front End') AS s
ON 
    d.skill_code & s.code = s.code
ORDER BY 
    d.ID;