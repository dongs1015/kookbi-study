package day05;

import java.io.*;

public class day05_08 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		System.out.println("년도 입력:");
		String year1 = br.readLine();
		int year = Integer.parseInt(year1);
		
		if ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0){
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		

	}

} 
