package day06;

import java.io.*;

public class day06_03 {

	public static void main(String[] args)
	throws IOException{
			
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어:");
		String num1_1 = br.readLine();
		int num1 = Integer.parseInt(num1_1);
		
		System.out.print("수학:");
		String num2_2 = br.readLine();
		int num2 = Integer.parseInt(num2_2);
		
		System.out.print("국어:");
		String num3_3 = br.readLine();
		int num3 = Integer.parseInt(num3_3);
		
		int sum = num1 + num2 + num3;
		
		double avg = sum /3.0;
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		
		char level = 'F';
		switch ((int)avg/10) {
		case 10: 
		case 9: level='A';break;
		case 8: level='B';break;
		case 7: level='C';break;
		case 6: level='D';break;
		default: level='F';break;
		}
		System.out.println("등급:"+level);
	}

}
