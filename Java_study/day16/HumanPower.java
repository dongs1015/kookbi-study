package day16;

public class HumanPower extends Human{
		
		String a;
		int b;
	
	public HumanPower(String a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void getInfo() {
		System.out.println("내이름은 "+ a);
		super.getInfo();
		System.out.println("힘 수치:"+b);
	}
	
	public void getInfo(String a) {
		this.getInfo();
		System.out.println("하지만 비밀이 있지.");
		System.out.println("나는야 슈퍼파워 "+ a);
	}
	

}
