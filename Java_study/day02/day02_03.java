package day02;

public class day02_03 {

	public static void main(String[] args) {
		
		boolean bool1;
		bool1=true;
		
		System.out.println("bool1="+bool1);
		
		boolean bool2 = false;
		
		System.out.println("bool2="+bool2);
		
		byte by = 127;
		System.out.println("by="+by);
		by++;
		by++;
		System.out.println("by="+by);
		
		char ch='A'+1;
		System.out.println("ch="+(ch+1));
		
		short sh = 1004;
		System.out.println("sh="+sh);
		
		int in = 1004;
		System.out.println("in="+in);
		
		byte num1=3;
		byte num2=4;
		int result = num1 + num2;
		System.out.println("result="+result);
		
		byte result2 = (byte)(num1+num2);
		System.out.println("result2="+result2);
		
		long lo=10004L;
		System.out.println("lo="+lo);
		
		double dou =3.14;
		System.out.println("dou="+dou);
		
		float fl =3.14F;
		System.out.println("fl"+fl);
	}

}
