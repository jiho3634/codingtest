-- 코드를 입력하세요
SELECT DISTINCT H.CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS H
JOIN CAR_RENTAL_COMPANY_CAR AS C
ON H.CAR_ID = C.CAR_ID
WHERE MONTH(START_DATE) = 10 AND C.CAR_TYPE = '세단'
ORDER BY CAR_ID DESC;