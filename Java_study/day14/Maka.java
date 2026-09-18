package day14; 

public class Maka {
		
	//물건을 대표하는 값-멤버 변수 메서드랑 자리는 바뀔수 없음
	String color;
	
	public Maka() {
		color="검정";
	}
	//물건이 할수 있는 행위-멤버 메서드
	public void writeMaka() {
		System.out.println(color+"색상의 마카로 글을씁니다.");
	}
	
	
}
