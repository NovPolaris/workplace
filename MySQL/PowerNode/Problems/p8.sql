select ename, sal
from emp
where sal > (
	select max(sal)
	from emp
	where empno not in (
		select distinct mgr from emp where mgr is not null));