package day14;

public class BankTest {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		b1.number = "111-111";
		b1.name = "장훈";
		b1.balance = 100000;
		b1.interestRate = 1.07;
		b1.bankSave(10000);
		b1.bankLoad(500);
		b1.getInfo(0);
		
		System.out.println("----------------");
		Bank b2 = new Bank();
		b2.number = "222-222";
		b2.name = "세희";
		b2.balance = 300000;
		b2.interestRate = 1.07;
		b2.bankSave(10000);
		b2.bankLoad(500);
		b2.getInfo(0);
	}

}