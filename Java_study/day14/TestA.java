package day14;

public class TestA {

	//멤버변수 선언
	static int Test = 0;
	
	//생성자 선언영역
	public TestA() {
		
		Test++;
	}
	//

	public static void gentInfo() {
		
		System.out.print("지금까지 만들어진 객체는 "+Test+" 개입니다.");
		
	}
}
