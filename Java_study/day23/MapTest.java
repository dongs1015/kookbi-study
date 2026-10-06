package day23;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("two", "둘");
		map.put("plate", "접시");
		//put은 앞에가 key 뒤에가 value값
		
		System.out.println("apple은 뭐야:"+map.get("apple"));
		System.out.println("two은 뭐야:"+map.get("two"));
		System.out.println("plate은 뭐야:"+map.get("plate"));
		
		map.put("apple","아이폰");
		System.out.println("apple은 뭐라고?:" +map.get("apple")); //추가가 아닌 갱신 add는 추가
		
		Iterator<String> keys= map.keySet().iterator();
		
		while(keys.hasNext()) {
			String key=keys.next();
			String value=map.get(key);
			System.out.println("key="+key+"/value="+value); // key에대한 순서는 보장되지 않는다 
		}
	}

}
