package day07;

public class day07_04 {

	public static void main(String[] args) {
		
		for(int j=0; j<=4; j++) {
		for(int i=5; i<=9; i++) {
			System.out.print(i-j);
			}
		System.out.println();
		}
		
		
		for(int j=5;j>=1;j--) {
			for(int i=j;i<j+5;i++) {
			System.out.print(i);
			}
			System.out.println();
		}
	}

}
