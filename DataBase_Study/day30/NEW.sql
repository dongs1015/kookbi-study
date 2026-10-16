select *
from emp

select empno, ename, hiredate,sal,comm,comm+ sal*12 as d
from emp

--  실습 사원의 부서정보는 어떤것들이 있는지 확인하는 쿼리 작성. 

select  empno, ename , deptno
from emp
 
select * from emp
where deptno = 10 -- 컬럼명 연산자 찾을값 

-- 실습 급여가 2000이상 되는 사람의 사원번호,사원이름 ,급여를 출력 
 
select empno, ename, sal
from emp
where sal >= 2000 

select * from emp 
where ename = 'ford'

select * from emp 
where ename = 'FORD' -- 대소문자 비교 되는지

select * from emp 
where hiredate >= '1981-06-01'

select * from emp
where ename like 'F%' --like 와 = 비슷한 역할
 
-- 실습 사원의 이름이 N으로 끝나느 사원번호 사원이름 입사날짜 출력
select empno, ename, hiredate from emp
where ename like '%N'
 
--실습 사원의 이름에 R이 포함된 사원번호 사원이름 급여 출력
select empno, ename, sal from emp
where ename like '%R%' 
 
--실습 사원 이름 두번째에 A가 포함된 사원번호 사원이름 입사날짜 급여를 출력
select empno, ename, hiredate, sal 
from emp
where ename like '_A%' 
 
select * from emp
--where deptno=10 and job ='MANAGER'
where job='MANAGER' and deptno =20
 
-- 실습 사원의 급여가 1500~3000사이의 급여를 받는 사원의 번호, 이름 , 급여, 입사날짜 출력
select empno, ename, sal, hiredate
from emp
where sal >= 1500 and sal <= 3000  

select empno, ename, sal, hiredate
from emp
where sal between 1500 and 3000

select * from emp
where job ='MANAGER'

select * from emp
where hiredate >= '1982-01-01' 

select * from emp
where job = 'MANAGER' or hiredate >= '1982-01-01'

-- 커미션을 300, 500, 1400을 받고있는 사원정보를 출력하시오. 
select * from emp
where comm = 300 or comm =500 or comm = 1400 

select * from emp
where comm in(300,500,1400)

select * from emp
where deptno = 10

select * from emp
where deptno = 20 or deptno 30

select * from emp
where deptno in(20,30)

select * from emp
--where not deptno = 10  이게 기본임 not을 왠만하면 써야함 
--where deptno != 10 원래는 안되던게 나중에 되기시작함 
where deptno<>10  -- 옛날에 != 추가되기전에 그역할을 수행했음  

select * from emp
--where comm not in(300,500,1400)  not과 in이 하나의 연산자로 같이 사용가능 
where not comm in(300,500,1400) -- not in은 하나의 문장영역 아래는 두개의 연산자 위는 하나의 연산자로 차이가남 

select * from emp
--where not sal between 1500 and 3000 두개의 연산자 between 과 not이 따로  
where sal not between 1500 and 3000  -- not between 하나의 연산자로 계산 

select * from emp
--whele comm = null  
--where comm is null 널을 가져오기위한 is null  null이 들어가는 설계가 좋은건 아니라  
where comm is not null -- is not null 과 null 은 안나오는게 좋긴하다 

select empno, ename , sal, deptno
from emp 
order by sal

select empno, ename , sal, deptno, hiredate
from emp 
order by hiredate

select empno, ename, sal, deptno
from emp
order by deptno asc, sal -- 다중 정렬 

select 3+5
from emp

desc dual

select * from dual

select 3+5
from dual

select 45.293,round(45.293,2),round(45.293,1), round(45.293, -1) --뒤가 가리키는게 자릿수로 보이지만 인덱스 번호임 ex) 2번째에서 자리올림함 .29 첫번째 자리에서 올리겠다 .3 
from dual

select 45.293, trunc(45.293,2), trunc(45.293,1), trunc(45.293, -1)            -- 잘라내기 
from dual

select mod(13, 5) -- 13%5
from dual

-- 사원의 급여를 100으로 나눈값을 출력하기
select empno, ename, sal, mod(sal,100)
from emp
 
--실습 직원들 정보중에 사원번호가 홀수인 사원만 출력하기
select empno, ename,sal , mod(empno,2)
from emp
where mod(empno,2) = 1

select 'Welcome to JAVA', upper('Welcome to JAVA')
from dual

select 'Welcom to Java', lower('Welcom to Java')
from dual

select empno, ename, sal, lower(ename)
from emp

select 'WELCOME TO JAVA', initcap('WELCOME TO JAVA')
from dual

--실습 사원의 이름을 앞글자만  대문자로해서 사원번호 이름 급여를 출력 
select empno, initcap(ename), sal
from emp

select 'Welcom To Java' , length('Welcom To Java')
from dual

select 'Welcome To Java', instr('Welcome To Java', 'o')
                        , instr('Welcome To Java', 'o', 1, 2)
from dual

--실습 사원번호, 사원이름, 입사날짜를 출력하되, 사원의 이름에
--'A'가 포함되어있다면 몇번째에 존재하는지 정보도 같이 출력

select empno, ename, instr(ename, 'A'), hiredate
from emp 

select 'Welcome To Java', substr('Welcome To Java',4,3)
from dual

-- 실습 사원번호, 사원이름, 입사날짜를 출력하되 입사날짜는 입사년도만 출력할것
select empno, ename, substr(hiredate, 1 ,4)
from emp 

select lpad('java', 20, '#'), rpad('java',20,'#') -- 숫자를표현할때 문서 번호를 정리할때 db에서는 보통안하고 프로그램에서 사용해서 대부분사용안함 
from dual

select 'ccccjava!cccc', ltrim('ccccjava!cccc' , 'c'), rtrim('ccccjava!cccc','c') --스페이스바로 공백을 넣어도 여기선 데이터라 트림으로 제거가능 
from dual 

select '      java         ', ltrim('      java         ' , ' ') , rtrim('      java         ', ' ')
from dual 

