package day14;

public class Bank {
	
	String number;
	String name;
	int balance;
	double interestRate;
	
	public Bank() {
		number="000-000";
		name="무명";
		balance=0;
		interestRate=0.07;
	}
	
	public void bankSave(int i){
		System.out.println(i+"원이 입금되어"+(balance+i)+"원 잔액이 남았습니다.");
	}
	
	public void bankLoad(int i) {
		System.out.println(i+"원이 출금되어"+(balance+i)+"원 잔액이 남았습니다.");
	}
	
	public void getInfo(int i) {
		System.out.println("계좌번호: "+number+" 예금주이름: "+name+" 잔고: "+(int)(balance*interestRate));
	}
}