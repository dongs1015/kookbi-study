--실습 컬럼명 total 12명의 데이터가 들어가도록하고 1980 년 1명 1981년 10명 1982 1명 이 결과로 나오도록
--교수님 버전
 select 
     count(hiredate) as total,
     sum(decode(substr(hiredate,1,4),1980, 1, 0)) as "1980",
     count(decode(to_char(hiredate, 'yyyy'),1981, 1)) as "1981",
     sum(case when to_char(hiredate, 'YYYY') = '1982' then 1 else 0 end) as "1982"
 from emp 
 
select max(sal),ename from emp -- 일반컬럼과 그룹컬럼이라 같이못함 

select count(*), deptno --그룹바이를 사용하여 deptno자체를 그룹컬럼으로 만듬 
from emp
group by deptno
order by deptno 

--실습  각부서별 최저임금과 최고임금을 출력
select deptno,max(sal), min(sal) 
from emp
group by deptno
order by deptno

--실습 각 부서별 근무인원과 com 데이터가 있는 사원수를 출력
select deptno, count(ename), count(comm)
from emp
group by deptno
 
select deptno, avg(sal)
from emp
group by deptno
having avg(sal)>=2000

select deptno, avg(sal)
from emp
where sal >= 1000
group by deptno
having avg(sal) >=2000

select * from emp
where ename ='FORD'

select * from dept
where deptno = 20

select * from emp
select * from dept

select *
from emp, dept -- 둘이 연결은 안해놓은 상태면 곱집합이 발생해 12 x 4가되 48개의 자료가나옴 

select empno, ename, dname ,d.deptno
from emp e, dept d -- 별칭이아닌 emp를 복사한e를 워크테이블로 하나만든거 데이터를 더 먹게됨 
where e.deptno = d.deptno --공용되는 deptno를 통해 둘을 연결함 equal join
and e.ename='FORD' 

select empno, ename, sal
from emp, dept

select * from tab

desc salgrade

select * from emp

select empno, ename, sal, grade
from emp, salgrade
where emp.sal >=salgrade.losal and emp.sal <=salgrade.hisal

--실습 이름 , 부서명, 급여 , 급여등급을 출력하는 쿼리를 작성
select ename, dname, sal, grade
from emp, dept, salgrade
where emp.deptno = dept.deptno and emp.sal >= salgrade.losal and emp.sal <=salgrade.hisal 
-- emp.sal between salgrade.losal and emp.sal <=salgrade.hisal  도 가능 and 니깐 

select * from emp

select e1.empno, e1.ename, e1.mgr, e2.ename
from emp e1, emp e2
where e1.mgr =e2.empno(+) -- self join 사장은 상사가 없어서 null 데이터가 나와 12명이 아닌 11명이 나오게됨 

-- 실습 사원들의 이름, 부서번호 , 부서이름을 출력
select ename, emp.deptno, dname
from emp, dept
where emp.deptno = dept.deptno 

--실습 부서번호가 30번인 이름, 직급, 부서번호, 부서위치를 출력 
select ename, job, emp.deptno, loc
from emp, dept
where emp.deptno = dept.deptno and emp.deptno = 30
 
--실습 커미션을 받는 사원의 이름, 커미션, 부서이름, 부서위치를 출력 
select ename, comm, dname, loc
from emp, dept
where emp.deptno = dept.deptno and comm > 0
-- and comm in not null

--실습 DALLAS에서 근무하는 사원의 이름, 직급, 부서번호, 부서이름을 출력
select ename, job, dept.deptno, dname
from emp, dept
where emp.deptno = dept.deptno and loc = 'DALLAS' 


--실습 이름에 A가 들어가있는 사원의 이름과 부서이름을 출력 
select ename, dname
from emp, dept
where emp.deptno = dept.deptno and ename like'%A%' 

--실습 사원이름과 , 직급, 급여, 급여등금을 출력
select ename, job, sal, grade
from emp, salgrade
where emp.sal > salgrade.losal and emp.sal < salgrade.hisal 

--실습 사원이름 ,부서번호와 해당사원과 같은 부서에서 근무하는 사원을 출력(self join)
select e1.ename,  e1.deptno, e2.ename
from emp e1, emp e2
where e1. deptno = e2.deptno  and e1.empno != e2.empno
order by e1.ename asc
-- ane e.ename <> e2.ename

--실습 부서별 부서명과 해당 부서의 평균급여를 출력
--(단 ,급여 평균은 소수점 둘째자리에서 반올림하고, 사원이 없는 부서도 평균급여가 0또는 NULL로 출력되어야함) 
select dept.dname, nvl(round(avg(sal),1), 0) as sal
from dept , emp
where dept.deptno = emp.deptno(+)
group by dname

--실습 각 급여 등급(GRADE)별로 그 등급에 속한 사원들의 수와 급여 총합을 구하고,
--등급이 높은 순으로 정렬하는 쿼리 작성.
select  grade, count(ename)as people,sum(sal)
from emp, salgrade
where emp.sal >= salgrade.losal and emp.sal <= salgrade.hisal -- emp.sal between salgrade.losal and salgrade.hisal 
group by grade
order by grade desc
 
--실습 'CHICAGO'지역에서 근무하는 사원들 중, 급여 등급이 3등급이상인 사원들의
--이름 ,부서명,지역,급여,급여등급을 출력하는 쿼리
select ename, dname, loc, sal, grade
from emp, dept, salgrade
where emp.deptno = dept.deptno and emp.sal >= salgrade.losal and emp.sal <salgrade.hisal and grade >= '3'  and loc = 'CHICAGO'
 

