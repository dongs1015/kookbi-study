package day13;

import java.io.*;

public class day13_05 {

	public static void input1() throws IOException{
		
	}
	
	
	public static void ne() {
		for(int i =0; i<21; i++) {
			System.out.println("=======================");
		}
	}
	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몇개의 수를 기억하시겠습니까?:");
		int A =Integer.parseInt(br.readLine());
		int B[] = new int[A];
		int C[] = new int[A];
		for(int i=0; i<A; i++) {
			if(i%2==0) {
				System.out.print("사용자:");
				B[i] = Integer.parseInt(br.readLine());
			}else {
				B[i]=(int)(Math.random()*99)+1;
				System.out.print("컴퓨터:"+B[i]);
				System.out.println("");
			}
		}
		ne();
		System.out.println("암기한 숫자 입력:");
		for(int i=0; i<A; i++) {
				System.out.print(i+1+"번 숫자:");
		 C[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("정답: ");
		for(int i=0; i<A; i++) {
			System.out.print(B[i]+" ");
		}
		
		System.out.print("\n입력한 답:");
		for(int i=0; i<A; i++) {
			if(B[i]==C[i]) {
				System.out.print(B[i]);
			}else {
				System.out.print("["+C[i]+"]");
			}
		}

	}

}
