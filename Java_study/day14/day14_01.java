package day14; // 13_05 교수님버전

import java.io.*;

public class day14_01 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몇 개의 수를 기억하시겠습니까");
		int num =Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		
		for(int i=0; i<arr.length;i++) {
			System.out.print("사용자:");
			arr[i]=Integer.parseInt(br.readLine());
			
			if(i==arr.length-1) {
				break;
			}
			
			i++;
			arr[i]=(int)(Math.random()*99+1);
			System.out.println("컴퓨터:"+arr[i]);
		}
		
		int user[]=new int[num];
		for(int i=0; i<user.length; i++) {
			System.out.print(i+1+"번째 숫자:");
			user[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n정답:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("입력한 값:");
		for(int i=0; i<user.length; i++) {
			if(user[i]==arr[i]) {
			System.out.print(user[i]+" ");
			}else{
			System.out.print("["+user[i]+"]");
			}
		}
	}
}
