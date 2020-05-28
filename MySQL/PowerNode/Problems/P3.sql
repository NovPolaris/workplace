select avg(s.GRADE), e.DEPTNO
from EMP as e
join (
	select GRADE, LOSAL, HISAL
	from SALGRADE) as s
on e.sal between s.LOSAL and s.HISAL
group by e.DEPTNO
order by e.DEPTNO;