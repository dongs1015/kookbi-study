package guiTest1;

import java.awt.*;

public class FrameTest5 extends Frame{

	public FrameTest5() {
		
		GridLayout gl = new GridLayout(2, 1, 40, 30);
		this.setLayout(gl);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		this.add(p1);
		
		GridLayout gl2 = new GridLayout(2, 2, 10, 10);
		p1.setLayout(gl2);
				
		Button bt4 = new Button("bt4");
		Button bt5 = new Button("bt5");
		Button bt6 = new Button("bt6");
		Button bt7 = new Button("bt7");
		
		p1.add(bt4);
		p1.add(bt5);
		p1.add(bt6);
		p1.add(bt7);
		
		this.add(p2);
		
		p1.setBackground(Color.pink);
		
		

		
		
		GridLayout gl3 = new GridLayout(3, 1, 20, 0);
		p2.setLayout(gl3);
		Button bt1 = new Button("bt1");
		Panel p3 = new Panel();
		p3.setBackground(Color.blue);
		Button bt3 = new Button("bt3");
		p2.add(bt1);
		p2.add(p3);
		p2.add(bt3);
		
//		BorderLayout bl = new BorderLayout(10, 10);
//		p2.setLayout(bl);
//		
//		Button bt1 = new Button("bt1");
//		Button bt2 = new Button("bt3");
//		
//		p2.add(bt1, "North");
//		p2.add(bt2, "South");
		
			
	}
	
	
	@Override
	public Insets getInsets() {
		Insets i = new Insets(20, 20 ,20, 20);
		return i;
	}


	public static void main(String[] args) {

		FrameTest5 ft5 = new FrameTest5();
		ft5.setSize(300, 300);
		ft5.setVisible(true);
	
		

	}

}
