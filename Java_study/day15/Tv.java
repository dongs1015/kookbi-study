package day15;

public class Tv {
	
	int rgb; // 색상
	int mi; // 명암
	int ri; //밝기
	
	public Tv() { // 기본생성자
		rgb=50;
		mi=50;
		ri=50;
	}
	
	public Tv(int r) {  // 인자생성자
		this();
		rgb=r;
	}
	
	public Tv(int r, int m) {
		this(r);
		mi=m;
	}
	
	public Tv(int r, int m, int ri) { // 인자생성자 포함 생성자 4개생성함
		this(r,m);
		this.ri=ri;
	}
	public void getInfo() {
		System.out.println("색상:"+rgb);
		System.out.println("명암:"+mi);
		System.out.println("밝기"+ri);
	}
	
	public void getInfo(String title) {
		System.out.println(title);
		this.getInfo();
	}
	
}
