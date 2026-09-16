package day12;

import java.io.*;

public class day12_06 {
	
	public static int cal(int num1, int num2, char num3) {
		int result = 0;
		if(num3=='+') {
			result=num1+num2;
		}else if(num3=='*') {
			result=num1*num2;
		}else if(num3=='/') {
			result=num1/num2;
		}else if(num3=='-') {
			result=num1-num2;
		}else {
			System.out.println("다시 입력해주세요");
		}
		return result;
	}

	public static void main(String[] args) 
	throws IOException{
	
		System.out.print("첫번째 수: ");
		int num1 = System.in.read()-48;
		System.in.skip(2);
		
		System.out.print("두번째 수: ");
		int num2 = System.in.read()-48;
		System.in.skip(2);
		
		BufferedReader br = new BufferedReader( 
			new InputStreamReader(System.in));
		System.out.print("연산자(+,-,*,/):");
		char num3  = br.readLine().charAt(0);

		int result1 = cal(num1, num2, num3);
		System.out.println(num1+""+num3+""+num2+""+"="+result1);
	}

}
