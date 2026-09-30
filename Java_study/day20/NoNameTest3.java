package day20;

interface NoName3{
	public int cal(int i, int j);
}

public class NoNameTest3 {

	public static void main(String[] args) {
		
//		NoName3 add = new NoName3() {
//			public int cal(int i,int j) {
//				int result = i+j;
//				return result;
//			}
//		};
//
//		NoName3 minus = new NoName3() {
//			public int cal(int i,int j) {
//				int result = i-j;
//				return result;
//			}
//		};
		NoName3 add = (i,j) -> {int result = i +j; return result;};
		NoName3 minus = (i,j) -> {int result = i-j; return result;};
		
		System.out.println("5+3="+ add.cal(5,3));
		System.out.println("7-4="+ minus.cal(7,4));
	}

}
