package day05;

import java.io.*;	

public class day05_09 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
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
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		
		if(avg >= 90 && avg <= 100) {
			System.out.print("등급:A");
		} else if(avg<=89 && avg >= 80) {
			System.out.println("등급:B");
		} else if(avg<=79 && avg >= 70) {
			System.out.println("등급:C");
		} else if(avg<=69 && avg >= 60) {
			System.out.println("등급:D");
		} else {
			System.out.println("등급:F");
		}
		
	}

}
