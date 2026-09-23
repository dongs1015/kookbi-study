package day17;

import day17.SpiderMan;

public class HumanTest {

	public static void main(String[] args) {
		SpiderMan sm = new SpiderMan("피터파커", 12);
		sm.getInfo();
		System.out.println("-------------------------");
		sm.getInfo("스파이더맨");
	}

}
