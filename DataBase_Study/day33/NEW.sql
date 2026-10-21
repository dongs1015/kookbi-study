-- 실습 사원의 번호, 이름 , 급여를 출력하되 평균 급여보다 많은 사원만 출력
select avg(sal) from emp

select empno, ename, sal from emp
where sal>= 2077

--실습 조인을 쓰지않고 포드의 부서명 출력 쿼리
select ename, deptno from emp
where ename='FORD'
select dname from dept
where deptno= 20 

--실습 포드 부서명 서브쿼리로 사용
select deptno from emp where ename ='FORD'

select dname from dept
where deptno= (select deptno from emp where ename = 'FORD') -- 1줄 나오는건 단일행 서브쿼리라고함 

--실습 평균급여 위에거 서브쿼리버전
select avg(sal) from emp

select empno, ename, sal
from emp
where sal>=(select avg(sal) from emp) -- 테이블은 두개 생성 메인쿼리 하나 서브쿼리 하나 해서 테이블 총 두개생성됨 

select a.empno, a.ename, a.sal, a.deptno,dept.dname
from (select empno, ename, sal, deptno from emp) a, dept
where a.deptno = dept.deptno

--실습 부서번호가 20번인 사원중 최대 급여를 받는 사원과 동일한 급여를 받는
--사원의 사원번호와 사원명을 출력하시오. 
select empno ename, sal 
from emp
where sal = (select max(sal) from emp where deptno=20)

--실습 KING 과 FORD근무하는 동료들을 출력하라 


select empno, ename, deptno
from emp
where deptno =(select deptno from emp where ename = 'KING') -- 단일행 서브쿼리 서브쿼리에 의해 나오는결과가 하나이기때문에 
or deptno =  (select deptno from emp where ename = 'FORD')

select empno, ename, deptno
from emp
where deptno =(select deptno
from emp
where ename ='KING' or ename='FORD' )

select empno, ename, deptno
from emp
where deptno in(select deptno
from emp
where ename ='KING' or ename='FORD' )    -- 다중행 서브쿼리하나의 결과를 반환하는게 아닌 여러개의 서브쿼리를 반환해서 

-- 실습 급여를 3000이상 받는 사원이 소속된 부서와 동일한 부서에서  근무하는 동료 사원들을 출력
select ename, deptno , sal
from emp
where deptno in(select deptno
                from emp 
                where sal >= 3000) 

select empno , ename, sal
from emp
where sal >= any(select sal
                    from emp
                    where deptno = 20))
--where sal>=800 or sal>=2975 or sal>= 3000
--where sal >= all(select sal
--from emp
--where deptno = 20) 
-- where sal >= 800 and sal >= 2975 and sal >= 3000 최고값 보다 큰값이 되는게 일반적 그래서 3000보다큰 단일행 서브쿼리를 만든는게 더편함 

--실습 'FORD'의 급여와 동일하거나 더 많이 받는 사원명과 급여를 출력

select ename, sal
from emp
where sal >= (select sal from emp  
              where ename = 'FORD') 

--실습 직급이 CLERK인 사원의 부서의 부서번화 부서명과 지역을 출력
select deptno, dname, loc
from  dept
where deptno in(select deptno from emp where job = 'CLERK')

--실습 이름에 T를 포함하고 있는 사원들과 같은 부서에서 근무하고 있는 사원의 사원번호와 이름을 풀력
select empno, ename
from emp
where deptno in (select deptno from emp where ename like '%T%') 

select ename , emp.deptno
from emp
where deptno in (select deptno from dept where loc = 'DALLAS' )

select ename , sal
from emp
where deptno = ( select deptno from dept where dname = 'SALES')

select ename, sal
from emp
where mgr in (select empno from emp where empno = '7839')

--실습 자신의 급여가 평균 급여보다 많고 이름에 S자가 들어가는 사원과 동일한 부서에서 근무하는
--모든 사원의 사원번호, 이름 및 급여를 출력 
select deptno, ename, sal
from emp
where deptno =(select deptno from emp where sal >= (select avg(sal) from emp ) and ename like '%S%')  

select * from tab

create table student(
    -- 컬럼명   자료형  제약조건
    name    varchar2(30)    not null,
    age     number(3),
    addr    varchar2(100),
    tel     varchar2(100)      
)
desc student

select * from emp

create table emp02
as (select * from emp)

select * from tab

select * from emp02
desc emp
desc emp02

select empno, ename, hiredate, sal
from emp

create table emp03
as (select empno, ename, hiredate, sal from emp)

select * from emp03

create table emp04       --물리적 생성 
as (select * from emp where 1=0)

select * from tab

select * from emp04

select * from emp03 -- 물리컬럼 물리명령어   물리는 실질적인 디스크에 적용하는 시점 논리는 메모리상에 존재하는 시점 

alter table emp03
add(email number(4))        -- 추가 

select * from emp03 
desc emp03

alter table emp03
modify(email varchar2(100))      -- MODIFY 수정 

alter table emp03     --물리적수정  보통 사용하지 말라고함 
drop column email     -- 물리적 삭제 

select * from tab

drop table emp03 -- 없애다보면 쓰레기 데이터가 생김 

purge recyclebin  -- 쓰레기 데이터 정리 














