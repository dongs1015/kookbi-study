package day21;

import java.io.*;

public class ExcepTest {

	public static void main(String[] args) {
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		// 버퍼드리더가 외부 자원임
		try {
		System.out.print("몇 개의 데이터를 입력하실거에요? ");
		int user = Integer.parseInt(br.readLine());
		
		int arr[]=new int [user];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"번째 데이터:");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.print("몇번째 데이터를 확인하시겠습니까?");
		int num=Integer.parseInt(br.readLine());
		System.out.println("선택된 데이터:"+arr[num-1]);
		}catch(IOException e) {
			System.out.println("입출력에 관련된 예외가 발생함!");
		}catch(NumberFormatException e) {
			System.out.println("숫자만을 입력하셔야합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("지정된 범위에서만 출력가능합니다.");
		}catch(NegativeArraySizeException e) {
			System.out.println("공간은 항상 양수로 만들어야합니다.");
		}catch(Exception e) {
			System.out.println("고객센터 연락바람");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
