package day09;

import java.io.*;

public class day09_08 {

	public static void main(String[] args)
	throws IOException{
		
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		int score[] = new int[5];
		
		for(int i=0; i<5; i++) {
		System.out.print(i+1+"번 점수:");
		score[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<score.length; i++) {
			System.out.print(score[i]+" ");
		}
		
		System.out.println("\n----------------------");

		for (int i = 0; i < score.length - 1; i++) {
            int maxIdx = i; 
        
            for (int j = i + 1; j < score.length; j++) {
                if (score[j] > score[maxIdx]) {
                    maxIdx = j;
                }
            }
            
            int temp = score[i];
            score[i] = score[maxIdx];
            score[maxIdx] = temp;
        }

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
		
	}
}
