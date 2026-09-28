package day18;

//final : 무조건 금지
//class +final: 상속금지
//method+fianl : 오버라이딩(재정의)금지
//var+final : 상수

class Super{
	final public static int A=10;
	final public void test1() {
		System.out.println("test1()메서드");
	}
	
}

class Sub extends Super{
	int b=20;
	int a =10;
//	public void test1() {
//		System.out.println("재정의한 test1()");
//	}
	public void test2() {
		System.out.println("a="+a+"/b="+b);
		System.out.println("test2()메서드");
//		a=30;
		System.out.println("a="+a+"/b="+b);
	}
}

public class FinalTest {

	public static void main(String[] args) {

		Sub s = new Sub();
		s.test1();
		s.test2();
	}

}
