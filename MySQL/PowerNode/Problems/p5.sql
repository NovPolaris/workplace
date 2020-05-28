select DEPTNO, avg(sal) as AVG
from EMP
group by DEPTNO
order by AVG desc
limit 1;