package day03;

public class day03_02 {

	public static void main(String[] args) {
		
		//대입연산자, 산술연산자/증감연산자
		
		System.out.println("1.대입연산자와 산술연산자");
		
		int i = 10;
		System.out.println("i="+i);
		
		i = i +1;
		System.out.println("i="+i);
		
		i+=1;
		System.out.println("i="+i);
		
		i++;
		System.out.println("i="+i);
		
		i = i-1;
		i -= 1;
		i--;
		System.out.println("i="+i);
		
		//i= i*2;
		i*=2;
		System.out.println("i="+i);
		
		//i=i / 3;
		//i /= 3;
		i %= 3;
		System.out.println("i="+i);
		
		System.out.println("2.단항연산자");
		System.out.println("2_1. ~비트 not 연산자");
		
		int num= 23;
		System.out.println("num="+num);
		System.out.println("~num="+~num);
		
		System.out.println("2_2. !논리 not 연산자");
		boolean bool = true;
		System.out.println("bool="+bool);
		System.out.println("!bool="+!bool);
		System.out.println("!num="+num);
		
		System.out.println("3.비트 시프트 연산자");
		/*
		 * <<
		 * 지정한 자리수만큼 왼쪽으로 이동 남은 공간은 0으로 채움
		 * >>
		 * 지정한 자리수만큼 오른쪽으로 이동 남은 공간은 부호화비트로 채움
		 * >>>
		 * 지정한 자리수만큼 오른쪽으로 이동 남은공간은 0으로 채움
		 */
		
		int num2=-6;
		
		System.out.println("num2="+num2);
		
		System.out.println("num2<<2="+(num2<<2));
		System.out.println("num2>>-2="+(num2>>2));
		System.out.println("num2>>>-2="+(num2>>>2));
		
		System.out.println("4.관계 연산자");
		
		System.out.println("3>7"+(3>7));
		System.out.println("3<7"+(3<7));
		System.out.println("3==7"+(3==7));
		System.out.println("3!=7"+(3!=7));
		
		System.out.println("5.비트 연산자");
		/*
		 *&(and) 
		 * 대조되는 비트를 비교하여 모두 1이면 1을 하나라도 0이면 0을 반환
		 * 
		 * |(or)
		 * 대조되는 비트를 비교하여 하나라도 1이라면 1을 반환 둘다 0이면 0을 반환
		 * 
		 * ^(xor)
		 * 대조되는 비트를 비교하여 같으면 0을 다르면 1을 반환
		 */
		
		int test1=10;
		int test2=12;
		
		System.out.println("test1="+test1+"/test2="+test2);
		System.out.println("test1 and test2=" +(test1 & test2));
		System.out.println("test1 or test2=" +(test1 | test2));
		System.out.println("test1 xor test2=" +(test1 ^ test2));
		
		/* 10 0000 1010
		 * 12 0000 1100
		 * 
		 * xor ^ 0000 0110 
		 * or| 0000 1110
		 * and& 0000 1000
		 */
		
		System.out.println("6.논리 연산자");
		System.out.println("true && true="+(true && true));
		System.out.println("true && false="+(true && false));
		System.out.println("false && true="+(false && true));
		System.out.println("false && false="+(false && false));
		
		System.out.println("true || true="+(true || true));
		System.out.println("true || false="+(true || false));
		System.out.println("false || true="+(false || true));
		System.out.println("false || false="+(false || false));
		
		System.out.println("3>7&&4==5 ="+(3>7&&4==5));
		
	}

}
