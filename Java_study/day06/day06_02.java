package day06;

import java.io.*;

public class day06_02 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("==중국집 ars프로그램 v2.0");
		System.out.println("1.짜장면 2.짬뽕 3.탕수육 4.팔보채");
		System.out.print("메뉴>");
		int menu=System.in.read()-48;
		
		switch(menu) {
		case 1:System.out.println("짜장면 주문함, 조리시작");break;
		case 2:System.out.println("짬뽕 주문함, 조리시작");break;
		case 3:System.out.println("탕수육 주문함, 조리시작");break;
		case 4:System.out.println("팔보채 주문함, 조리시작");break;
		default :System.out.println("잘못된 메뉴입니다 다시주문해주세요");break;

		}
		

	}

}
