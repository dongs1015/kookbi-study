package day08;

import java.io.*;
public class day08_01 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==비밀번호 입력 프로그램==");
		int pwd=0;
		
		do {
			System.out.print("비밀번호:");
			pwd=Integer.parseInt(br.readLine());
		}while(pwd!=1234);
		
		System.out.println("입장을 환영합니다");
		
	}

}
