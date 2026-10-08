package day25;

class ThreadA extends Thread{
	
	public void run(){
		
		Thread temp=Thread.currentThread();
		System.out.println("ThreadA의 temp="+temp);
		System.out.println("##ThreadA의 시작##");
		
		for(int i=1; i<=10; i++) {
			System.out.println("##ThreadA의 값:"+i+"##");
		}
		
		System.out.println("##ThreadA의 끝##");
	}
}

class ThreadB implements Runnable{

	@Override
	public void run() {
		
		Thread temp=Thread.currentThread();
		System.out.println("ThreadB의 temp="+temp);
		System.out.println("$$ThreadB의 시작$$");
		
		for(int i=1; i<=10; i++) {
			System.out.println("$$ThreadB의 값:"+i+"$$");
		}
		
		System.out.println("$$ThreadB의 끝$$");
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		//단일(싱글) 쓰레드
		
		ThreadA ta=new ThreadA();
//		다중(멀티) 스레드
//		ta.run();
		
		ThreadB tb=new ThreadB();
		Thread tc =new Thread(tb);           // 제일 많이 사용하는 방법
		
		ta.start();
		tc.start();
		
		ta.setName("#1");
		ta.setPriority(Thread.MAX_PRIORITY);
		tc.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("현재 돌고 았는 스레드의 갯수:"+Thread.activeCount());
		
		Thread temp = Thread.currentThread();
		System.out.println("main의temp="+temp);
		
		System.out.println("==main의 시작==");

		for(int i=1; i<=10; i++) {
			System.out.println("==main의 값:"+i+"==");
		}
		
		System.out.println("==main의 끝==");
	}

}
