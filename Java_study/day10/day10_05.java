package day10;

import java.io.*;

public class day10_05 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		int arr[][] = new int [5][3];
		int[] sum = new int [5];
		int[] avg = new int [5];
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(i+1+"번학생 "+ (j+1)+"번점수:");
				arr[i][j] = Integer.parseInt(br.readLine());
			}
			sum[i] = arr[i][0]+arr[i][1]+arr[i][2];
			avg[i] = sum[i]/3;
		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.println
		(arr[i][0]+"  "+arr[i][1]+"  "+arr[i][2]+"  "+sum[i]+"  "+ avg[i]);
		}
		System.out.println("==========");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(avg[i] > avg[j]) {
					int temp=avg[i];
					avg[i]=avg[j];
					avg[j]=temp;
					int temp2=sum[i];
					sum[i]=sum[j];
					sum[j]=temp2;
					int[] temp3=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp3;
					
				}
			}
		}

	
		for(int i=0; i<5; i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
				System.out.println
				(sum[i]+"  "+ avg[i]);
			}
	}

}
