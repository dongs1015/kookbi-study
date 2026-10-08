package day25;

class ThreadAA extends Thread{
	
	public void run(){
		
		System.out.println("##ThreadAA의 시작##");
		
		for(int i=1; i<=10; i++) {
			System.out.println("##ThreadAA의 값:"+i+"##");
		}
		
		System.out.println("##ThreadAA의 끝##");
	}
}

class ThreadBB implements Runnable{

	@Override
	public void run() {

		System.out.println("$$ThreadBB의 시작$$");
		
		for(int i=1; i<=10; i++) {
			System.out.println("$$ThreadBB의 값:"+i+"$$");
		}
		
		System.out.println("$$ThreadBB의 끝$$");
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {
		
		ThreadAA ta=new ThreadAA();
		ThreadBB tb=new ThreadBB();
		Thread tc =new Thread(tb);
		
		ta.start();
		tc.start();
		
//		ta.yield();
//		tc.yield();
//		Thread.yield(); // 다른쓰레드에 비해 양보하겠다 우선순위 양보 
		// 강제성이없다 예일드
		
		try {
			ta.join();
			tc.join(); // 강제성이 있다 자는행위 sleep과 비슷
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("==main의 시작==");

		for(int i=1; i<=10; i++) {
			System.out.println("==main의 값:"+i+"==");
		}
		
		System.out.println("==main의 끝==");
	

	}

}
