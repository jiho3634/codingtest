with f as (
    select distinct d.ID, d.EMAIL, d.FIRST_NAME, d.LAST_NAME, d.skill_code
    from developers as d
    join (SELECT CODE
    FROM SKILLCODES
    WHERE CATEGORY = 'Front End') as s
    where d.skill_code & s.code = s.code
    order by ID asc)
, c as (
    select distinct d.ID, d.EMAIL, 'B' AS GRADE
    from developers as d
    join (SELECT CODE
    FROM SKILLCODES
    WHERE NAME='C#') as s
    where d.skill_code & s.code = s.code
    order by ID asc)

select  MIN(GRADE) as GRADE ,v.ID, v.EMAIL from(select f.ID, f.EMAIL,
    case
        when f.skill_code & p.code = p.code then 'A'
        else 'C'
    end as GRADE
from f
join (select code from skillcodes where NAME='Python') as p
union 
select * from c) as v
group by v.ID, v.EMAIL
order by GRADE, ID ASC;