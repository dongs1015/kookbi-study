package day21;

import java.util.*;

class YongException extends Exception{
	public YongException(){
		super("용예외: 미성년자 안됨!");
	}
}
public class UserExcepTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이가 몇이세요");
		int age =sc.nextInt();
		try {
		System.out.println("당신의 나이는"+age+"입니다.");
		
		if(age<20) {
			throw new YongException();
		}
		
		System.out.println("입장을 환영합니다.");
		}catch(YongException e) {
			System.out.println("어린이는 가라");
		}
		System.out.println("==프로그램 종료==");
		
		
	}

}
