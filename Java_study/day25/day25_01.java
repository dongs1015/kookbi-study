package day25;

import java.util.*;


public class day25_01 {

	public static void main(String[] args) {
		
//		int y=now.get(Calendar.YEAR);		
//		int m=now.get(Calendar.MONTH)+1;
//		int d=now.get(Calendar.DATE);
//		System.out.println(y+"년 "+m+"월 "+d+"일 ");
		

			while(true) {
			Calendar now=Calendar.getInstance();
			
			int h=now.get(Calendar.HOUR);
			int mi=now.get(Calendar.MINUTE);
			int s=now.get(Calendar.SECOND);
			System.out.print("\r"+h+"시 "+mi+"분 "+s+"초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//while(true) {
//String str=h+"시 "+mi+"분 "+s+"ch";
//System.out.print("\r"+str);}
//try {
//	Thread.sleep(1000);
//} catch (InterruptedException e) {
//	e.printStackTrace();
//}