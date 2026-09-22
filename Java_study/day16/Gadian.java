package day16;

public class Gadian extends BaseCar{

	String item;
	
	public Gadian(String name,int speed,String item) {
		this.name = name;
		this.maxspeed=speed;
		this.item = item;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("아이템:"+item);
	}
	
	public void getInfo(String title) {
		System.out.println(title);
		this.getInfo();
	}
}
