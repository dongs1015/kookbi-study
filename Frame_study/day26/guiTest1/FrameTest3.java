package guiTest1;

import java.awt.*;

public class FrameTest3 extends Frame{

	public FrameTest3() {
		
		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		Button bt5 = new Button("bt5");
		
		BorderLayout bl = new BorderLayout(30, 30);
		this.setLayout(bl);
		
		this.add(bt1, BorderLayout.WEST);
		this.add(bt2, BorderLayout.NORTH);
		this.add(bt3, BorderLayout.EAST);
		this.add(bt4, "Center");
		this.add(bt5, "South");
	}
	
	
	@Override
	public Insets getInsets() { // 내가아닌 jvm이 호출하는 메소드
		Insets i = new Insets(55, 30, 30, 30);
		return i;
	}


	public static void main(String[] args) {
		
		FrameTest3 ft3 = new FrameTest3();
		ft3.setSize(300, 300);
		ft3.setVisible(true);
		
		
	}

}
// 1이랑 같아보이지만 상속받아서 할때는 겟인섹트를 사용해서 간격이나 넓이 를 정할수있다 1에서는 사용못했음