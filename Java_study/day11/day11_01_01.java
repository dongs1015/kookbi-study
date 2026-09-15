package day11;

public class day11_01_01 {

	public static void main(String[] args) {
		
		int com[]=new int[6];
		
		for(int i=0; i<com.length;i++) {
			com[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i]+" ");
		}

	}

}
