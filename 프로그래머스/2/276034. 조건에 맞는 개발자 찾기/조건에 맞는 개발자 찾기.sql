SELECT 
    distinct d.ID,
    d.EMAIL,
    d.FIRST_NAME,
    d.LAST_NAME
FROM 
    DEVELOPERS d
WHERE
    (d.SKILL_CODE & 256) = 256 OR 
    (d.SKILL_CODE & 1024) = 1024
ORDER BY 
    d.ID ASC;