package day14;

public class CarTest_01 {

	public static void main(String[] args) {
		
		Car_01 c1=new Car_01();
		c1.carcolor="빨강";
		c1.carname="그랜져";
		c1.tire=6;
		c1.ownername="둘리";
		c1.goCar();
		c1.backCar();
		c1.getInfo();
		System.out.println("-----------------");
		
		
		Car_01 c2 = new Car_01();
		c2.carcolor="파랑";
		c2.carname="액티언";
		c2.tire=8;
		c2.ownername="홍길동";
		c2.goCar();
		c2.backCar();
		c2.getInfo();
	}
		
}
