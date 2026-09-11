package day07;

import java.io.*;

public class day07_13 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		while(true) {
		int user =0;
		
		do {
			System.out.print("비밀번호:");
			user = Integer.parseInt(br.readLine());
		}while(user != 1234);
				
		if (user==1234);{
			System.out.println("비밀번호가 맞습니다");
			System.exit(0);
		}
		
		}
		
	}

}
