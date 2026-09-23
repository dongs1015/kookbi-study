package day17;

public class SpiderMan extends Human {
	String name;
	int power;

public SpiderMan (String name, int power){
	this.name = name;
	this.power = power;
}

public void getInfo() {
	System.out.println("내이름은 "+ name);
	super.getInfo();
	System.out.println("힘 수치:"+power);
}

public void getInfo(String a) {
	this.getInfo();
	System.out.println("하지만 비밀이 있지.");
	System.out.println("나는야 슈퍼파워 "+ a);
}

}
