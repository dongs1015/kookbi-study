package day14;

public class Car {
	
	String color;
	String carname;
	String wheels;
	String name;
	
	public Car() {
		System.out.println(color+" "+carname+" "+wheels+" "+name);
	}
	public void forwardCar() {
		System.out.println(wheels+"개의 바퀴가 달리고 "+color+"색"+carname +" 차주 "+name+"이 전진합니다.");
	}
	
	public void reverseCar() {
		System.out.println(wheels+"개의 바퀴가 달리고 "+color+"색"+carname+" 차주 "+name+"이 후진합니다.");
	}
	
	public void getinfo() {
		System.out.println(color+"색 "+carname+" "+wheels+"개의바퀴 "+"차주"+name);
	}
}
