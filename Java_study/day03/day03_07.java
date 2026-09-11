package day03;

public class day03_07 {

	public static void main(String[] args) {
			
		int num1 = 7;
		int num2 = 5;
		
		  int big = num1>num2?num1:num2;
	        int smolle = num1<num2?num1:num2;

	        System.out.println((num1>num2?"num1":"num2")+"값이 더 큽니다."+big);
	        System.out.println((num1<num2?"num1":"num2")+"값이 더 작습니다."+smolle);
	}

}
