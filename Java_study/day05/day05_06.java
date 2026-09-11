package day05;

import java.io.*;

public class day05_06 {

	public static void main(String[] args)
	throws IOException{
		
		System.out.println("문자 입력 프로그램");
		System.out.println("f  m  s  b 4개중 고르시오");
		
		int a = System.in.read();
		
		if(a == 'f' || a == 70) {
			System.out.println("Father");
		}else if(a == 109 || a == 77) {
			System.out.println("Mother");
		}else if(a == 98 || a== 66)	{
			System.out.println("Brother");
		}else if(a == 115 || a== 83){
			System.out.println("Sister");
		}else {
			System.out.println("보기 중에서 적어주세요");
		}
	}

}
