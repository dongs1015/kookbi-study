package day10;

import java.io.*;

public class day10_01 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(  
				new InputStreamReader(System.in));
		int arr[] = new int[5]; 
		
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번 점수:");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n----------------");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
