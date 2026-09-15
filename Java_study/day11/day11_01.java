package day11;

import java.util.Random;

public class day11_01 {

	public static void main(String[] args) {
		
		System.out.println("로또 번호 생성 프로그램");
		int arr[] = new int [6];
		int com = 0;
		boolean a;
		
		do {
			a=true;
			
			for(int i=0; i<6; i++) {
				com = (int)(Math.random()*45)+1;
				arr[i] = com;
				for(int j=0; j<i; j++) {
					
					if(arr[i]==com) {
						a=false;
						break;	
					}
				}
			}
		}while(a);
			
		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
