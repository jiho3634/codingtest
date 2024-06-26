WITH ReviewCounts AS (
    SELECT MEMBER_ID, COUNT(REVIEW_ID) AS REVIEW_COUNT
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
),
MostActiveMembers AS (
    SELECT MEMBER_ID
    FROM ReviewCounts
    WHERE REVIEW_COUNT = (SELECT MAX(REVIEW_COUNT) FROM ReviewCounts)
)

SELECT
    MP.MEMBER_NAME,
    RR.REVIEW_TEXT,
    DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM
    MEMBER_PROFILE MP
JOIN
    REST_REVIEW RR
ON
    MP.MEMBER_ID = RR.MEMBER_ID
WHERE
    MP.MEMBER_ID IN (SELECT MEMBER_ID FROM MostActiveMembers)
ORDER BY
    RR.REVIEW_DATE ASC,
    RR.REVIEW_TEXT ASC;