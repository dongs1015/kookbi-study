package day09;

public class day09_02 {

	public static void main(String[] args) {
		
		int a=10;
		
		char b='A';
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int arr[]= {10,20,30,40,50,60};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("================");
		System.out.println();
		arr= new int[3];  // stack 과 heap이라는 영역이있는데
		for(int i=0; i<arr.length; i++) { 
			System.out.print(arr[i]+" ");
		}

	}

}
