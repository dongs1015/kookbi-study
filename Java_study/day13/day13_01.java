package day13; // 강사님버전

import java.io.*;

public class day13_01 {

	public static void arrInput(int arr[]) 
	throws IOException {
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1+"번째 점수:");
				arr[i]= Integer.parseInt(br.readLine());
				}
	}
	public static void arrPrint(int arr[]){
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void arrSort(int arr[]) {
		System.out.println("\n------------------");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; i<arr.length; i++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	throws IOException{
		
		
		int arr[] = new int[5];
		//arrInput
		arrInput(arr);
		//arrPrint
		arrPrint(arr);
		//arrSort
		arrSort(arr);
		//arrPrint
		arrPrint(arr);
	}

}
