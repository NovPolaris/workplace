select e1.ename, e1.mgr, e2.ename
from emp as e1
left join
	emp as e2
on e1.mgr = e2.empno;