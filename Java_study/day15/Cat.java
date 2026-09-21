package day15;

public class Cat {
	
	String name;
	int age;
	String type;
	
	public Cat() {
		name="나비";
		age= (2+'살');
		type="코리안숏";
	}
	
	public Cat(String a) {
		this();
		name=a;
	}
	
	public Cat(String a, int b) {
		this(a);
		age=b;
	}
	
	public Cat(String a, int b,String c) {
		this(a,b);
		type=c;
	}
	
	public void getInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("품종:"+type);
	}
	
	public void getInfo(String title) {
		System.out.println(title);
		this.getInfo();
	}
	
}
