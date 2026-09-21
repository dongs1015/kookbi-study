package day15;

public class Year {
	int year;
	
	public Year() {
		year=0;
	}
	
	public Year(int year) {
		this.year = year;
		
	}

	public void getInfo() {
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
	
		}else {
			System.out.println(year+"년은 평년입니다");
		}
	}

	public void getInfo(int year) {
		this.year=year;
		this.getInfo();
	}
}
