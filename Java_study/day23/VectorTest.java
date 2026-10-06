package day23;

import java.util.*;

public class VectorTest {

	public static void main(String[] args) {

//		Vector (int initialCapacity, int capacityIncrement)
//        지정된 용량과 증가량으로 빈 상태(empty)의 Vector 를 작성합니다.
		
		Vector v =new Vector(3,4); // 초기공간 3 증가치 4 
		
		System.out.println("v의 저장공간:"+ v.capacity()); //배열의 length와 동일
		System.out.println("v에 저장된 데이터 갯수:"+v.size());
		
		for(int i=1; i<=9; i++) {
			v.add(new Integer(i)); // 래퍼런스로 바꾸기위한 Integer
//			v.add(i) //autoboxing 기본형값을 자동으로 래퍼런스로 매핑함
		}
		
		/*
		 * 배열                  | 콜렉션
		 * ------------------------------------------
		 * 고정크기               | 가변길이 크기
		 * 기본,레퍼런스			|  레퍼런스만 (기본자료형 autoboxing)
		 * 고정데이터              | 다양한 자료형 
		 */
		
		
		v.add("Hi");
		v.add("Hello");
		v.add(true);
		System.out.println("");
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i)); //v[i[]
		}
		System.out.println("v의 저장공간:"+ v.capacity()); //배열의 length와 동일
		System.out.println("v에 저장된 데이터 갯수:"+v.size());
		//5번째 인덱스의 값을 변수에 담아 출력
		Integer in=(Integer) v.get(5); //unboxing 레퍼타입에서 기본자료형쪽으로 바꾸는걸 언박싱
		System.out.println("in="+in);
		
		int on=(Integer)v.get(5);
		System.out.println("on="+on);
		
		Vector<String> v2 = new Vector<String>();
		
		//v.add
		v2.add("Hello");		
		v2.add("Hi");
		v2.add("java");
//		v2.add(1); v2가 제네릭을 사용해 String 선언되서 문자열만 가능하다
		
		for(int i=0; i<v2.size(); i++) {
			String temp=v2.get(i);
			System.out.println(temp);
		}
	}
}