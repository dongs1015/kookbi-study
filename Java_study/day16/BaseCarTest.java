package day16;

public class BaseCarTest {

	public static void main(String[] args) {
		BaseCar car1=new BaseCar();
		car1.name="연습카트";
		car1.maxspeed=140;
		car1.getInfo();
		
		System.out.println("=======================");
		
		Gadian car2=new Gadian("가디언",160,"황금아이템");
		car2.getInfo();
		
		System.out.println("=======================");
		
		BlackShark car3=new BlackShark("블랙샤크",160,"가속");
		car3.getinfo();
	}
}
