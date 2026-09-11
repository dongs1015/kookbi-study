package day06;

import java.io.*;	

public class day06_01{

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어:");
		String num1_1 = br.readLine();
		int num1 = Integer.parseInt(num1_1);
				
		System.out.print("영어:");
		String num2_2 = br.readLine();
		int num2 = Integer.parseInt(num2_2);
		
		System.out.print("수학:");
		String num3_3 = br.readLine();
		int num3 = Integer.parseInt(num3_3);
		
		int sum = num1 + num2 + num3;
		
		int avg = sum /3;
		
		System.out.println("총점:"+sum+"점");
		System.out.println("평균:"+avg+"점");
		
		char level='F';
		if(avg >= 90) {
			level='A';
		} else if(avg >= 80) {
			level='B';
		} else if(avg >= 70) {
			level='C';
		} else if(avg >= 60) {
			level='D';
		} else {
			level='F';
		}
		System.out.println("등급:"+level);
		
	}

}
