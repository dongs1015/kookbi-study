package day20;

interface NoName1{
	
	public void getInfo();
}

public class NoNameTest {

	public static void main(String[] args) {
		
//		NoName1 nn1= new NoName1() {
//		public void getInfo() {
//			System.out.println("익명클래스로 재정의한 기능!");
//		}
//	};
	NoName1 nn1=()->{System.out.println("람다식으로 재정의함");};  // 람다식
	nn1.getInfo();
	}
}
