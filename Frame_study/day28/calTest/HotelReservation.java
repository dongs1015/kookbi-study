package calTest; // 교수님버전

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HotelReservation extends Frame
		implements ActionListener{
	
	// 공통 컴포넌트
	MenuBar mb;
	Menu m_menu;
	MenuItem mi_reser, mi_cancel, mi_state, mi_close;
	Panel p_main;
	String rooms[];
	
	HashMap<String, Boolean>map;
	
	// main 관련용
	Label lb_main_title;
	
	//예약 관련 컴포넌트
	Label lb_reser_title, lb_reser_msg;
	Button bt_reser_result;
	Checkbox cbs[];
	
	//방 취소 관련 컴포넌트
	Label lb_can_title, lb_can_room, lb_can_msg;
	TextField tf_can_room;
	Button bt_can_cancel;
	
	//현황 관련 컴포넌트
	Label lb_state_title;
	TextArea ta_state_content;
	
	public HotelReservation() {
		
		super("숙박예약관리프로그램");
		
		rooms=new String[] {"101","102","103","201","202","203","301","302","303"};
		map = new HashMap<String, Boolean>();
		for(int i=0; i<rooms.length; i++) {
			map.put(rooms[i], false);
		}
		
		mb = new MenuBar();
		this.setMenuBar(mb);
		m_menu=new Menu("메뉴");
		mb.add(m_menu);
		mi_reser=new MenuItem("방 예약하기");
		mi_cancel=new MenuItem("방 취소하기");
		mi_state=new MenuItem("예약 현황보기");
		mi_close=new MenuItem("종료");
		m_menu.add(mi_reser);
		m_menu.add(mi_cancel);
		m_menu.add(mi_state);
		m_menu.addSeparator(); //구분분석
		m_menu.add(mi_close);
		
		lb_main_title=new Label("숙박 예약 관리 프로그램v2.0",Label.CENTER);
		p_main=new Panel(new BorderLayout());
		p_main.add(lb_main_title);
		this.add(p_main);
		
		mi_reser.addActionListener(this);
		mi_cancel.addActionListener(this);
		mi_state.addActionListener(this);
		mi_close.addActionListener(this);
	}
	/**예약화면 구현 관련 메서드*/
	public void makeReserView() {
		
		p_main= new Panel (new BorderLayout(10, 10));
	// 상단
		lb_reser_title = new Label("방 예약하기", Label.CENTER);
		p_main.add(lb_reser_title, "North");
	//중단 
		Panel p_center = new Panel(new GridLayout(3,3,10,10));
		cbs=new Checkbox[9];
		for(int i=0; i<rooms.length;i++) {
			cbs[i]=new Checkbox(rooms[i]);
			p_center.add(cbs[i]);
			boolean state=map.get(rooms[i]);
			if(state) {
				cbs[i].setState(true);
				cbs[i].setEnabled(false);
			}
		}
		p_main.add(p_center,"Center");
	// 하단
		lb_reser_msg=new Label("메세지:");
		bt_reser_result=new Button("예약하기");
		Panel p_south=new Panel(new BorderLayout(10, 10));
		p_south.add(lb_reser_msg, "Center");
		p_south.add(bt_reser_result, "East");
		p_main.add(p_south,"South");
	
		bt_reser_result.addActionListener(this);
	}
	
	/**방 취소화면 관련 메서드*/
	public void makeCancleView() {
		p_main=new Panel(new BorderLayout());
		//상단
		lb_can_title=new Label("예약 취소하기", Label.CENTER);
		p_main.add(lb_can_title, "North");
		
		//중단
		Panel p_temp1=new Panel(new BorderLayout());
		Panel p_temp2=new Panel(new BorderLayout(10, 10));
		p_temp1.add(p_temp2, "North");
		lb_can_room=new Label("방번호:");
		tf_can_room=new TextField();
		bt_can_cancel=new Button("취소하기");
		p_temp2.add(lb_can_room,"West");
		p_temp2.add(tf_can_room, "Center");
		p_temp2.add(bt_can_cancel,"East");
		p_main.add(p_temp1, "Center");
		//하단
		lb_can_msg=new Label("메세지:", Label.LEFT);
		p_main.add(lb_can_msg,"South");
		
		bt_can_cancel.addActionListener(this);
		
	}
	
	/**현황화면 관련 메서드*/
	public void makeStateView() {
		p_main=new Panel(new BorderLayout(10,10));
		lb_state_title=new Label("방 예약 현황보기", Label.CENTER);
		ta_state_content=new TextArea();
		p_main.add(lb_state_title, "North");
		p_main.add(ta_state_content, "Center");
		
		Iterator<String> keys = map.keySet().iterator(); //이미 가공된 데이터를 전해주는 배열같은 녀석이지만 배열은아님
		String str="";
		while(keys.hasNext()) {
			String key=keys.next(); // 내가입력한 순서가 보정되지않음
			boolean state=map.get(key);
			str+=key+"호실:"+(state?"예약됨":"빈방")+"\n"; // state가 있으면 예약됨 없으면 빈방
		}
		ta_state_content.setText(str);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj =e.getSource();
		
		if(obj==mi_reser) {
			this.remove(p_main); // 지금 패널을 지움
			makeReserView();   
			this.add(p_main);
			this.validate(); // 랜더링
		}else if(obj== mi_cancel) {
			this.remove(p_main);
			makeCancleView();
			this.add(p_main);
			this.validate();
		}else if(obj == mi_state) {
			this.remove(p_main);
			makeStateView();
			this.add(p_main);
			this.validate();
		}else if(obj==bt_reser_result) {
			
			for(int i=0; i<cbs.length; i++) {
				String room=cbs[i].getLabel();
				Boolean state = cbs[i].getState();
				map.put(room, state);
			}
			lb_reser_msg.setText("메세지:예약완료되었습니다.");
		}else if(obj==bt_can_cancel) {
			String userroom=tf_can_room.getText();
			boolean state=map.get(userroom);
			if(state) {
				map.put(userroom, false);
				lb_can_msg.setText("메세지:"+userroom+"호실을 예약취소하였습니다.");
			}else {
				lb_can_msg.setText("메세지:"+userroom+"호실은 이미 빈방입니다.");
			}
		}
		
	}

	public static void main(String[] args) {
			
		HotelReservation hr = new HotelReservation();
		hr.setSize(400, 300);
		hr.setVisible(true);

	}

}
