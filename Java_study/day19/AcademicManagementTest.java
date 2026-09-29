package day19;

import java.io.*;

abstract class Register{
	String name;
	int age;
	String major;
	
	abstract public void getInfo() throws IOException; 
}

class TeacherRegister extends Register{
	BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));

	public void getInfo() throws IOException {
		System.out.println("==선생님정보 입력==");
		System.out.print("이름:");
		name = br.readLine();
		System.out.print("나이:");
		age = Integer.parseInt(br.readLine());
		System.out.print("과목:");
		major = br.readLine();
	}
}

class StudentRegister extends Register{
	BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));
	
	public void getInfo() throws IOException {
		System.out.println("==학생정보 입력==");
		System.out.print("이름:");
		name = br.readLine();
		System.out.print("나이:");
		age = Integer.parseInt(br.readLine());
		System.out.print("전공:");
		major = br.readLine();
	}
}

interface InterPrint{
	public void print();
}

class TeacherPrint extends TeacherRegister implements InterPrint{

	public void print() {
		System.out.println("==선생님정보==");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("과목:"+major);
	}
}

class StudentPrint extends StudentRegister implements InterPrint{

	public void print() {
		System.out.println("==학생정보==");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("전공:"+major);
	}
}


public class AcademicManagementTest {
	
	private static TeacherPrint[] Register;

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
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
		Register arr[]= new Register[10];
		int count = 0;
		int i;
		do { 
			System.out.print("메뉴>");
			i = Integer.parseInt(br.readLine());
				switch(i) {
				case 1: 
				TeacherPrint tp =new TeacherPrint();
				if (count==10) {
					System.out.println("더이상 입력할 수 없습니다.");
					break;
				}
				tp.getInfo(); 
				arr[count++]=tp;
				break;
				case 2: 
				StudentPrint sp =new StudentPrint();
				if (count==10) {
					System.out.println("더이상 입력할 수 없습니다.");
					break;
				}
				sp.getInfo();
				arr[count++]=sp;
				break;
				case 3: for(int j=0; j<count; j++) {
					if(arr[j] instanceof TeacherPrint) {
						((TeacherPrint)arr[j]).print();
					}
					} break;
				case 4:for (int j = 0; j < count; j++) {
					if (arr[j] instanceof StudentPrint) {
						((StudentPrint) arr[j]).print();
					}
					} break;
				case 5: for(int j=0; j<count; j++) {
					((InterPrint) arr[j]).print();
				}break;
				}
			
		}while(i!=6);
		
		
	}

}
