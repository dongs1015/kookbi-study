package day23; //교수님버전

import java.util.*;

public class day23_04_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); // 입력도구
		
		ArrayList<String> arr= new ArrayList<String>(); // 저장도구
		
		while(true) {
		System.out.println("==To-DoList==");
		System.out.println("1.일정추가");
		System.out.println("2.일정삭제");
		System.out.println("3.일정 전체 목록");
		System.out.println("4. 종료");
		System.out.println("================");
		System.out.print("메뉴>");
		int menu= sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: 
			System.out.println("1.마지막에 추가 2.중간에 삽입");
			int user=sc.nextInt();
			sc.nextLine();
			if(user==1) {
				System.out.print("일정:");
				String str=sc.nextLine();
				arr.add(str);
			}else {
				System.out.print("몇번?:");
				int pos = sc.nextInt();
				sc.nextLine();
				System.out.print("일정:");
				String str = sc.nextLine();
				arr.add(pos-1, str);
			}
			
			break;
		case 2: 
			System.out.print("삭제할 번호:");
			int delNum=sc.nextInt();
			arr.remove(delNum);
			break;
		case 3:
			System.out.println("==전체 일정 출력==");
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i));
			}
			break;
		case 4: System.out.println("==프로그램 종료");
		System.exit(0);
		}
	}
	}
}
