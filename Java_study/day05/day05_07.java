package day05;

import java.io.*;

public class day05_07 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("문자 입력 프로그램");
		System.out.println("숫자,영문자,기타문자 적어주세요");
		
		int user = System.in.read();
		
		if (user > 47 && user < 58) {
			System.out.println("입력한"+(user-48)+"은 숫자입니다.");
		}else if((user > 64 && user <91)||(user>96 && user<123)) {
			System.out.println("입력한"+(char)user+"은 영문자입니다.");
		}else {
			System.out.println("입력한"+(char)user+"은 기타문자입니다.");
		}
		

	}

}
