package day25;

class ThreadAAA extends Thread{

	@Override
	public void run() {
	System.out.println("##ThreadAAA의 시작##");
		
		for(int i=1; i<=50; i++) {
			System.out.println("##ThreadAAA의 값:"+i+"##");
		}
		
		System.out.println("##ThreadAAA의 끝##");
	}
	
}
public class ThreadTest5 {

	public static void main(String[] args) {
		
		ThreadAAA ta = new ThreadAAA(); // 독립스레드 main과 스레드aaa는 전혀다르다
		
		ta.setDaemon(true); //미리 세팅후 스타트를해 데몬을사용해 스레드가 종속인지 독립인지 확인
		
		ta.start(); // 지금은 메인 끝나고도 계속 끝까지나옴
		
		System.out.println("너 종속스레드냐?"+ta.isDaemon()); //주 스레드가 죽고 스레드가 안돌경우 종속스레드
		
		System.out.println("==main의 시작==");
		
		for(int i=1; i<=10; i++) {
			System.out.println("==main의 값:"+i+"==");
		}
		
		System.out.println("==main의 끝==");
	} //요즘 컴퓨터 성능이 좋아 계속 나올수도있음

}
 