package day20;

public class ExcepTest4 {

	public static void main(String[] args) {
	try {	
		String data1 =args[0];
		String data2 =args[1];
		
		System.out.println("첫번째 값:"+data1);
		System.out.println("두번째 값:"+data2);
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("실행시 값을 입려하셔야해요");
	}catch(NumberFormatException e) {
		System.out.println("입력시 숫자만 입력하셔야합니다");
	}catch(ArithmeticException e){
		System.out.println("숫자는 0으로 나눌수 없습니다");
	}catch(Exception e) {
		System.out.println("고객센터 연락바람");
	}
	}

}
