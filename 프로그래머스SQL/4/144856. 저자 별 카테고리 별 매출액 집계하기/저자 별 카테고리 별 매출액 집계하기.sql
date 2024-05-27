WITH S AS (
    SELECT 
        book_id, 
        SUM(sales) AS sales
    FROM 
        BOOK_SALES
    WHERE 
        DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
    GROUP BY 
        book_id
),
T AS (
    SELECT 
        s.book_id, 
        (s.sales * b.price) AS SALES, 
        b.category, 
        b.author_id
    FROM 
        S
    JOIN 
        BOOK AS b
    ON 
        s.book_id = b.book_id
)
SELECT 
    a.AUTHOR_ID, 
    a.AUTHOR_NAME, 
    t.CATEGORY, 
    SUM(t.SALES) AS TOTAL_SALES
FROM 
    T
JOIN 
    AUTHOR AS a
ON 
    a.author_id = t.author_id
GROUP BY 
    a.AUTHOR_ID, 
    a.AUTHOR_NAME, 
    t.CATEGORY
ORDER BY 
    a.AUTHOR_ID ASC, 
    t.CATEGORY DESC;
