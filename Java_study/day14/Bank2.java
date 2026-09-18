package day14;//강사님

public class Bank2 {
	
	//멤버변수 선언
	String acnum;//계좌번호
	String acname;//예금주
	int money;//잔고
	static double iyul;//이자율
	
	//생성자 선언영역
	public Bank2() {
		acnum="000-000";
		acname="무명";
		money=0;
		iyul=0.7;
	}
	//입금
	public void bankSave(int m) {
		
		money=money+m;
		System.out.println(m+"원이 입금되어 "+money+"원 잔액이 남았습니다.");
	}
	//출금
	public void bankLoad(int money) {
		
		if(money>this.money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		this.money=this.money-money;
		System.out.println(money+"원이 출금되어"+this.money+"원 잔액이 남았습니다.");
	}
	
	//정보출력
	public void getInfo() {
		System.out.println("계좌번호:"+acnum);
		System.out.println("예금주:"+acname);
		System.out.println("이자율:"+iyul);
		System.out.println("잔액:"+(int)((money*iyul)+money)+"원");	
	}
	
	
	//멤버메서드 선언영역
	

}
