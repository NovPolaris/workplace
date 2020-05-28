select DNAME 
from DEPT as d
join (
	select DEPTNO, avg(sal) as AVG
	from EMP
	group by DEPTNO
	order by AVG
	limit 1) as t
on d.DEPTNO = t.DEPTNO;