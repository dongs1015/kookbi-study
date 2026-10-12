package guiTest1; //교수님버전

import java.awt.*;

public class FrameTest5_1 extends Frame {

	public FrameTest5_1() {

		BorderLayout bl1 = new BorderLayout(20, 20); // 기본을 보더로 위에를 센터 아래를 사우스
		this.setLayout(bl1);
		// 중단
		Panel p_center = new Panel(); // 위에 패널
		GridLayout gl = new GridLayout(2, 2, 10, 10); //패널안을 그리드로 생성
		p_center.setLayout(gl);
		Button bt1 = new Button("bt1"); // 패널안에 버튼
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		p_center.add(bt1);
		p_center.add(bt2);
		p_center.add(bt3);
		p_center.add(bt4);
		this.add(p_center, "Center"); // 첫번째 패널위치 선정
		p_center.setBackground(Color.pink); //패널 색깔

		// 하단
		Panel p_south = new Panel(); // 하단 패널 생성
		BorderLayout bl2 = new BorderLayout(10, 10); 
		p_south.setLayout(bl2); //하단패널 보더로 생성
		p_south.setBackground(Color.blue); 
		Button bt5 = new Button("bt5"); //패널안에 버튼
		Button bt6 = new Button("bt6");
		p_south.add(bt5, "North"); // 위
		p_south.add(bt6, "South"); // 아래
		this.add(p_south, "South");
	}

	@Override
	public Insets getInsets() {
		return new Insets(40 ,20, 20, 20);
	}

	public static void main(String[] args) {

		FrameTest5_1 ft5 = new FrameTest5_1();
		ft5.setSize(300, 300);
		ft5.setVisible(true);

	}

}
