package day09;

public class day09_01 {

	public static void main(String[] args) {
		
		//컴퓨터에서의 데이터는 1회성
		int var=10;
		
		//1.배열변수 선언하기(구청신고)
		int arr[];
		
		//2.생성하기(건물짓기)
		arr = new int[3];
		
		//3.초기화(입주하기)
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr[2]="+arr[2]);
		
		// System.out.println("arr[4]="+arr[4]);
		System.out.println("arr 의길이:"+arr.length);
		
		//2. 선언+생성, 초기화
		
		double arr2[] = new double[5];
		arr2[0]=10.1;
		arr2[1]=20.2;
		arr2[2]=30.3;

		System.out.println("arr2[0]="+arr2[0]);
		System.out.println("arr2[2]="+arr2[0]);
		System.out.println("arr2[4]="+arr2[4]);
		
		//1+2+3
		int arr3[]= {10,20,30,40,50,60,70};
		System.out.println("arr3의 길이:"+arr3.length);
		System.out.println("arr3[0]="+arr3[0]);
		System.out.println("arr3[1]="+arr3[1]);
		System.out.println("arr3[2]="+arr3[2]);
		System.out.println("arr3[3]="+arr3[3]);
		System.out.println("arr3[4]="+arr3[4]);
		System.out.println("arr3[5]="+arr3[5]);
		System.out.println("arr3[6]="+arr3[6]);
		
		int len=arr3.length;
		for(int i=0; i<len; i++) {
			System.out.println(arr3[i]);
		}
		
	}	

}
