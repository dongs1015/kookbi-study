package day20;

public class ExcepTest1 {

	public static void main(String[] args) {
		
		System.out.println("==프로그램이 시작됩니다==");
		
		
		try { // 예외가 발생할거 같은 코드
			String str=null;
			
			System.out.println(str.toString());  
		}catch(NullPointerException e) { //정보 클래스 예외가 발생할때 실행할코드
			System.out.println("객체가 존재하지 않습니다.");
		}
		
		
		System.out.println("==프로그램이 종료됩니다==");

	}

}
