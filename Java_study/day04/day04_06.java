package day04;

import java.io.*;

public class day04_06 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		
		System.out.print("학생의 이름을 입력하세요:");
		String str=br.readLine();
		
		System.out.println("당신의 이름은" +str+"이 맞습니까?");
	}

}
