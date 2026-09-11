package day04;

import java.io.*;

public class day04_07 {

	public static void main(String[] args)
	throws IOException	{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("첫번째 수:");
		String num1_s=br.readLine();
		int num1=Integer.parseInt(num1_s);

		
		System.out.print("두번째 수:");
		String num2_s=br.readLine();
		int num2 = Integer.parseInt(num2_s);
	
		System.out.println(num1+"+"+num2+"="+(num1+num2));


	}

}
