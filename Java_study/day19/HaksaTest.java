package day19; // 교수님버전

import java.io.*;

class Human{
	String name;
	int age;
	
	public void setInfo(BufferedReader br) throws IOException{ // 다양한 방법중 하나 매개변수로 받기
		System.out.print("이름:");
		name=br.readLine();
		System.out.print("나이");
		age=Integer.parseInt(br.readLine());
	}
	public void getInfo() {
		System.out.println("이름"+name);
		System.out.println("나이:"+age);
	}
}
//선생님
class Teacher extends Human{
	String text;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("===선생님 정보입력===");
		super.setInfo(br);
		System.out.println("과목:");
		text=br.readLine();
	}
	
	@Override
	public void getInfo() {
		System.out.println("===선생님 정보===");
		super.getInfo();
		System.out.println("과목:"+text);
	}
}
//학생
class Student extends Human{
	String major;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("===학생 정보입력===");
		super.setInfo(br);
		System.out.println("전공:");
		major=br.readLine();
	}
	
	@Override
	public void getInfo() {
		System.out.println("===학생 정보===");
		super.getInfo();
		System.out.println("전공:"+major);
	}
}

public class HaksaTest {

	Human arr[]; // 객체정보 10개를 생성하면 랭스를 사용할때 없는것도 불러올수있음
	int count;//객체 저장횟수
	
	public HaksaTest() {
		arr=new Human[10];
		count=0;
	}
	
	//메뉴 출력 관련 메서드
	public void printMenu() {
		System.out.println("=====================");
		System.out.println("학사관리프로그램 v1.0");
		System.out.println("=====================");
		System.out.println("1.선생님 등록");
		System.out.println("2.학생등록");
		System.out.println("3.선생님 정보보기");
		System.out.println("4.학생 정보보기");
		System.out.println("5.모든 정보보기");
		System.out.println("6.종료");
		System.out.println("=====================");
	}
	
	//선생님 정보 등록관련 메서드
	public void inputTeacher(BufferedReader br)throws IOException{
		
		if(count>=10) {
			System.out.println("더이상 입력하실수 없습니다.");
			return;
		}
		arr[count]=new Teacher();
		arr[count].setInfo(br);
		count++;
	}
	//학생 정보 등록관련 메소드
	public void inputStudent(BufferedReader br)throws IOException{
		
		if(count>=10) {
			System.out.println("더이상 입력하실수 없습니다.");
			return;
		}
		arr[count]=new Student();
		arr[count].setInfo(br);
		count++;
	}
	// 모든 정보 출력관련 메서드
	public void allInfoPrint() {
		for(int i =0; i<count; i++) {
			arr[i].getInfo();
		}
	}
	//선생님 정보출력
	public void teacherInfoPrint() {
		for(int i=0; i<count;i++) {
			if(arr[i]instanceof Teacher) {
				arr[i].getInfo();
			}
		}
	}
	//학생 정보출력
	public void studentInfoPrint() {
		for(int i=0; i<count;i++) {
			if(arr[i]instanceof Student) {
				arr[i].getInfo();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		
		HaksaTest ht=new HaksaTest();
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		//인자생성자를 호출해서 만드는중
		while(true) {	
			ht.printMenu();
			System.out.print("메뉴>");
			int user=Integer.parseInt(br.readLine());
		
			switch(user) {
			case 1:ht.inputTeacher(br);break;
			case 2:ht.inputStudent(br);break;
			case 3:ht.teacherInfoPrint();break;
			case 4:ht.studentInfoPrint();break;
			case 5:ht.allInfoPrint();break;
			case 6:System.out.println("==프로그램을 종료합니다==");
			System.exit(0);
		}
	}
	}

}
