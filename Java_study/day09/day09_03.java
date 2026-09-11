package day09;

public class day09_03 {

	public static void main(String[] args) {
		
		int x[]= {10,20,30,40,50};
		int y[]= {100,200,300};
		
		for(int i=0; i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for(int i=0; i<y.length; i++) {
			System.out.print(y[i]+" ");
		}
		System.out.println();
		System.out.println("=============");
		
		int temp[]=x;
		x=y;
		y=temp;
		for(int i=0; i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for(int i=0; i<y.length; i++) {
			System.out.print(y[i]+" ");
		}
		
		
		
		
		
		
	}

}
