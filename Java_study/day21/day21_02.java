package day21;

import java.util.*;

public class day21_02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); // BufferedReader or InputStreamReader 보조스트림
		
		System.out.print("문장입력:");
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
