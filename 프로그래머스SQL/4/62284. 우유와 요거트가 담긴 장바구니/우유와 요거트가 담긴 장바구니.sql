WITH M AS (SELECT DISTINCT CART_ID
FROM CART_PRODUCTS
WHERE NAME='MILK')

SELECT DISTINCT Y.CART_ID
FROM CART_PRODUCTS AS Y
JOIN M
ON M.CART_ID = Y.CART_ID
WHERE Y.NAME='YOGURT'
ORDER BY Y.CART_ID ASC;