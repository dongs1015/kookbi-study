package day10;

import java.io.*;

public class day10_04 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int arr[][] = new int[3][3];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j < arr[i].length; j++) {
				System.out.print(i+1+"번째의 "+j+"번째의 수:");
				arr[i][j] = Integer.parseInt(br.readLine());
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr[i].length; j++) {
				if(j==1) {
					sum += arr[i][j];
					System.out.print(arr[i][j]+"+");
				}else {
					sum += arr[i][j];
					System.out.print(arr[i][j]+"="+sum);
					sum = 0;
				}
				
			}
			System.out.println();
		}
		
				

	}

}
/*
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[][] = new int[3][2];
        int[] sum = new int[3];


        for(int i = 0;i<3;i++) {
            for(int j = 0;j<2;j++) {
                System.out.print((i+1)+"번째의"+(j+1)+"번째 수 : ");
                arr[i][j] = Integer.parseInt(br.readLine());
            }
            sum[i] = arr[i][0]+arr[i][1];
        }

        for(int i = 0;i<3;i++) {
            System.out.println(arr[i][0]+"+"+arr[i][1]+"="+sum[i]);
        }
    }
  
 */