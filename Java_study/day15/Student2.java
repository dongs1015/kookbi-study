package day15;

public class Student2 {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public void getInfo() {
		System.out.print(name+"    "+kor+"  "+eng+"  "+math);
	}
}
