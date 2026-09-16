package day12;

import java.io.*;

public class day12_04 {

	public static void gugu(int arr) {
		for(int i=1; i<=9; i++) {
			System.out.println(arr+"*"+i+"="+arr*i);
		}
	}
	
	
	public static void main(String[] args) 
	throws IOException{
		System.out.print("단입력:");
		int arr = System.in.read()-48;
		gugu(arr);
	}

}
// S H 둘다 S에 