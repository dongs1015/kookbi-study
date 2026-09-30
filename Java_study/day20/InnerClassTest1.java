package day20;

class Outer{
	
	String str="$$$";//멤버변수
	
	public void test1() { //멤버메서드
		String str2="###"; //지역변수
		System.out.println("str="+str);
		System.out.println("str2="+str2);
	}
	class Inner{ //inner non-static class
		String str3="!!!"; // 멤버변수
		
		public void test2() {
			String str4="@@@";//지역변수
			System.out.println("str3="+str3);
			System.out.println("str4="+str4);
			System.out.println("str외부클래스멤버변수="+str);
		}
	}
	static class SInner{// inner member non=static class
		String str5="^^^"; // 객체가 만들어질때
		
		static public void test3() { 
			String str6="***"; // 
			// System.out.println("str5="+str5);
			System.out.println("str6="+str6);
		}
	}
}


public class InnerClassTest1 {

	public static void main(String[] args) {

		Outer  o =new Outer();
		o.test1();
		
		//Outer.Inner oi=new Outer.Inner();
		Outer.Inner oi = o.new Inner();
		oi.test2();
		
		Outer.SInner os = new Outer.SInner();
		os.test3();
		Outer.SInner.test3();
	}

}
