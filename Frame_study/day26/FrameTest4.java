package guiTest1;

import java.awt.*;

public class FrameTest4 extends Frame{

	public FrameTest4() {
		
		GridLayout gl = new GridLayout(2, 3, 30, 30); // 행 열 가로 세로 간격
		this.setLayout(gl);
		
		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		Button bt5 = new Button("bt5");
		
		this.add(bt1); 
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		
		Panel p = new Panel(); // 컨테이너이자 컴포넌트
		this.add(p);
		p.setBackground(Color.yellow);
		
		BorderLayout bl = new BorderLayout(20, 20);
		p.setLayout(bl);
		
		Button bt6 = new Button("bt6");
		Button bt7 = new Button("bt7");
		p.add(bt6, "North");
		p.add(bt7, "South");
	}
	
	
	@Override
	public Insets getInsets() { // 경계선 주는것 frame안에 있어서 오버라이딩 시켜서 사용함
		Insets i = new Insets(55,30,30,30);
		return i;
	}


	public static void main(String[] args) {
		
		FrameTest4 ft4 = new FrameTest4();
		ft4.setSize(300, 300);
		ft4.setVisible(true);
		
		

	}

}
