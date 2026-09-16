package day12;

public class day12_01 {

	//** call by name*/ // c나 c++은 call by value와 raperonse밖에 없기에 자바만 name이 추가되있는거다
	
public static void xLine() {
	System.out.println("-------------------");
}

	public static void main(String[] args) {
		xLine();           // 밑줄을 반복중인걸 볼 수 있음
		System.out.println("이름 : 홍길동");
		xLine(); 
		System.out.println("나이 : 20살");
		xLine(); 
		System.out.println("주소 : 서울");
		xLine(); 
	}

}
