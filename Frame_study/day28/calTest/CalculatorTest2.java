package calTest;

import java.awt.*;
import java.awt.event.*;

public class CalculatorTest2 extends Frame implements ActionListener{

	TextField tf_content;
	Button bts[];
	String strs[];
	int result;
	String oper;
	
	public CalculatorTest2() {
		
		result=0;
		oper="";
		
		tf_content=new TextField();
		this.add(tf_content,"North");
		
		Panel p_center=new Panel(new GridLayout(4,4,10,10));
		this.add(p_center,"Center");
		
		strs=new String[] {"1","2","3","+","4","5","6","-","7","8","9","*","c","0","=","/"};
		bts=new Button[16];  //16개가 들어갈 주소
		for(int i=0; i<strs.length; i++) { 
			bts[i]=new Button(strs[i]); // 변수0 부터 15까지 쭉 주소에 변수를 넣음
			p_center.add(bts[i]);
			bts[i].addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String str=e.getActionCommand();
		System.out.println("test="+str); // 잘 들어가고있는지 확인
		
		if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")) {
			tf_content.setText(tf_content.getText()+str);
			oper=str; //연산자 찾고 연산자를 oper에 넣어놓음
			
		}else if(str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||
				str.equals("5")||str.equals("6")||str.equals("7")||
				str.equals("8")||str.equals("9")||str.equals("0")){	
			
			tf_content.setText(tf_content.getText()+str); 
			if(oper.equals("")||oper.equals("+")) { // 계산처리
				result+=Integer.parseInt(str);
			}else if(oper.equals("-")) {
				result-=Integer.parseInt(str);
			}else if(oper.equals("*")) {
				result*=Integer.parseInt(str);
			}else if(oper.equals("/")) {
				result/=Integer.parseInt(str);
			}
			
		}else if(str.equals("=")) { // 결과
			tf_content.setText(""+result);
		}else if(str.equals("c")) { // 초기화
			tf_content.setText("");
			result=0;
			oper="";
		}
		
	}

	public static void main(String[] args) {
		
		CalculatorTest2 ca = new CalculatorTest2();
		ca.setSize(300, 300);
		ca.setVisible(true);
		

	}

}
