package day07;

public class day07_02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
		System.out.println("0 0 0 0 0");
		}
		
		System.out.println();
		System.out.println("=============");
		
		for(int j=1; j<=5; j++) {
			for(int i=j; i<=5; i++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
