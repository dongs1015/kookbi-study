package day21;

public class StringTest2 {

	public static void main(String[] args) {

		String str="Hello"; //String의 규칙 원본 불변의 규칙 원본을 훼손할수 없다 조작도 불가능
		
		System.out.println("str="+str);
		//str.concat("java");
		System.out.println("str="+str.concat("java")); // str은 아니고 str에 추가한 새로운 맥락이다
		//str.substring(2, 4);
		System.out.println("str="+str.substring(2, 4)); // 원본은 건들지 못하지만 원본을 새로운 문자열로 돌려서 추출한다
		
		//StringBuffer append (String str)
		//StringBuffer delete (int start, int end)
		//StringBuffer insert (int offset,String str)
		
		StringBuffer sb = new StringBuffer("Hello Java");
		System.out.println("Sb="+sb);  // 우리눈에는 안보이지만 .toString()을 jvm 이 알아서 실행해줌
		sb.append("!!");
		System.out.println("Sb="+sb);
		sb.insert(6, "jsp");
		System.out.println("Sb="+sb);//삽입할려는 위치에 넣기
		sb.delete(9,13);
		System.out.println("Sb="+sb);  // 삭제할려는 자리부터 끝전가찌
	}
}
/*
 * 
 * S와 H의 s에는 str이란이름이 생기고 h에 Hello가 생기고 헬로의 주소가 str에 들어가게 된다
 * concat으로 hellojava가 h의 영역에 생성디고 그 새로운데이터를 반환
 * 원본을 훼손할수없기때문에 새로운 객체가 생기는 문제가 발생
 * 이게 메모리 누수로 이어지게됨 
 * 
 * 
 * 
 * 
 */
