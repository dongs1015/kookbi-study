package day08;

import java.io.*;

public class Game {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		int user = 0;
		int com = 0;
		System.out.println("======================");
		System.out.println("가위 바위 보 게임v1.0");
		System.out.println("----------------------");

		while(true) {
			System.out.println("1.가위 2.바위 3.보 4.종료");
			System.out.println("======================");
			System.out.print("메뉴>");
			user = Integer.parseInt(br.readLine());
			com = (int)(Math.random()*3)+1;
			if(user==4) {
				System.out.println("가위바위보게임을 종료합니다");
				System.exit(0);
			
			}
			if(user==com) {
				System.out.println("사용자:"+user);
				System.out.println("컴퓨터:"+com);
				System.out.println("무승부입니다");
			}else if((user==1 && com==2)||(user==2 && com==3)||(user==3&&com==1))
			{
				System.out.println("사용자:"+user);
				System.out.println("컴퓨터:"+com);
				System.out.println("컴퓨터 승");
			}else if((user==2 && com==1)||(user==3 && com==2)||(user==1 && com==3)) 
					{
				System.out.println("사용자:"+user);
				System.out.println("컴퓨터:"+com);
				System.out.println("사용자 승");
			}
	}
	}
}
/*
 if (user == com) {
 	System.out.println("무승부입니다");
  } else if ((com == user+1)|| (com==1 &&user==3)){
  System.out.println("컴퓨터승");
  }else if ((user== com+1)||(user==1 && com==3)){
  System.out.println("사용자승");
  } 
 */


