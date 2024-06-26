WITH TMP AS (SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE
FROM FOOD_PRODUCT
WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
GROUP BY CATEGORY)

SELECT FP.CATEGORY, TMP.MAX_PRICE, FP.PRODUCT_NAME
FROM FOOD_PRODUCT AS FP
JOIN TMP
ON FP.PRICE = TMP.MAX_PRICE AND FP.CATEGORY = TMP.CATEGORY
ORDER BY PRICE DESC;