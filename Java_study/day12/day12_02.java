package day12;

public class day12_02 {
	
	public static int getMaxNum(int num1, int num2) {
		
		int max=0;
		if(num1<num2) {
			max=num2;
		}else {
			max=num1;
		}
		return max;
		
	}
	//call by value
	public static void valueTest(int num1, int num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1="+num1+"/num2="+num2);
	}
	
	public static void main(String[] args) {
		
		int num1=3;
		int num2=7;
		
		System.out.println("num1="+num1+"/num2="+num2);
		valueTest(num1,num2);
		System.out.println("num1="+num1+"/num2="+num2);         // S 와 H 의 영역에서 생각해보면 S안에 메인이라는 동네 영역이있고 num1과 num2에 값이 들어가고
																//그리고 valuetest라는 동네에 n1과 nu2의 값이 저장되는거기 때문에 다르다 복사한게 기본데이터형이라 이렇게 됨
																// call by value형식
	}
}
		
//		int max=getMaxNum(num1/num2);
//
//		System.out.println("max="+max);
//	}
//
//}
