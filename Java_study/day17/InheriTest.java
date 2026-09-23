package day17;

class Super{
	int a =10;
	double b =20.0;
	
	public void test1() {
		System.out.println("test1()메서드 수행됨!");
	}
}	

class Sub extends Super{
	int a=100;
	int c =30;
	
	public void test1() {
		System.out.println("sub에서 재정의된 test1()메서드 수행됨");
		System.out.println("c="+c);
	}
	
	public void test2() {
		System.out.println("test2()메서드 수행됨!~");
	}
}

public class InheriTest{
	

	public static void main(String[] args) {
		
		Sub sb = new Sub();
		sb.test2();
		sb.test1();
		System.out.println("sb.c="+sb.c);
		System.out.println("sb.b="+sb.b);
		System.out.println("sb.a="+sb.a);
		
		Super sp=new Sub(); // 자식거를 아버지에게 프로모션 자동
		System.out.println("sp.a="+sp.a);
		System.out.println("sp.b="+sp.b);
		System.out.println("sp.c=");
		sp.test1();
		
		Sub sb2=(Sub)sp; // 다운캐스팅 아버지거를 자식에게 
		
		sb2.test2();
		
		Super arr[]=new Super[3];
		arr[0]=new Sub();
		arr[1]=new Super();
		arr[2]=new Sub();
		
//		Sub sb =new Sub();
//		System.out.println("sb.a="+sb.a);
//		System.out.println("sb.c="+sb.c);
//		sb.test2();
//		
//		Sub arr[]=new Sub[3];
//		arr[0]=new Sub();
//		arr[1]=new Sub();
//		arr[2]=new Sub();
//		arr[1].test2();
//		
//		Super sp = new Super();
//		System.out.println("sp.a="+sp.a);
//		System.out.println("sp.b="+sp.b);
//		sp.test1();
//		
//		Super arr[]=new Super[3];
//		//arr[1].test1();
//		arr[0]=new Super();
//		arr[1]=new Super();
//		arr[2]=new Super();
//		arr[2].test1();
	}
}

