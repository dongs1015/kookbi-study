package day25;

class Bank{
	int money; // 잔액
	
	//입급
	synchronized public void bankSave(String name, int money) {
		this.money=this.money+money;
		System.out.println(name+"가"+money+"원을 입금하여"+this.money+"원 잔액이 남았습니다.");
	}
	//출금
	synchronized public void bankLoad(String name,int money) {
		if(money>this.money) {
			System.out.println(name+"님 잔액이 부족합니다.");
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.money-=money;
		System.out.println(name+"가"+money+"원을 출금하여 "+this.money+"원 잔액이 남았습니다.");
	}
	
}

class Parent extends Thread{ //레퍼런스를 이용하는 방법
	
	String name;
	Bank bank;
	
	public Parent(String name,Bank bank) {
		this.name=name;
		this.bank=bank;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
		int savemoney=(int)(Math.random()*5+1)*100;//100~500
		int loadmoney=(int)(Math.random()*5+1)*100;
		
		bank.bankSave(name, savemoney);
		bank.bankLoad(name, loadmoney);
		}
	}
}
public class ThreadTest6 {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		Parent mama=new Parent("엄마", b);
		Parent papa=new Parent("아빠", b);
		
		mama.start();
		papa.start();

	}

}
