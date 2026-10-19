-- 실습 smith를 검색하였을때 대문자가 입력될때 검색되는 쿼리와 소문자가 입력될때 검색되는 쿼리를 작성
select *  from emp
where lower(ename) ='smith'

select * from emp
where upper(ename) = 'SMITH'

--실습 이름의 세번째가 R인 직원을 검색
select * from emp
where ename like'__R%'
 
select * from emp
where substr(ename, 3, 1) = 'R'  -- 세번째 자리에 r이들어가고 첫번째수가  

select *  from emp
where instr(ename, 'R',3,1) =3  -- 이름에 r이들어갔고 세번째 자리에 첫번째수가 만약 3이맞다면  위치를 추출하는 함수라 

--실습 이름의 끝자리가 N으로 끝나는 직원을 검색
select * from emp
where ename like'%N' 

select * from emp
where instr(ename, 'N',1,1) =length(ename) --  이름중에 n이 한자리의 

select * from emp
where substr(ename, length(ename), 1) = 'N' -- 이름중에 이름의 길이(마지막자리)가 n이면 

select from emp
where substr(ename, -1, 1) ='N' -- -를 사용하여 인덱스 자리를 표현할수있음 뒤에서 -1씩높아짐 

--실습 and나 between을 사용하지않고 82년도에 입사한 직원을 출력하시오 
select * from emp
where substr(hiredate ,3, 2) = '82'

select * from emp
where hiredate like '1982%'

--실습 직원이 이름의 5글자인 사원을 검색하여 사원번호 사원이름, 입사날짜를 출력하시오, 사원이름은 소문자로 출력
select empno, lower(ename), hiredate from emp
where length(ename)=5

select empno, lower(ename), hiredate from emp
where ename like '_____'

select sysdate, sysdate+1, sysdate-1 -- 날짜 +- 숫자가능 
from dual

select empno, ename, hiredate, trunc(sysdate-hiredate,0) -- 근무일수 출력 날짜-날짜 가능 
from emp

select empno, ename, hiredate, trunc(months_between(sysdate, hiredate),0) --날짜와 날짜 사이 개월 계산 
from emp 

select sysdate,add_months(sysdate, 3)
from dual

-- 실습 사원의 번호, 이름, 입사날짜 입사후 6개월이 지난 날짜를 출력
select empno, ename, hiredate, add_months(hiredate, 6)
from emp 

select sysdate, last_day(sysdate)
from dual

--실습 사원의 번호, 이름, 입사날짜와 함께 입사한 달의 마지막일자를 출력
select empno, ename, hiredate, last_day(hiredate) as "입사한달 마지막일자" 
from emp 

select sysdate, next_day(sysdate, 6)
from dual 

--실습 사원의 번호, 이름, 입사날짜와 함께 돌아오는 일요일은 몇일인지 출력
select empno, ename, hiredate, next_day(hiredate, 1)
from emp 

-- 실습 오늘을 기준으로 6개월후 수요일은 몇일인지 출력
select sysdate, next_day(add_months(sysdate, 6), 4) as"6개월후 수요일"
from dual 

select '3'+5 --  9에서 10으로 업데이트되면서 문자와 산술연산자를 넣어서 계산하면 수치데이터로 계산하게되었고 왠만한 프로그램에 다 있음 
from dual 

select sysdate ,sysdate-to_date('2026-10-05','yyyy-mm-dd')
from dual 

select sysdate,to_char(sysdate, 'MM/DD(YYYY)') 
from dual

select empno, ename, sal, sal*12, comm, sal*12+nvl(comm,0) --nvl로 null 을 다른값으로 치환함 null value의 약자  중요함수 
from emp

--실습 mgr 중 널값을 CEO로 바꿔 출력 
select empno, ename,nvl(to_char(mgr), 'CEO') -- 이미 문자열이기때문에 MGR은 숫자라 문자로 바꿔줘야함 
from emp 

select empno, ename, hiredate, deptno,
    decode(deptno, 10, 'ACCOUNTING',20,'RESEARCH', 30, 'SALES',40,'OPERATIONS') as danme
from emp 

select * from tab

select * from dept

--실습 직원의 사원번호, 사원이름, 직무, 급여를 출력
-- 단 급여2 는 직급이 manage일 경우 15% 인상 salesman일 경우 5%인상
select empno, ename, job, sal,decode(job, 'MANAGER', sal*1.15, 'SALESMAN', sal*1.05) as sal2
from emp  

select empno, ename, deptno, 
    case
        when deptno=10 then 'ACCOUNTING'
        when deptno=20 then 'RESEARCH'
        when deptno=30 then 'SALES'
        when deptno=40 then 'OPERATIONS' 
    end as dname 
from emp

select empno, ename, job, sal, 
    nvl(case
        when job = 'MANAGER' then sal*1.15
        when job = 'SALESMAN' then sal * 1.05
    end,sal )as sal2
from emp    

select sum(sal) from emp

select avg(sal) from emp

select max(sal), ename from emp

select min(sal),max(sal) from emp

--실습 사원의 알파벳순의 첫번째 이름과 마지막 번째 이름
--입사날짜의 제일 빠른 입사일과 늦은 입사일을 출력하는 쿼리

select max(ename), min(ename), max(hiredate), min(hiredate)
from emp 

select sum(comm) --null 이들어와도 통계함수는 0으로 치환 하거나 배제해서 계산한다 
from emp

select avg(comm) -- null 값들을 아예 생략하고  계산을해서 12가 아닌 4로 나눈게 계산이 나옴  
from emp

--실습 커미션을 사원수의 12명으로 나눈값으로 출력되는 쿼리

select avg(nvl(comm, 0)) from emp

select count(sal) from emp 

select count(comm) from emp -- null 값은 어떤지 확인할려고 null은 생략하면서 셈

select count(*) from emp 

select count(comm) from emp
where deptno=10

--실습 사원의 직무종류의 수를 출력하는 쿼리 
select count(distinct job) 
from emp

--실습 컬럼명 total 12명의 데이터가 들어가도록하고 1980 년 1명 1981년 10명 1982 1명 이 결과로 나오도록
select 
     count(hiredate) as total,
     count(decode(to_char(hiredate, 'YYYY'), '1980', hiredate)) as "1980",
     count(decode(to_char(hiredate, 'YYYY'), '1981', hiredate)) as "1981",
     count(decode(to_char(hiredate, 'YYYY'), '1982', hiredate)) as "1982"
from emp

select
       count(hiredate) as total,
       count(case when to_char(hiredate, 'YYYY') = '1980' then 1 end) as "1980",
       count(case when to_char(hiredate, 'YYYY') = '1981' then 1 end) as "1981",
       count(case when to_char(hiredate, 'YYYY') = '1982' then 1 end) as "1982"
from emp