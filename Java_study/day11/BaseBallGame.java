package day11;

import java.io.*;

public class BaseBallGame {

	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("================");
		System.out.println("숫자 야구 게임v1.0");
		System.out.println("================");
		int arr[] = new int [3];
		int com=0;
		boolean a;
		
		
		do {
			a=true;
			for(int i=0; i<3; i++) {
				com = (int)(Math.random()*9)+1;
				arr[i] = com;
			}
			
			for(int i =0; i<3; i++) { 
				for(int j=0; j<10; j++) {
					
					System.out.print(j+1+"회차:");
					String user = br.readLine(); 
					if(arr[i]==com) {
						System.out.println("스트라이크입니다");
					} else if(arr[i] != com) {
						System.out.println("볼입니다.");
					}
					
			}
			

			}
		}while(a);
		
		for(int i=0; i<3; i++) {
			System.out.print(a);
		}
		
		

	}

}
