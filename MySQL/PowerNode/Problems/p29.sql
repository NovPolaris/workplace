# 列出各种工作的最低工资及从事此工作的雇员姓名
select sal, ename
from emp e
join (
	select min(sal) minSal, job
	from emp
	group by job) t
on e.sal = t.minSal and e.job = t.job;