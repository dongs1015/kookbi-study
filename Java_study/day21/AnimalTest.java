package day21;

import java.io.*;

public class AnimalTest {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("어떤 동물인가요?");
		String an = br.readLine();
		
		
		if(an.equals("강아지")) {
			System.out.println(an+"는 멍멍");
		} else if(an.equals("오리")) {
			System.out.println(an+"는 꽥꽥");
		}else if(an.equals("고양이")) {
			System.out.println(an+"는 야옹");
		}else{
			System.out.println("데이터에 없는 동물입니다.");
		}
		
		// 강아지 부분은 되는데 오리랑 고양이는 안됨
		// h영역에있는 고양이나 오리 강아지의 주소를 받아온 an 100을 지금동물과 비교한거라
		//틀릴수밖에없다.

	}

}
