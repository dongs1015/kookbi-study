package day07;

public class day07_08 {

	public static void main(String[] args) {
		
		for(int j=1; j<=3; j++) {
		for(int i=1; i<=9; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		if(j==2) {
			break;
		}
		}
	}

}
