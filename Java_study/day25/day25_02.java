package day25; //day22_03 교수님버전 분석중부분을 느리게만듬

import java.util.*;

public class day25_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("E-mail입력:");
		String user=sc.nextLine();
		
		int position=user.indexOf("@");
		String id=user.substring(0, position);
		String domain=user.substring(position+1);
		
		String str="==분석중...=="; // 분석중을 1초씩 걸리고 천천히나오게함
		try {
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i));
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n아이디"+id);
		System.out.println("도메인:"+domain);

	}

}
//String str[]= {"-","/","|","\\"};
//for(int j=0;j<5; j++) {
//	for(int i=0; i<str.length; i++) {
//		System.out.print(str[i]+"\r");
//		try {
//				Thread.sleep(1000);
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//	}
//} cmd에서 출력할수있는 문