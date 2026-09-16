package day12;

import java.io.*;

public class day12_05 {
	
	public static void greeting(String a, int b) {
		for(int i=0; i<b; i++) {
			System.out.println("안녕하세요 "+a+"!");
		}
	}

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)); 
		
		System.out.print("이름:");
		 String a =br.readLine();
		 System.out.print("횟수:");
		 int b= Integer.parseInt(br.readLine());
		 greeting(a,b);

	}

}
