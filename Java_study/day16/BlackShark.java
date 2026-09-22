package day16;

public class BlackShark extends BaseCar{
	
	String skil;
	
	public BlackShark(String name, int speed,String skil) {
		this.name = name;
		this.maxspeed = speed;
		this.skil = skil;
	}
	
	public void getinfo() {
		super.getInfo();
		System.out.println("스킬:"+skil);
	}
	
	public void getInfo(String title) {
		System.out.println(title);
		this.getinfo();
	}
	
	
}
