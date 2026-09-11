package day07;

import java.io.*;

public class day07_14 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		while(true) {
		int user = 0;
		
		
		do {
			System.out.print("숫자입력:");
			user = Integer.parseInt(br.readLine());
			if (user>45){
				System.out.println("다운입니다");
			}else if(user<45){
				System.out.println("업입니다");
			}
		}while(user != 45);
				
		if(user==45) {
			System.out.println("정답입니다");
			System.exit(0);
		}
	}
	}
}
