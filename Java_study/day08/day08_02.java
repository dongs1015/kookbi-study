package day08;

import java.io.*;

public class day08_02 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==업 다운 게임==");
		int user=0;
		do {
		System.out.print("숫자를 맞춰보세요:");
		user = Integer.parseInt(br.readLine());
		if(user<45) {
			System.out.println("업입니다.");
		}else if(user>45) {
			System.out.println("다운입니다.");
		}
		}while(user!=45);
		
		if(user==45) {
			System.out.println("맞췄습니다.");
		}
	}
	

}
