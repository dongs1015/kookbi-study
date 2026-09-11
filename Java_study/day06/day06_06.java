package day06;

import java.io.*;

public class day06_06 {

	public static void main(String[] args) 
	throws IOException{
	
		
		System.out.print("단입력:");
		int n = System.in.read()-48;
		
		for(int i=1; i<=9; i++) {
			System.out.println(n+"*"+i+ "=" +(n*i));
		}

	}

}
