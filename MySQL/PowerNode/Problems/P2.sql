select ename, sal
from EMP as e1
join (
	select DEPTNO, avg(sal) as AVG
	from EMP
	group by DEPTNO) as e2
on e1.DEPTNO = e2.DEPTNO
where e1.sal > e2.AVG;