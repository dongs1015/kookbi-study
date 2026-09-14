package day10;

public class day10_03 {

	public static void main(String[] args) {
		int arr[][] = new int [5][5];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] =1;
				if(i==j) {
					arr[i][j]= 2;
				}
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}

	}

}
/*




*/