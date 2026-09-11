package day06;

public class day06_05 {

	public static void main(String[] args) {
	

		int sum = 0;
	/*	for (int1 n=0; n <= 50; n += 5) {
			System.out.println(n);
			sum += n;
		}
		System.out.println("배수의 합:"+sum);*/
		
		for(int i=0; i <= 50; i++) {
			if(i%5==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("5의 배수의 합:"+sum);
	}

}
