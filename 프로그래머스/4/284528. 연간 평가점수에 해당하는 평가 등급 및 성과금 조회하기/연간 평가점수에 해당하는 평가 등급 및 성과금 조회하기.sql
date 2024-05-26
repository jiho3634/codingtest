select e.EMP_NO, e.EMP_NAME,
    CASE
        WHEN AVG(g.SCORE) >= 96 then 'S'
        WHEN AVG(g.SCORE) >= 90 then 'A'
        WHEN AVG(g.SCORE) >= 80 then 'B'
        ELSE 'C'
    END AS GRADE,
    CASE
        WHEN AVG(g.SCORE) >= 96 then ROUND(e.SAL * 0.2)
        WHEN AVG(g.SCORE) >= 90 then ROUND(e.SAL * 0.15)
        WHEN AVG(g.SCORE) >= 80 then ROUND(e.SAL * 0.1)
        ELSE 0
    END AS BONUS
from HR_EMPLOYEES as e
join HR_GRADE as g
on e.EMP_NO = g.EMP_NO
group by e.EMP_NO, e.EMP_NAME, e.SAL
order by e.EMP_NO ASC;