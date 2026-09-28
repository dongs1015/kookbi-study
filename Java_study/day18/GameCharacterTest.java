package day18; //교수님버전

import java.io.*;

class Character{
	String name;
	
	public void specialSkill() {
		System.out.println("필살기 발동!");
	}
}

class Warrior extends Character{
	public Warrior() {
		name="전사";
	}
	
	public void specialSkill() {
		System.out.println(name+"가 천재지변 내려찍기를 시전하였습니다.");
	}
}

class Mage extends Character{
	public Mage() {
		name="마법사";
	}
	
	public void specialSkill() {
		System.out.println(name+"가 필살기 폭풍전야를 시전하였습니다.");
	}
}

class Healer extends Character{
	public Healer() {
		name="힐러";
	}
	public void specialSkill() {
		System.out.println(name+"가 필살기 광역힐을 시전하였습니다.");
	}
}

public class GameCharacterTest {
	
	public static void printMenu() {
		System.out.println("===================");
		System.out.println("캐릭터 필살기 쓰기!");
		System.out.println("===================");
		System.out.println("1. 전사 필살기 쓰기");
		System.out.println("2. 마법사 필살기 쓰기");
		System.out.println("3. 힐러 필살기 쓰기");
		System.out.println("4. 모듵 캐릭터 필살기 쓰기!");
		System.out.println("5. 종료");
		System.out.println("===================");
	}
	
	public static void warriSkill(Character party[]) {
		
		for(int i=0; i<party.length; i++) {
			if(party[i] instanceof Warrior) {
				
			}
		}
	}

	public static void mageSkill(Character party[]) {
		
		for(int i=0; i<party.length; i++) {
			if(party[i] instanceof Mage) {
				
				}
			}
		}
	
	public static void healerSkill(Character party[]) {
	
		for(int i=0; i<party.length; i++) {
			if(party[i] instanceof Healer) {
			
			}
		}
	}

	public static void allCharSkill(Character party[]) {
		
		for(int i=0; i<party.length; i++) {
			party[i].specialSkill();
		}
	}

	public static void main(String[] args) 
	throws IOException{
		
		Character party[] = new Character[3];
		party[0] = new Warrior();
		party[1] = new Mage();
		party[2] = new Healer();
		
		printMenu();
		System.out.print("메뉴>");
		int user =System.in.read()-48;
		System.in.skip(2);
		
		switch(user) {
		case 1:warriSkill(party);break;
		case 2:mageSkill(party);break;
		case 3:healerSkill(party);break;
		case 4:allCharSkill(party); break;
		case 5:System.out.println("===게임 종료===");
		System.exit(0);
		}
		
		
		
	}

}
