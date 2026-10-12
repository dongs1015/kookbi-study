package FrameTest;

import java.awt.*;

public class FrameTest1_1 extends Frame{ //Frame의 기본형이 BorderLayout형태 바꾸지 않고 진행

	public FrameTest1_1() { 
		//상단
		Panel p_north=new Panel();  //panel의 기본은 FlowLayout형태이기에 바꾸지 않고 진행
		GridLayout gl=new GridLayout(2, 2, 10, 10);
		p_north.setLayout(gl);
		
		Label lb_from=new Label("보내는 이:"); 
		Label lb_to=new Label("받는 이:");
		TextField tf_from=new TextField();
		TextField tf_to=new TextField();
		
		p_north.add(lb_from);
		p_north.add(tf_from);
		p_north.add(lb_to);
		p_north.add(tf_to);
		
		this.add(p_north, "North");
		//중단
		Panel p_center=new Panel();
		BorderLayout bl =new BorderLayout(10, 10);
		p_center.setLayout(bl);
		Label lb_title=new Label("아래에 메세지를 입력하세요.", Label.CENTER);
		Label lb_msg=new Label("메세지:"); 
		TextArea ta_content=new TextArea();
		p_center.add(lb_title,"North");
		p_center.add(lb_msg, "West");
		p_center.add(ta_content,"Center");
		this.add(p_center,"Center");
		//하단
		Panel p_south = new Panel();
		Button bt_send = new Button("보내기");
		Button bt_cancle= new Button("취소");
		p_south.add(bt_send);
		p_south.add(bt_cancle);
		this.add(p_south, "South");
		
	}
	
	@Override
	public Insets getInsets() {
		return new Insets(55, 10, 10, 10);
	}

	public static void main(String[] args) {
		
		FrameTest1_1 ft1 = new FrameTest1_1();
		ft1.setSize(300, 300);
		ft1.setVisible(true);

	}

}
