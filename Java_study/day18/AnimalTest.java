package day18;

import java.io.*;

abstract class Animal{
	
	 public abstract void crySound(); // 두개가 같음

	abstract public void getBaby(int i);
}

class Dog extends Animal{
	
	String name;

	public Dog() {
		name ="강아지";
	}
	
	public void crySound(){
		System.out.println(name+"는 월월하고 울어요");
	}
	
	public void getBaby(int i) {
		System.out.println(name+"가"+i+"마리 태어났어요");
	}
}

class Cat extends Animal{
	
	String name;
	
	public Cat() {
		name ="고양이";
	}
	
	public void crySound(){
		System.out.println(name+"는 냥냥하고 울어요");
	}
	
	public void getBaby(int i) {
		System.out.println(name+"가"+i+"마리 태어났어요");
	}
}

class Duck extends Animal{
	
	String name;
	
	public Duck() {
		name ="오리";
	}
	
	public void crySound(){
		System.out.println(name+"는 꽥꽥하고 울어요");
	}
	
	public void getBaby(int i) {
		System.out.println(name+"가"+i+"마리 태어났어요");
	}
}

public class AnimalTest {

	public static void Baby(int i, int j) {	
		
		Dog d = new Dog();
		Cat c = new Cat();
		Duck du = new Duck();
		
		switch (j) {
		case 1: 
		d.getBaby(i);
		d.crySound();break;
		case 2: 
		c.getBaby(i);
		c.crySound();break;
		case 3: 
		du.getBaby(i);
		du.crySound();break;
		default:
		System.out.println("잘못 입력하셨습니다."); break;

		
		}	
	}
	
	public static void main(String[] args) 
	throws IOException{
		
		
		System.out.println("1.강아지 2.고양이 3.오리");
		System.out.print("동물을 선택해주세요:");
		int j = System.in.read()-48;
		System.in.skip(2);
		System.out.print("아이의 수를 입력해주세요:");
		int i = System.in.read()-48;
		Baby(i, j);
	}

}
/*교수님 버전
 * 
 * Animal ani = null;
 * switch(user) {
 * case 1: ani=new Dog();break;
 * case 2: ani=new Cat();break;
 * case3: ani=new Duck();
 * }
 * ani.crySound();
 * ani.getBaby(baby);
*/
