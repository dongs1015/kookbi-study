package day10;

public class day10_02 {

	public static void main(String[] args) {
		
		//1. 선언
		int arr[][];
		
		//2. 생성
		arr= new int[3][2]; //3층 2호실
		
		// 3. 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		
		// 차원의 개수를 포문의 개수로 생각
		System.out.println("arr[0][0]="+arr[0][0]);
		System.out.println("arr[1][0]="+arr[1][0]);
		System.out.println("arr[2][0]="+arr[2][0]);
		
		for(int i=0;i<arr.length;i++) { //층을 담당할 for
			for(int j=0;j<arr[i].length;j++) { // 호실을 담당할 for
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		double arr2[]=new double[5];
		double arr3[]=new double[3];
		double arr4[]=new double[7];
		
		double allArr[][] = new double[3][];
		allArr[0] =arr2;
		allArr[1] =arr3;
		allArr[2] =arr4;
		
		for(int i=0; i<allArr.length;i++) {
			for(int j=0;j<allArr[i].length;j++) {
				System.out.print(allArr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
