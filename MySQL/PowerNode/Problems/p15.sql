select e.empno, e.ename, d.dname
from emp as e, dept as d, (select e1.empno
from emp as e1
left join
	emp as e2
on e1.mgr = e2.empno
where e1.hiredate < e2.hiredate) as t
where e.deptno = d.deptno and e.empno = t.empno;