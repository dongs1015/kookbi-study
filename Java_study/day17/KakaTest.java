package day17;

class Kaka{
	String name; 
	
	public void openKaka() {
		System.out.println("까까를 뜯어서 먹습니다.");
	}
}
// 바나나킥
class Banana extends Kaka{
	public Banana(String name) {
		this.name = name;
	}
	public void openKaka() {
		System.out.println(name+"의 봉지를 뜯어서 먹습니다.");
	}
}
// 프링글스
class Prin extends Kaka{
	public Prin(String name) {
		this.name =name;
	}
	public void openKaka() {
		System.out.println(name+"의 뚜껑을 따서 먹습니다.");
	}
}
// 고래밥
class Sea extends Kaka{
	public Sea(String name) {
		this.name=name;
	}
	
	public void openKaka() {
		System.out.println(name+"의 상자를 뜯어서 먹습니다.");
	}
}


public class KakaTest {

	public static void main(String[] args) {
		
//		Prin p = new Prin("프링글스");
//		p.openKaka();
//		Sea s = new Sea("고래밥");
//		s.openKaka();
//		Banana b =new Banana("바나나킥");
//		b.openKaka();
//		
//		System.out.println("---------------");
//		
//		
//		Kaka krr[] = new Kaka[3];
//		krr[0] = new Sea("고래밥");
//		krr[1] = new Banana("바나나킥");
//		krr[2] = new Prin("프링글스");
//		
//		for(int i=0; i<krr.length; i++) {
//			krr[i].openKaka();
//		}
//		
//		System.out.println("-------------------");
//		//instanceof
		Kaka krr[]=new Kaka[3];
		krr[0] = new Sea("고래밥");
		krr[1] = new Banana("바나나킥");
		krr[2] = new Prin("프링글스");
		
		for(int i=0; i<krr.length; i++) {
			if(krr[i] instanceof Prin) {
				krr[i].openKaka();
			}
		}
		Banana b =new Banana("바나나킥");
		
		Kaka k=b;
		
//		System.out.println(k instanceof Banana);
		
	}

}
