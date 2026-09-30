package day20;

import java.io.*;

public class ExcepTest5 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		
		
		try {
			System.out.print("몇 개의 데이터를 입력하실거에요? ");
			count = Integer.parseInt(br.readLine());
			
			int arr[] = new int [count];
			
			for(int i=0; i<count; i++) {
				System.out.print("데이터"+(i+1)+"값=");
				arr[i]= Integer.parseInt(br.readLine());	
			}
			System.out.print("출력하고싶은 값이 몇번째에 있나요? ");
			int i = Integer.parseInt(br.readLine());
			System.out.println("선택한 값은: " + arr[i-1]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("값을 제대로 입력해주세요.");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
		}catch(NegativeArraySizeException e) {
			System.out.println("처음 숫자는 -를 입력할수 없습니다.");
		}
		
	}

}
