package day08;
//교수님버전
import java.io.*;

public class Game4 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("======================");
		System.out.println("가위 바위 보 게임v1.0");
		System.out.println("----------------------");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("======================");
		int user=0;
		do {
		System.out.print("메뉴>");
			user=System.in.read()-48;
			System.in.skip(2);
		}while(!(user>=1&&user<=4));
		
		if (user==4) {
			System.out.println("=프로그램을 종료합니다=");
			System.exit(0);
		}
		System.out.println("사용자:"+user);
		
		int com=(int)(Math.random()*3+1);
		System.out.println("컴퓨터:"+com);
		
/*		//비즈니스로직파트
		switch(user-com) {
		case 0:System.out.println("비겼음");break;
		case 1:case -2:System.out.println("사용자가 이겼음!");break;
		case 2:case -1:System.out.println("컴퓨터가 이겼음!");break;
*/		
		
		if(user==com) {
			System.out.println("비겼음!");
		}else if((user+1)%3==com%3) {
			System.out.println("컴퓨터 승!");
		}else {
			System.out.println("사용자 승!");
		}
	
	}
			 	
}
