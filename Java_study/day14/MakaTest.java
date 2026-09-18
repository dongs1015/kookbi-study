package day14;

public class MakaTest {

	public static void main(String[] args) {
		System.out.println("==프로그램의 시작==");
		
		Maka m1 = new Maka();
		m1.color="빨강";
		m1.writeMaka();
		
		Maka m2 =new Maka();
		m2.color="노랑";
		m2.writeMaka();
		
		Maka m3 = new Maka();
		m3.color="파랑";
		m3.writeMaka();
		
		m1.writeMaka();
		
		Maka m4 =new Maka();
		m4.writeMaka();
		
		System.out.println("==프로그램의 끝!==");

	}

}
