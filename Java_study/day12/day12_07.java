package day12;

import java.io.*;

public class day12_07 {
	
	public static void arrInput(int arr[]) 
	throws IOException{
		BufferedReader br =new BufferedReader(
				new InputStreamReader(System.in));
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번째 점수:");
			arr[i] = Integer.parseInt(br.readLine());
		}
	}

	public static void arrPrint(int arr[]) {
			for(int i=0; i<5; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	
	public static void arrSort(int arr[]) { 
		System.out.println("\n--------------------");
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] < arr[j]) {
						int temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	
	public static void main(String[] args) 
	throws IOException{
		int arr[] = new int[5];
		arrInput(arr);
		arrPrint(arr);
		arrSort(arr);
		arrPrint(arr);
		
	}

}
