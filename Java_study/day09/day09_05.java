package day09;

import java.io.*;

public class day09_05 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int score = 0;
		System.out.print("점수를 입력해주세요:");
		score = Integer.parseInt(br.readLine());
		System.out.println(score);

	}

}
