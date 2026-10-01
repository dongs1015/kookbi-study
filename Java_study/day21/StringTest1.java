package day21;

public class StringTest1 {

	public static void main(String[] args) {
		
		String str = "java";
		String str2 ="java";
		String str3 = new String("java");
		
		if(str==str2) {
			System.out.println("str==str2:같다");
		}else {
			System.out.println("str==str2:같지않다");
		}
		String res=str==str3?"같다":"같지않다";
		System.out.println("str==str3:"+res);
		
		String res2=str.equals(str2)?"같다":"같지않다";
		String res3=str.equals(str3)?"같다":"같지않다";
		System.out.println("str==str2:"+res2);
		System.out.println("str==str3:"+res3);

	
	}
}
/*
 * str==str2:같다
str==str3:같지않다

str은 s   java는 h 이고 java는 str에 100이라는 주소값이 저장될거임ㅁ
대입연산자를 이용해서 값을 넣는거면 h영역을 한번 훑고 공통된 데이터가 있을경우 그데이터를 가져와서 재활용함으로써
str2에 넣는 결과가 나오게되고 데이터가 같은게 아니고 데잍너의 주소가 같게된다.
str3는만들때 뉴라는 동적메모리 할당을써서 무조건 새거로 만들게 되는데 java라는 객체가 h영역에서
생성이 되게되고 200이라는 주소값을 가진 str3이 만들어지고 주소값이 달라서 같지않다라고 나오게됨
클래스는 작은 하나의 프로그램
 */
