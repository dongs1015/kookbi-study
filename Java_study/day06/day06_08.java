package day06;

public class day06_08 {

	public static void main(String[] args) {
		
		int sum= 1;
		System.out.print(sum);

		for(int i = 2; i<=10; i++) {
			
			if(i % 2 != 0) {
			    System.out.print("+"+i);
			    sum+=i;
			} else if(i%2 == 0) {
				System.out.print("-"+i);
				sum-= i;
			}
			
			
		} System.out.print("="+sum);
		/*
		 * int sum = 0;
		 * 
		 * for (int i =1; i<=10; i++) {
		 * 
		 * if(i == 1) {
		 * 	System.out.print(i);
		 *  sum+=i;
		 * }else if(i % 2 != 0) {
		 * 	System.out.print("+"+i);
		 * 	sum += i;
		 * }else if{i % 2 == 0} {
		 * 	System.out.print("-"+i);
		 * 	sum -= i;
		 *}
		 *}System.out.print("="+sum);
		 */

	}

}
