# 列出所有员工的年工资，按年薪从低到高排序
select (sal + ifnull(comm, 0)) * 12 annualSal
from emp
order by annualSal;