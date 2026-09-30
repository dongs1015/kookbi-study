package day20;

interface NoName2{
	public void sayAge(int age);
}

public class NoNameTest2 {

	public static void main(String[] args) {

//			NoName2 nn2 = new NoName2() {
//				public void sayAge(int age) {
//					System.out.println("저의 나이는"+age+"살입니다.");
//				}
//			};
		NoName2 nn2=age->{System.out.println("저의 나이는"+age+"살입니다.");};
		nn2.sayAge(20);
	}

}
