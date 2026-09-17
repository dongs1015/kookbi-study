package day13;// 강사님버전

import java.io.*;

public class day13_02_01 {
	
	 // 1.메뉴 출력
	public static void printMenu() {
		System.out.println("========================");
		System.out.println("가위 바위 보 게임 v2.0");
		System.out.println("------------------------");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("========================");
	} 

	// 2. 사용자가 값을 입력
	public static int inputUser()throws IOException{
		System.out.print("메뉴:");
		int user=System.in.read()-48;
		System.in.skip(2);
		return user;
	}
	// 5.승패 비지니스 로직
	public static void gameResult(int user,int com) {
		if(user==com) {
			System.out.println("비겼음!");
		}else if((user+1)%3==com%3) {
			System.out.println("컴퓨터 승!");
		}else {
			System.out.println("사용자 승!");
		}
	}
	public static void main(String[] args) 
	throws IOException{
		
		while(true) {
		//1.메뉴출력
		printMenu();
		//2.사용자가 값을입력
		int user=inputUser();
		if (user==4) {
			System.out.println("=프로그램을 종료합니다=");
			System.exit(0);
		}
		//3.입력한 값 출력
		System.out.println("사용자:"+user);
		//4.컴퓨터 난수 발생
		int com=(int)(Math.random()*3+1);
		System.out.println("컴퓨터:"+com);
		//5.승패 비지니스 로직
		gameResult(user, com);
	}
	}

}
