package day07;

public class day07_01 {

	public static void main(String[] args) {
		int result=0;
		for(int i=1; i<=10;i++) {
			System.out.print(i);
			if(i%2==0) {
				result =result-i;
				if(i!=10) {
					System.out.print("+");
				}
			}else {
				result+=i;
				System.out.print("-");
				
			}
		}
		System.out.print("="+result);

	}

}
