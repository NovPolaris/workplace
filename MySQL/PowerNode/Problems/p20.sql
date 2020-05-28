# 列出最低薪水大于1500的各种工作及从事此工作的全部雇员人数
select t1.count, t2.job
from (
	select count(e.ename) count, job
	from emp e
	group by e.job) t1
join (
	select min(sal) minSal, job
	from emp
	group by job
	having minSal > 1500) t2
on t1.job = t2.job;