package day16;

public class YongMathTest {

	public static void main(String[] args) {
		Math test = new	Math();
		System.out.println("3과 5중 큰수:"+(test.getMaxNum(3,5)));
		System.out.println("6.1과 3.6중 큰수:"+(test.getMaxNum(6.1,3.6)));
		test.getInfo();

	}

}
