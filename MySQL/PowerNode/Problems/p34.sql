# 给任职日期超过30年的员工加薪10%
select sal * 1.1 newSal
from emp
where ((to_days(now()) - to_days(hiredate)) / 365) > 30
order by newSal;