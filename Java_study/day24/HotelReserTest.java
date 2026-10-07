package day24;

import java.util.*;

public class HotelReserTest {

    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Boolean>map=new HashMap<Integer,Boolean>();
    //boolean의 기본값은 false
    //1.방등록
    public void addRoom(){
        System.out.println("==새로운 방 등록==");
        System.out.print("새로등록할 방번호:");
        int room = sc.nextInt();
        sc.nextLine();
        if(map.get(room)!=null) {//null 등록된거
            System.out.println(room+"이미 등록된 방입니다.");
        }else {
            map.put(room, false);//false 등록안된방
                System.out.println(room+"호 등록 완료하였습니다.");
            }
        }
    //2.방예약하기
    public void reserve() {
        System.out.println("==방 예약하기==");
        System.out.print("예약한 방번호:");
        int room = sc.nextInt();
        sc.nextLine();
        if(map.get(room)==null) {
            System.out.println(room+"호는 등록되지 않은방입니다.");
        }else {
            map.put(room, true);
            System.out.println(room+"호 예약 완료!");
        }
    }
  //3.방예약취소하기
    public void cancel() {
        System.out.println("==방 예약 취소하기==");
        System.out.print("취소 방번호:");
        int room = sc.nextInt();
        sc.nextLine();
        if(map.get(room)== null) {
            System.out.println(room+"호는 등록되지 않았습니다.");
        }else if(map.get(room)==false){
        System.out.println(room+"호는 빈방입니다.");
        }else {
            map.put(room, false);
            System.out.println(room+"호 예약최소됨!");
        }
    }
    //4.예약 현황보기
    public void showall() {
        System.out.println("==방 예약 현황==");
        Iterator<Integer>keys=map.keySet().iterator();
        while(keys.hasNext()) {
            int room =keys.next();
            if(map.get(room)==true) {
                System.out.println(room+"호:예약됨");
            }else {
                System.out.println(room+"호:빈방");
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HotelReserTest h=new HotelReserTest();

    while(true) {
        System.out.println("====================");
        System.out.println("숙박예약관리프로그램 V1.0");
        System.out.println("--------------------");
        System.out.println("1.방 등록하기");
        System.out.println("2.방 예약하기");
        System.out.println("3.예약 취소하기");
        System.out.println("4.에약 현황보기");
        System.out.println("5.종료");
        System.out.println("====================");
        System.out.print("메뉴>");
        int menu=sc.nextInt();
        sc.nextLine();

        switch(menu) {
        case 1:
            h.addRoom();
            break;
        case 2:
            h.reserve();
            break;
        case 3:
            h.cancel();
            break;
        case 4:
            h.showall();
            break;
        case 5:
            System.out.println("시스템이 종료되었습니다.");
            System.exit(0);
        }
    }



    }

}
