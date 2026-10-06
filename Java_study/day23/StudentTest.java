package day23;


class Student<H>{
	
	H hakbun;
	String name;
	int age;
	
	public void getInfo() {
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		
		Student<Integer> s = new Student<Integer>();
		s.hakbun=123456;
		s.name="홍길동";
		s.age=20;
		s.getInfo();
		
		Student<String> s2= new Student<String>();
		s2.hakbun="123-456";
		s2.name="둘리";
		s2.age=23;
		s2.getInfo();
	}

}
//설계도에 활용할 수 있다 제네릭Generic 콜렉션에서 보통사용함 지금은 억지로 사용한느낌