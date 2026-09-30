package day20;

class NamedLocal{
	
	String str="%%%";
	
	public void test1() {
		String str2="!!!";
		System.out.println("str="+str);
		System.out.println("str2="+str2);
		
		class LocalTest{ // 설계후 바
			String str3="@@@";
			public void test2() {
				String str4="&&&";
				System.out.println("str3="+str3);
				System.out.println("str4="+str4);
			}
		}
		LocalTest lt=new LocalTest();
		lt.test2();
	}
	public void test3() {
		
	}
}

public class NamedLocalTest {

	public static void main(String[] args) {
		
		NamedLocal n1 = new NamedLocal();
		n1.test1();
	}

}
