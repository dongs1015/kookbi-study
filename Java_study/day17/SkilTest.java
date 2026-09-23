package day17;

import java.io.*;

class Skil {
	String name;
	public void Finish() {
		System.out.println(name+"가 필살기를 시전하였습니다.");
	}
}

class Warrior extends Skil {
	public Warrior() { name = "전사"; }
}

class Mage extends Skil {
	public Mage() { name = "마법사"; }
}

class Healer extends Skil {
	public Healer() { name = "힐러"; }
}

public class SkilTest {
	public static void main(String[] args) throws IOException {

		Skil arr[] = new Skil[3];
		arr[0] = new Warrior();
		arr[1] = new Mage();
		arr[2] = new Healer();

		int user = -1;
		System.out.println("========================");
		System.out.println("캐릭터 필살기 쓰기 !!");
		System.out.println("========================");
		System.out.println("1.전사 필살기쓰기");
		System.out.println("2.마법사 필살기 쓰기");
		System.out.println("3.힐러 필살기 쓰기");
		System.out.println("4.스페셜 모든 캐릭터 필살기 쓰기");
		System.out.println("5.종료");
		System.out.println("========================");
		while (user != 4) {
			
			System.out.print("메뉴>");

			user = System.in.read() - 49;
			System.in.read(); // 개행 문자 버퍼 비우기

			switch (user) {
			case 0:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] instanceof Warrior) {
						arr[i].Finish();
					}
				}
				break;
			case 1:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] instanceof Mage) {
						arr[i].Finish();
					}
				}
				break;
			case 2:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] instanceof Healer) {
						arr[i].Finish();
					}
				}
				break;
			case 3:
				for (int i = 0; i < arr.length; i++) {
					arr[i].Finish();
				}
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}