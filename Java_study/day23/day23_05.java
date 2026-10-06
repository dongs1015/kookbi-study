package day23;

import java.util.*;

public class day23_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		while(true) {
			System.out.println("==영단어장==");
			System.out.println("1.단어입력");
			System.out.println("2.단어찾기");
			System.out.println("3.종료");
			System.out.println("================");
			System.out.print("메뉴>");
			int menu= sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: 
				System.out.println("==단어 입력==");
				System.out.print("단어:");
				String word = sc.nextLine();
				System.out.print("뜻:");
				String mean = sc.nextLine();
				map.put(word,mean);
				break;
			case 2: 
				int s = map.size();
				if(s!=0) {
				System.out.print("찾을단어:");
				String str =sc.nextLine();
				String result=map.get(str);
				if(result != null) {
					System.out.println(str+"단어의 뜻:"+result);
				}else {
					System.out.println("등록된 단어가 없습니다.");
				}}else {
					System.out.println("단어를 먼저 입력해주세요");
				}
				break;
			case 3: System.exit(0);
			}
		}
	}

}
