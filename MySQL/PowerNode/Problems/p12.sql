select count(salgrade.grade) as number, salgrade.grade
from emp
join salgrade
on emp.sal between salgrade.losal and salgrade.hisal
group by salgrade.grade
order by salgrade.grade;