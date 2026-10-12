package FrameTest;

import java.awt.*;

public class FrameTest1 extends Frame{

	public FrameTest1(String title) {
		GridLayout gl1 = new GridLayout(2, 1);
		this.setLayout(gl1);
		
		Panel p1 = new Panel();
		this.add(p1);
		GridLayout gl2 = new GridLayout(3, 1);
		p1.setLayout(gl2);
		Panel p4 = new Panel();
		p1.add(p4);
		Panel p5 = new Panel();
		p1.add(p5);
		Panel p6 = new Panel();
		p1.add(p6);
		BorderLayout bl2 = new BorderLayout(20, 0);
		p4.setLayout(bl2);
		BorderLayout bl3 = new BorderLayout(20, 0);
		p5.setLayout(bl3);
		BorderLayout bl4 = new BorderLayout(20, 20);
		p6.setLayout(bl4);
		Label l1 = new Label("보내는 이:");
		Label l2 = new Label("받는 이:");
		Label l3 = new Label("내가 만들었어 아래에 꼭써라");
		l1.setPreferredSize(new Dimension(80, 20));
		l2.setPreferredSize(new Dimension(80, 20));
		l3.setAlignment(Label.CENTER);
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		p4.add(l1, "West");
		p4.add(tf1, "Center");
		p5.add(l2, "West");
		p5.add(tf2, "Center");
		p6.add(l3, "Center");
		
		Panel p2 = new Panel();
		this.add(p2);
		BorderLayout bl1 = new BorderLayout(20, 20);
		p2.setLayout(bl1);
		
		
		
		Label l4 = new Label("메세지:");
		Panel p3 = new Panel();
		TextArea tx = new TextArea();
		
		
		p2.add(l4, "West");
		p2.add(tx, "Center");
		p2.add(p3, "South");
		
		Button bt1 = new Button("보내기");
		Button bt2 = new Button("취소");
		p3.add(bt1);
		p3.add(bt2);
		
		
	}
	
	
	@Override
	public Insets getInsets() {
		return new Insets(40, 20, 20, 20);
	}


	public static void main(String[] args) {
		FrameTest1 ft6 = new FrameTest1("메세지보내기");
		ft6.setSize(300, 300);
		ft6.setVisible(true);


	}

}
