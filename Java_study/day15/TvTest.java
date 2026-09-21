package day15;

public class TvTest {

	public static void main(String[] args) {
		
		
		Tv t1 =new Tv();
		t1.rgb=60;
		t1.mi=40;
		t1.ri=70;
		t1.getInfo();
		System.out.println("---------------------");

		Tv t2 = new Tv();
		t2.getInfo();
		System.out.println("---------------------");
		
		Tv t3= new Tv(70);
		t3.getInfo();
		System.out.println("---------------------");
		
		Tv t5= new Tv(30,80);
		t5.getInfo();
		System.out.println("---------------------");
		
		Tv t4=new Tv(70, 40, 60);
		t4.getInfo("나의 Tv");
		System.out.println("---------------------");
		
		
		
	}

}
