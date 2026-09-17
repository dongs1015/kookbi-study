package day13;

import java.io.*;

public class day13_02 {

	public static int inputArr(int user, int com) 
	throws IOException{
		int result = 0;
		System.out.print("메뉴:");
		user=System.in.read()-48;
		System.in.skip(2);
		if(user==4) {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
		System.out.println("사용자:"+ user);
		com=(int)(Math.random()*3+1);
		System.out.println("컴퓨터:"+com);
		
		
		return result;
	}
	
	public static void main(String[] args) 
	throws IOException{
		
		int user =0;
		int com =0;
		System.out.println("가위바위보 게임 v2.0");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		while(true) {
			
			inputArr(user, com);
			
			if (user == com) {
				System.out.println("비겼음");
			}else if((user+1)%3==com%3) {
				System.out.println("컴퓨터 승");
			}else {
				System.out.println("사용자 승");
			}
		}
		
		
	}

}
