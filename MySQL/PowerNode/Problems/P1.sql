select e.ename, e.DEPTNO, e.sal
from EMP as e,
	(select DEPTNO, max(sal) as maxSalary
	 from EMP
	 group by DEPTNO) as o
where e.DEPTNO = o.DEPTNO and e.sal = o.maxSalary
order by DEPTNO;