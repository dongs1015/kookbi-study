package day21; //apitest 교수님버전

import java.io.*;
import java.util.*;
public class day21_01 {

	public static void main(String[] args) 
	throws IOException{
//		BufferedReader br=
//		new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문장입력: ");
		String str= sc.nextLine();// br.readLine();
		System.out.print("찾을문자:");
 //		int find=br.read(); // 아스키코드
		String find_s=sc.nextLine();
		char find=find_s.charAt(0);
		
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char temp=str.charAt(i);
			if(temp==find) {
				count++;
			}
		}
		System.out.println("총"+find+"는"+count+"개 발견되었습니다.");
		
	}

}
// next, nextline 문장끝을 공백, 