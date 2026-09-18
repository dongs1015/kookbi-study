package day14;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.color = "하얀색";
		c.carname="아반떼";
		c.wheels="4";
		c.name="무명";
		System.out.println("----------------");
		
		Car c1 = new Car();
		c1.color="빨강";
		c1.carname="람보르기니";
		c1.wheels="4";
		c1.name="홍길동";
		c1.forwardCar();
		
		System.out.println("----------------");
		Car c2 = new Car();
		c2.color="검정";
		c2.carname="벤츠";
		c2.wheels="4";
		c2.name="김서준";
		c2.reverseCar();
		
		System.out.println("----------------");
		Car c3 = new Car();
		c3.color="빨강";
		c3.carname="BMW";
		c3.wheels="4";
		c3.name="표어진";
		c3.forwardCar();
		
		System.out.println("----------------");
		Car c4 = new Car();
		c1.color="분홍";
		c1.carname="페라리";
		c1.wheels="6";
		c1.name="도로롱";
		c1.getinfo();

		
	}

}
