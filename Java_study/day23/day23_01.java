package day23; // day22_05 교수님버전

import java.util.*;

public class day23_01 {

	public static void main(String[] args) {
		
		String str="100+250+40+70+500";
		
		StringTokenizer st=new StringTokenizer(str,"+");
		
		int sum=0;
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			int temp_in=Integer.parseInt(temp);
			System.out.println(temp_in);
			sum+=temp_in;
		}
		System.out.println("="+sum);	
	}
}
