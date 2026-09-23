package day17;

class Kick {
	String name;
	
	public void kick() {
		System.out.println("공을 칩니다.");
	}
}	
class BaseBall extends Kick{
	public BaseBall(String name) {
		this.name=name;
	}
	
	public void kick() {
		System.out.println(name+"을 배트로 칩니다.");
	}
}

class SoccerBall extends Kick{
	public SoccerBall(String name) {
		this.name=name;
	}
	
	public void kick() {
		System.out.println(name+"을 발로 찹니다");
	}
}

class BasketBall extends Kick{

	public BasketBall(String name) {
		this.name=name;
	}
	
	public void kick() {
		System.out.println(name+"을 손으로 던집니다");
	}
}

public class Ball {

	public Ball(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Kick krr[] = new Kick[3];
		krr[0] = new BaseBall("야구공");
		krr[1] = new SoccerBall("축구공");
		krr[2] = new BasketBall("농구공");
		
		for(int i=0; i<krr.length; i++) {
			krr[i].kick();
		}
	}

}
