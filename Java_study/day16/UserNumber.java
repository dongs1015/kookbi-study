package day16;

public class UserNumber {
	int num;
	
	public UserNumber(int num) {
		this.num = num;
		
	}
	
	
	public void printMultiplyNumber(int i) {
		System.out.println(num*i);
	}
	
	public void printMultiplyNumber(int arr[]) {
		for(int j=0; j<5; j++) {
			System.out.print(num*arr[j]+" ");
		}
	}
}
