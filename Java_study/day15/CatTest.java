package day15;

public class CatTest {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.getInfo();
		System.out.println("===============");
		
		Cat c2 = new Cat("바둑");
		c2.getInfo();
		System.out.println("===============");
		
		Cat c3 = new Cat("바둑",6);
		c3.getInfo();
		System.out.println("===============");
		
		Cat c4 = new Cat("바둑",6,"먼치킨");
		c4.getInfo();
		System.out.println("===============");
		
		c4.getInfo("저의 고양이는");
	}

}
