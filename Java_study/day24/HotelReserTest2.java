package day24;

import java.util.*;

public class HotelReserTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, HashMap<String, Boolean>> map = new HashMap<String, HashMap<String, Boolean>>();// 해쉬맵안에 해쉬맵을 선언 동을나타냄
		
		while(true) {
			System.out.println("=====================");  // 출력문
			System.out.println("숙박예약관리프로그램v1.0");
			System.out.println("---------------------");
			System.out.println("1.숙소 동 등록");
			System.out.println("2.방 등록하기");
			System.out.println("3.방 예약하기");
			System.out.println("4.예약 취소하기");
			System.out.println("5.예약 현황보기");
			System.out.println("6.종료");
			System.out.println("=====================");
			System.out.print("메뉴>");
			int menu=sc.nextInt(); // 메뉴 번호받기
			sc.nextLine(); 
			switch(menu) { 
			case 1:             // 1 동 등록
				System.out.println("==새로운 동 등록==");
				System.out.print("추가 할 동 번호를 입력해주세요:");
				String dong = sc.nextLine();
				if(map.get(dong)==null) { // 아직 동이 등록이 된지 안된건지 구분하는코드
					System.out.println(dong+"동 추가되었습니다.");
					map.put(dong,new HashMap<String, Boolean>()); // 동을 추가하는 문장 동을 키값으로받고 뒤에 해쉬맵 생성해서 저장
				}else {
					System.out.println(dong+"동은 이미 추가되었습니다.");
				}
				
				break;
				
			case 2:
				System.out.println("==새로운 방 등록=="); // 2메뉴 방 등록
				System.out.print("어떤동?: ");
				dong = sc.nextLine();
				HashMap<String, Boolean> room = map.get(dong);  // 해당 동의 방 map을 room으로 꺼내옴
					System.out.print("새로등록할 방번호:");
					String num = sc.nextLine();  
					if (room.get(num) == null) { // 룸에 키값 넘을 넣어서 등록된걸 구분함
						System.out.println(dong+" "+num + "호 등록완료되었습니다.");
					    room.put(num, false); //등록됬으면 false로 상태구분
					} else { // key가 이미 있다면 등록된방
					    System.out.println(dong+" "+num + "호는 이미 등록된 방입니다.");
					}
				
				
				break;
			case 3:
				System.out.println("==방 예약하기=="); // 3번 메뉴 방 예약
				System.err.print("어떤동?: ");
				dong=sc.nextLine();
				 room = map.get(dong); //위랑 똑같이 생성
					System.out.print("예약방번호:");
					 num = sc.nextLine();
					if(room.get(num)== false) { // 3번에서 등록된 기본방 상태가 false고 예약할때 true로 변경
						System.out.println(dong+" "+num+"호 예약완료");
						room.put(num, true);
					}else {
						System.out.println(dong+" "+num+"호는 이미 예약된 방입니다.");
					}
				
				break;
			case 4:
				System.out.println("==방 예약 취소하기=="); // 4번 예약 취소예약
				System.err.print("어떤동?: ");
				dong=sc.nextLine();
				room = map.get(dong); // 위와 같이 생성
					System.out.print("취소 방번호:");
					num = sc.nextLine();
					if(room.get(num)==false) { //false 예약안된상태
						System.out.println(dong+" "+num+"호는 이미 빈방입니다.");
					}else { //true라 예약이 된상태라 취소
						System.out.println(dong+" "+num+"호 예약 취소됨");
						room.put(num, false);
					}
				
				
				break;
			case 5:
				System.out.println("==방 예약 현황=="); // 5번 예약 전부다 보여주기
				Iterator<String> dongkeys=map.keySet().iterator(); //동의키를하나씩 꺼낼 이터레이터 생성
				
				while(dongkeys.hasNext()) { //동이 끝날때 까지반복
					dong=dongkeys.next();
					HashMap<String, Boolean> rooms=map.get(dong); //동의 방 맵을 꺼내옴
					
					Iterator<String> roomkeys=rooms.keySet().iterator(); // 룸의 키를 하나씩 꺼낼 이터레이터 생성
					
					while(roomkeys.hasNext()) { // 룸이 끝날때 까지반복
						num = roomkeys.next(); 
						if (rooms.get(num) == false) { // false는 빈방인 상태
							System.out.println(dong+"동"+num + "호: 빈방");
						} else {
							System.out.println(dong+"동"+num + "호: 예약됨");
						}
				}}
				break;
				
				
			case 6: System.exit(0);
			}
			
		}
	}

}
