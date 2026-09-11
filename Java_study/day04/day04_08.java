package day04;

import java.io.*;
import java.text.DecimalFormat;

public class day04_08 {

	public static void main(String[] args)
	throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("국어:");
		String num1_1=br.readLine();
		int num1 =Integer.parseInt(num1_1);
		
		System.out.print("영어:");
		String num2_2=br.readLine();
		int num2 = Integer.parseInt(num2_2);
		
		System.out.print("수학:");
		String num3_3= br.readLine();
		int num3 = Integer.parseInt(num3_3);
		
		int sum = num1 + num2 + num3;
		double avg = sum/3.0;
		System.out.println("총점:"+sum);
		System.out.println("평균:"+(avg));
		System.out.printf("평균:%.2f점\n", avg);
		
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("#.00");
		System.out.println("평균:"+df.format(avg)+"점");
	}

}
