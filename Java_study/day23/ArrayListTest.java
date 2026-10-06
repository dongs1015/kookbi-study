package day23;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
//		arr.add("java");
//		arr.add("jsp");
//		arr.add("Hello");
		
		for(int i=0; i<arr.size(); i++) {
			int temp=arr.get(i);
			System.out.println(temp);
		}

	}

}
