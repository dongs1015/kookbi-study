package day23; // day22_06 교수님버전

import java.util.*;

public class day23_02 {

	public static void main(String[] args) {

		String str="홍길동,20/서울 둘리,30/부천 도우너,40/인천";
		
		StringTokenizer st = new StringTokenizer(str,",/ ");
		
		System.out.println("==회원 이름 목록==");
		while(st.hasMoreTokens()) {
			String name=st.nextToken(); // 이름 추출
			st.nextToken();
			st.nextToken(); //System.in.read(); 스킵하는거랑 역할같음
			
			
			System.out.println(name);
		}
	}

}
