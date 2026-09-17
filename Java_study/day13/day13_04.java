package day13;
 
import java.io.*;

public class day13_04 {

	public static void arrInput(int arr[][]) 
	throws IOException{
			BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
				
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length-2;j++) {
				System.out.print(i+1+"번째 학생의 "+(j+1)+"번째 점수:");
				arr[i][j] = Integer.parseInt(br.readLine());
				arr[i][3] += arr[i][j];
			}
				arr[i][4] = arr[i][3]/3;
		}
	}
	
	public static void arrPrint(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void arrSort(int arr[][]) {
		System.out.println("================");

		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i][4]<arr[j][4]) {
					int[] temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	throws IOException{
		
		int arr[][] = new int[5][5];
		arrInput(arr);
		arrPrint(arr);
		arrSort(arr);
		arrPrint(arr);
		
	}

}
