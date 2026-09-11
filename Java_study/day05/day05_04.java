package day05;

import java.io.*;

public class day05_04 {

	public static void main(String[] args) 
	throws IOException{
	
		System.out.println("첫번째 수:");
		int num = System.in.read()-48;
		System.in.skip(2);
		
		if(num%2 == 0) {
			System.out.println(num+"은짝수입니다.");
		} else {
			System.out.println(num+"은홀수입니다");
		}
		
		

	}

}
