package day04;

import java.io.*;

public class day04_09 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("반지름 입력:");
		String a_1 = br.readLine();
		double a = Double.parseDouble(a_1);
		
		
		double area = a * a * 3.14;
		
		System.out.println("원의넓이:"+area);
				

	}

}
