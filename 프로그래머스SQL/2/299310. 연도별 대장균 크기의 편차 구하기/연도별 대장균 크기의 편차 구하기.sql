select
    extract(year from differentiation_date) as year,
    max(size_of_colony) over (partition by extract(year from differentiation_date)) - size_of_colony as year_dev,
    id
from ecoli_data
order by year asc, year_dev asc;