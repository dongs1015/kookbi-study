package day04;

import java.io.*;

public class day04_04 {

	public static void main(String[] args)
	throws IOException{
		
		System.out.print("첫번째 값:");
		int a = System.in.read();
		System.in.skip(2);
		
		System.out.print("두번째 값:");
		int b = System.in.read();
		System.in.skip(2);
		
		System.out.print("세번째 값:");
		int c = System.in.read();
		System.in.skip(2);
		
		System.out.println("a="+a + "/b="+ b+ "/c="+c);

	}

}
