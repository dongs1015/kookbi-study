package day21;

import java.io.*;

public class StringApiTest2 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br=new BufferedReader
			(new InputStreamReader(System.in));	

		System.out.print("문장입력: ");
		String str=br.readLine();
		
		for (int i = str.length()-1 ; i >= 0; i--) {
		    System.out.print(str.charAt(i));
		}
		}
	}
