package day13; // 강사님버전

import java.io.IOException;

public class day13_03_01 {

	//컴퓨터 중복난수
	public static int[] comRandom() {
		int com[] = new int[3];
		for(int i=0; i<com.length;i++) {
			com[i]=(int)(Math.random()*9+1);
			for(int j=0; j<i; j++) {
				if(com[j]==com[i]) {
					i--;
					break;
				}
			}
		}
		return com;
	}
	
	public static void arrPrint(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//타이틀 출력 관련 메서드
	public static void printTitle() {
		System.out.println("==================");
		System.out.println("숫자 야구 게임v2.0");
		System.out.println("==================");
	}
	
	public static int[] inputUser(int count)
	throws IOException{
		System.out.print(count+1+"회차 입력:");
		int user[] = new int[3];
		for(int i=0; i<user.length; i++) {
			user[i]=System.in.read()-48;
		}
		System.in.skip(2);
		return user;
	}
	
	public static int gameResult(int user[],int com[]){
		int strike=0;
		int ball =0;
		
		for(int i=0; i<user.length;i++) {
			for(int j=0; j<com.length; j++) {
				if(user[i]==com[j]&&j==i) {//숫자와 자리가 같을때
					strike++;
				}else if(user[i]==com[j]&&i!=j) {
				ball++;
			   }
			}
		}
		System.out.println(strike+"스트라이크"+ball+"볼");
		return strike;
	}
	
	public static void main(String[] args) 
			throws IOException {
		int com[] = comRandom();
		printTitle();
		for(int i=0; i<10; i++) {
		int user[] = inputUser(0);
		System.out.print("사용자가 입력한 값:");
		arrPrint(user);
		int result=gameResult(user, com);
		if(result==3) {
			System.out.println("정답입니다.");
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
	}
		System.out.println("10번의 기회를 모두 소진하셨습니다");
		System.out.println("==프로그램을 종료합니다==");
	}
}

