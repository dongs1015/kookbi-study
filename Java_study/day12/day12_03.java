package day12;

public class day12_03 {
	// call by reference 주소를 넘기는애
	public static void refTest(int arr[]) {
		arr[2]=1004;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		refTest(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); // S와 H에 MAIN에 ARR LEFT에 arr은 서로 다른 변수를 만든거지만 둘은 같은 주소를 사용하고 넘겨주었기에
										  // 같은 데이터를 바라보게됨
		}
		System.out.println();
	}

}
