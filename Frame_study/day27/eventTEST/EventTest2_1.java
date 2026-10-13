package eventTEST;

import java.awt.*;
import java.awt.event.*;

public class EventTest2_1 extends Frame implements ActionListener{

	Label lb_first,lb_second, lb_result;
	TextField tf_first, tf_second, tf_result;
	Button bt_cal, bt_reset;
	
	
	public EventTest2_1() {
		GridLayout gl = new GridLayout(4, 2, 10, 10);
		this.setLayout(gl);
		
		lb_first=new Label("첫번째 수:");
		lb_second=new Label("두번째 수:");
		lb_result=new Label("결과:");
		
		tf_first=new TextField();
		tf_second=new TextField();
		tf_result=new TextField();
		
		bt_cal = new Button("결과");
		bt_reset = new Button("초기화");
		
		this.add(lb_first);
		this.add(tf_first);
		this.add(lb_second);
		this.add(tf_second);
		this.add(lb_result);
		this.add(tf_result);
		this.add(bt_cal);
		this.add(bt_reset);
		
		tf_result.setEditable(false); 
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 핸들러
		String str=e.getActionCommand(); //이름 액션커멘드 
		Object obj = e.getSource(); //본인 이벤트 근원지의 주소
		if(obj==bt_cal) {
			//String num1_s=br.readLine();
			//int num2=Integer.parseInt(br.readLine());
			String num1_s=tf_first.getText();
			int num1=Integer.parseInt(num1_s);
			int num2=Integer.parseInt(tf_second.getText());
			int result=num1+num2;
			tf_result.setText(Integer.toString(result));
			//""+result 먼저계산한게 문자열이라 바뀜 이게 보통쓰는법
		}else if(obj==bt_reset) {
			tf_first.setText("");
			tf_second.setText("");
			tf_result.setText("");
		}
		
	}

	public static void main(String[] args) {
		EventTest2_1 et2 = new EventTest2_1();
		et2.setSize(300, 300);
		et2.setVisible(true);

	}

}
