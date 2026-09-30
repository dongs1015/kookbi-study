package day20;

public class ExcepTest2 {

	public static void main(String[] args) {
		
		System.out.println("==프로그램의 시작==");
		
		try {
		String fruit[] = {"사과", "배", "포도", "딸기"};
		
		for(int i=0; i<=4; i++) {
			System.out.println(fruit[i]);
		}
		}catch(/*ArrayIndexOutOfBounds*/Exception e) {
			System.out.println("배열의 잘못된 위치를 지정함");
		}
		System.out.println("==프로그램의 끝==");

	}

}
