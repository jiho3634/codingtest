-- 코드를 입력하세요
SELECT 
	YEAR(S.SALES_DATE) AS YEAR, 
    MONTH(S.SALES_DATE) AS MONTH, 
    I.GENDER AS GENDER, 
    COUNT(DISTINCT s.user_id) AS USERS
FROM ONLINE_SALE AS S
JOIN USER_INFO AS I
ON I.USER_ID = S.USER_ID
WHERE I.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, GENDER
ORDER BY YEAR, MONTH, GENDER ASC;