package calTest; //미완성

import java.awt.*;
import java.awt.event.*;

public class HotelRaserTest extends Frame 
	implements ActionListener{

	MenuBar mb;
	Menu m;
	MenuItem mi_r, mi_c, mi_s, mi_e;
	String strs[];
	Checkbox ch[];
	Panel p1, p2, p3, p4, p5, p6;
	Button bt1, bt2;
	Label l1, l2, l3, l4, l5, l6;
	TextField tf1;
	public HotelRaserTest() {
		//기본 화면
		l1 = new Label("숙박 v2.0", Label.CENTER);
		this.add(l1, "Center");
		mb = new MenuBar();
		this.setMenuBar(mb);
		
		m = new Menu("메뉴");
		mb.add(m);
		
		mi_r=new MenuItem("방 예약");
		mi_c=new MenuItem("방 취소");
		mi_s=new MenuItem("예약 현황");
		mi_e=new MenuItem("종료");
		
		m.add(mi_r);
		m.add(mi_c);
		m.add(mi_s);
		m.addSeparator();
		m.add(mi_e);
		
		mi_r.addActionListener(this);
		mi_c.addActionListener(this);
		mi_s.addActionListener(this);
		mi_e.addActionListener(this);
		// 예약 화면
		GridLayout gr = new GridLayout(3,3,10,10); // 세팅
		BorderLayout bl = new BorderLayout();
		BorderLayout bl2 = new BorderLayout();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p1.setLayout(bl);
		p2.setLayout(gr);
		
		l2 = new Label("방 예약", Label.CENTER);//상단
		p1.add(l2, "North");
		
		p1.add(p2, "Center");  // 중단
		strs = new String[] {"101","102","103","201","202",
				"203","301","302","303"};
		ch = new Checkbox[9];
		for(int i =0; i<strs.length; i++) {
			ch[i] = new Checkbox(strs[i]);
			p2.add(ch[i]);
		}
		
		p1.add(p3, "South"); // 하단
		p3.setLayout(bl2);
		bt1 = new Button();
		l3 = new Label("메시지: _____________",Label.LEFT);
		p3.add(l3,"West");
		p3.add(bt1, "Center");
		bt1.addActionListener(this);
		// 방 취소하기
		BorderLayout gr2 = new BorderLayout(); // 세팅
		BorderLayout gr3 = new BorderLayout();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		l4 = new Label("방 취소", Label.CENTER);
		l5 = new Label("방 번호");
		l6 = new Label("메세지: ", Label.LEFT);
		tf1 = new TextField();
		bt2 = new Button("취소");
		p4.setLayout(gr2); 
		p5.setLayout(gr3);
		
		p4.add(l4,"North"); // 상단
		
		p4.add(p5,"South"); // 중단
		p6.add(l5);
		p6.add(tf1);
		p6.add(bt2);
			 
		p4.add(p6, "Center");	//하단
		p5.add(l6);
		
		bt2.addActionListener(this);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj =e.getSource();
		if(obj==mi_r) {
			this.removeAll(); // 기존 화면 제거
		    this.add(p1, "Center"); // 새 방 붙히기
		    this.validate(); // 새방 적용하기
		   
		}else  if(obj==bt1) {
	    	for(int i=0; i<ch.length; i++) {
	            if(ch[i].getState()) {          // 체크된 방이면
	                ch[i].setEnabled(false);    // 이 방만 선택 불가
	            }
	    	}
	    	l3.setText("메시지: 예약되었습니다. ");
	    	
	    }else if(obj==mi_c) {
	    	this.removeAll();
		    this.add(p4, "Center");
		    this.validate();
	    	
		}else  if(obj==bt2) {
	    	String num1 = tf1.getText(); // 메세지 받아오기
	    	
	    	for(int i= 0; i<ch.length; i++) {
	    		if(strs[i].equals(num1)) { //strs[]의 배열안에 num1이 있다면
	    			if(ch[i].getState()) { // 만약 체크된방일경우
	    				ch[i].setState(false); // 체크상태 해제
	    				ch[i].setEnabled(true); // 선택가능상태로 변경
	    				l6.setText("메시지: 예약취소되었습니다. ");
	    			}else {
	    				l6.setText("메시지: 예약되지 않았습니다. ");
	    			}
	    		}
	    	}
	    	
	    	
	    	}
	    	else if(obj==mi_s) {
			
		}else if(obj==mi_e) {
			
		}
	}

	public static void main(String[] args) {
		HotelRaserTest hr = new HotelRaserTest();
		hr.setSize(300, 300);
		hr.setVisible(true);

	}

}
