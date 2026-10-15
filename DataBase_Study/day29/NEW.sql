select * from tab

desc emp

select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp

select *
from emp

select empno, ename, hiredate
from emp

select empno, ename, hiredate, sal, sal*12, 
comm,sal*12+comm as 총지급액 
from emp

select ename||'의 직무는 '||job||'입니다.' as msg 
from emp 

select distinct job
from emp