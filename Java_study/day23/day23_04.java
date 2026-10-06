package day23;

import java.util.*;

public class day23_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println("==To-DoList==");
		System.out.println("1.일정추가");
		System.out.println("2.일정삭제");
		System.out.println("3.일정 전체 목록");
		System.out.println("================");
		
		do {
			System.out.print("메뉴>");
			String List = sc.nextLine();
		switch(List) {
		case "1":
			System.out.print("1.마지막 추가 2.중간에삽입:");
			String sert = sc.nextLine();
			if(sert.equals("1")) {
			System.out.print("일정:"); 
			arr.add(sc.nextLine());
			}else {
				System.out.print("번호:");
				int k = Integer.parseInt(sc.nextLine());
				System.out.print("일정:");
				String ma = sc.nextLine();
				arr.add(k, ma);
			}
			
		break;
		case "2": 
			for(int i=0; i<arr.size(); i++) {
				System.out.print(arr.get(i)+" ");
			}
			System.out.print("삭제리스트:");
			arr.remove(sc.nextLine());
			break;
		
		case "3":
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i));
			}
			break;
		
		}
		}while(true);
	}

}
