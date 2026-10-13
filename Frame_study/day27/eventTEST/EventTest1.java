package eventTEST;

import java.awt.*;
import java.awt.event.*;

public class EventTest1 extends Frame implements ActionListener{

	Button bt_red, bt_blue, bt_green;
	
	public EventTest1() {
		
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(fl);
		
		bt_red=new Button("Red");
		bt_blue=new Button("Blue");
		bt_green=new Button("Green");
		
		this.add(bt_red);
		this.add(bt_blue);
		this.add(bt_green);
		
		bt_red.addActionListener(this);
		bt_blue.addActionListener(this);
		bt_green.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		System.out.println("test:"+str);
		
		Object obj=e.getSource();
		
		if(bt_red==obj) {
			this.setBackground(Color.red);
			FlowLayout fl_t=new FlowLayout(FlowLayout.LEFT);
			this.setLayout(fl_t); // 사진을 바꾸려고 하는 행위 지금 기존거 따로 지금 하려는 사진 따로라 새로 다시 인화해서 새사진이 나오도록해야함
		}else if(bt_blue==obj){
			this.setBackground(Color.blue);
			FlowLayout fl_t=new FlowLayout(FlowLayout.CENTER);
			this.setLayout(fl_t);
		}else if(bt_green==obj) {
			this.setBackground(Color.green);
			FlowLayout fl_t=new FlowLayout(FlowLayout.RIGHT);
			this.setLayout(fl_t);
		}
		this.validate(); // 화면에대한 재검증 랜더링 작업, 랜더링검증
//		str.equals(str)
	}

	public static void main(String[] args) {
		
		EventTest1 et1 = new EventTest1();
		et1.setSize(300, 300);
		et1.setVisible(true);
	}

}
