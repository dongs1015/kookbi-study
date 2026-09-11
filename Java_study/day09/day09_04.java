package day09;

public class day09_04 {

	public static void main(String[] args) {
		
		int x[]= {10,20,30,40,50};
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println("===============");
		
		int y[] =x;
		y[2] =1004;
		for(int i =0; i<y.length;i++) {
			System.out.print(y[i]+" ");
		System.out.println();
		System.out.println("===============");
		}
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
			
			
		}
		

	}


