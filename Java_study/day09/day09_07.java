package day09;

import java.io.*;

public class day09_07 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		
		System.out.print("몇명의 학생점수 입력: ");
		int count = Integer.parseInt(br.readLine());
		
		
		int x[] = new int [count];
		int sum =0;
		
		for(int i=0; i<x.length;i++) {
			System.out.print(x[i]+"번학생:");
			x[i] = Integer.parseInt(br.readLine());
			sum += x[i];
		}
		System.out.println("총점:"+sum);
		double avg = (double)(sum/x.length);
		System.out.println("평균:"+avg);


	}

}
