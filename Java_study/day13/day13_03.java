package day13;

import java.io.*;

public class day13_03 {

	public static void comRan(int com[]) {
		for(int i=0; i<com.length; i++) {
			com[i]= (int)(Math.random()*9)+1;
				for(int j=0; j<i; j++) {
					if(com[j]==com[i]) {
						i--;
						break;
					}
			}
		}
	}
	
	public static void inPut(int com[],int user[]) 
	throws IOException{
			for(int z=1; z<10; z++) {
			
			System.out.print(z+"회차 입력: ");
			for(int i=0; i<user.length;i++) {
				user[i]=System.in.read()-48;
			}
			System.in.skip(2);
			
			System.out.print("사용자 입력값:");
			for(int i=0; i<user.length; i++) {
				System.out.print(user[i]+" ");
			}
			
			int strike=0;
			int ball=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<com.length; j++) {
					if(user[j]==com[i]&&j==i) {
						strike++;
					}else if(user[j]==com[i]&&i!=j) {
						ball++;
					}
				}
			}
			
			System.out.println("\n"+strike+"스트라이크"+ball+"볼");
			if(strike==3) {
				System.out.println("정답입니다.");
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}
	
	
	public static void main(String[] args) 
	throws IOException{
		//메뉴 출력
		System.out.println("==================");
		System.out.println("숫자 야구 게임 v2.0");
		System.out.println("==================");
		
		
		int com[]= new int[3];
		int user[] = new int[3];
		comRan(com);
		inPut(com, user);
		
		
		System.out.println("10번의 기회를 모두 소진하셨습니다");
		System.out.println("==프로그램을 종료합니다==");
		
	}

}
