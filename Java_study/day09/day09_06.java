package day09;

import java.io.*;

public class day09_06 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		
		int x[]= {0,0,0,0,0,0};
		System.out.print("6개의 점수를 입력해 주세요:");
		
		
		int y[] = x;
		for(int i =0; i<y.length; i++) {
			y[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<y.length;i++) {
			System.out.println(y[i]+" ");
		}

	}

}
