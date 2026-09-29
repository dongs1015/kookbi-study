package day19;

class Human{
	String name;
	int age;
	
	public void getInfo() {
		System.out.println("저는"+name+"이며,"+age+"살 입니다.");
	}
}

class Fly{
	public void flying() {
		System.out.println("나는 난다");
	}
}

class Bug{
	String name;
	String type;
	
	public void getInfo() {
		System.out.println("저는"+type+"타입의 "+name+"입니다.");
	}
}

class SuperMan extends Human implements InterFly{
	
	int speed;
	
	public void getInfo() {
		super.getInfo();
		System.out.println("저의 속도는 " +speed+"로 달릴수 있습니다.");
		flying();
	}
	
	public void flying() {
		System.out.println("슈퍼맨이 날아다닙니다.");
	}
}

interface InterFly{
	public void flying();
}

class ButterFly extends Bug implements InterFly{
	public ButterFly(String name,String type){
		this.name = name;
		this.type = type;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("저는 꽃을 좋아합니다~");
		flying();
	}
	
	public void flying() {
		System.out.println("호랑나비가 날아다닙니다.");
	}
}
public class InterTest1 {

	public static void main(String[] args) {
		SuperMan sm=new SuperMan();
		sm.name="클락켄트";
		sm.age=30;
		sm.speed=140;
		sm.getInfo();
		
		ButterFly bf=new ButterFly("호랑나비", "나방계열");
		bf.getInfo();
		
		InterFly arr[]= new InterFly[2];
		arr[0]=sm;
		arr[1]=bf;
		
		for(int i=0; i<arr.length; i++) {
			arr[i].flying();
		}
	}
}
