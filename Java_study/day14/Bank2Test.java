package day14; //강사님

public class Bank2Test {

	public static void main(String[] args) {
		
		System.out.println("프로그램의 시작");
		
		Bank2 b1 =new Bank2();
		b1.acname="홍길동";
		b1.acnum="111-111";
		b1.bankSave(10000);
		b1.bankLoad(3000);
		
		Bank2 b2 = new Bank2();
		b2.acname="둘리";
		b2.acnum="222-222";
		b2.bankSave(50000);
		b2.bankLoad(5000);
		System.out.println("------------------");
		b1.getInfo();
		System.out.println("------------------");
		b2.getInfo();
		System.out.println("------------------");
		
		Bank2.iyul=0.1;
		b1.getInfo();
		System.out.println("------------------");
		b2.getInfo();
		
		System.out.println("프로그램의 끝");

	}

}
