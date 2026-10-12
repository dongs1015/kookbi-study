package guiTest1;

import java.awt.*;

public class FrameTest6 extends Frame{

	public FrameTest6() {
		GridLayout gl1 = new GridLayout(2, 1);
		this.setLayout(gl1);
		
		Panel p1 = new Panel();
		this.add(p1);
		GridLayout gl2 = new GridLayout(2, 2);
		p1.setLayout(gl2);
		
		Label l1 = new Label("보내는 이");
		Label l2 = new Label("받는 이:");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		
		Panel p2 = new Panel();
		BorderLayout bl1 = new BorderLayout(20, 20);
		
		
		Label l3 = new Label("내가 만들었어 아래에 꼭써라");
		Label l4 = new Label("메세지");
	
		TextArea tx = new TextArea();
		
		
		
	}
	
	
	@Override
	public Insets getInsets() {
		return new Insets(40, 20, 20, 20);
	}


	public static void main(String[] args) {
		FrameTest6 ft6 = new FrameTest6();
		ft6.setSize(300, 300);
		ft6.setVisible(true);


	}

}
