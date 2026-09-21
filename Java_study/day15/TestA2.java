package day15; // 교수님버전

public class TestA2 {

	static int count=0;
	
	
	public TestA2() {
		count++;
	}
	
	/**static 메서드 or class 메서드*/
	public static void getInfo() {
		System.out.println("현재까지 만들어진 객체는 "+ count +"입니다.");
	}
	
}
