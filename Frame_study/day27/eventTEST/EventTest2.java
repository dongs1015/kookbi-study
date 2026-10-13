package eventTEST;

import java.awt.*;
import java.awt.event.*;

public class EventTest2 extends Frame implements ActionListener{
	
	Button bt1, bt2;
	TextField tf_fr, tf_se, tf_re;
	
	public EventTest2() {
		GridLayout gl = new GridLayout(4, 2, 10, 10);
		this.setLayout(gl);
		
		Label fr=new Label("First Input");
		Label se=new Label("Second Input");
		Label re=new Label("Result");
		tf_fr=new TextField();
		tf_se=new TextField();
		tf_re=new TextField();
		bt1 = new Button("Calc");
		bt2 = new Button("Reset");;
		this.add(fr);
		this.add(tf_fr);
		this.add(se);
		this.add(tf_se);
		this.add(re);
		this.add(tf_re);
		tf_re.setEnabled(false);
		this.add(bt1);
		this.add(bt2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		
		if(bt1==obj) {
			String num1=tf_fr.getText(); // 일단 기본이 문자열이라 문자로받음
			String num2=tf_se.getText();
			int a = Integer.parseInt(num1); // 인트형으로 변환
			int b = Integer.parseInt(num2); 
			int sum = a + b;   // 계산
			tf_re.setText(Integer.toString(sum)); // 다시문자열로 변환
		}else if(bt2==obj) {
			tf_fr.setText("");
			tf_se.setText("");
			tf_re.setText("");
		}
		this.validate();
	}


	public static void main(String[] args) {
		EventTest2 et2 = new EventTest2();
		et2.setSize(300, 300);
		et2.setVisible(true);
	}

}
