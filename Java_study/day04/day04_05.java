package day04;

import java.io.*;

public class day04_05 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("첫번째 수:");
		int a = System.in.read()-'0';
		System.in.skip(2);
		
		System.out.print("두번째 수:");
		int b = System.in.read()-'0';
		System.in.skip(2);
		
		int sum = a + b;
		System.out.println(a+"+"+b+"="+sum);

		
	}

}
