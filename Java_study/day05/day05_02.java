package day05;

import java.io.*;

public class day05_02 {

	public static void main(String[] args)
	throws IOException {
		
		System.out.print("첫번째 수:");
		int num1=System.in.read()-48;
		System.in.skip(2);
		System.out.print("두번째 수:");
		int num2=System.in.read()-'0';
		
		if(num2==0) {
			System.out.println("0으로는 나눌수 없습니다.");
			System.exit(0);
		}
		
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		

	}

}
