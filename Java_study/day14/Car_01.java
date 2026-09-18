package day14;

public class Car_01 {
	
	//멤버변수
	String carcolor;
	String carname;
	int tire;
	String ownername;
	

	//멤버메서드
	//전진
	public void goCar() {
		System.out.println(carcolor+"색상의"+carname+"앞으로 갑니다.");
	}
	//후진
	public void backCar() {
		System.out.println(carcolor+"색상의"+carname+"뒤로 갑니다.");
	}
	//getInfo
	public void getInfo() {
		System.out.println("차 색상"+carcolor);
		System.out.println("차 이름"+carname);
		System.out.println("바퀴수"+tire);
		System.out.println("차주이름"+ownername);
	}
	
	
}