package calTest;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorTest extends Frame implements ActionListener{

	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,
	bt_add,bt_min,bt_mul,bt_div,bt_res,bt_clr;
	TextField tf_result;
	Panel p;
	ArrayList<String> arr = new ArrayList<String>();
	
	public CalculatorTest() {

		tf_result=new TextField();
		this.add(tf_result, "North");
		tf_result.setEditable(false);
		
		p = new Panel();
		GridLayout gr = new GridLayout(4, 4, 10, 10);
		this.add(p);
		p.setLayout(gr);
		
		bt0 = new Button("0");
		bt1 = new Button("1");
		bt2 = new Button("2");
		bt3 = new Button("3");
		bt4 = new Button("4");
		bt5 = new Button("5");
		bt6 = new Button("6");
		bt7 = new Button("7");
		bt8 = new Button("8");
		bt9 = new Button("9");
		bt_add = new Button("+");
		bt_min = new Button("-");
		bt_mul = new Button("*");
		bt_div = new Button("/");
		bt_res = new Button("=");
		bt_clr = new Button("C");
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		p.add(bt_add);
		p.add(bt4);
		p.add(bt5);
		p.add(bt6);
		p.add(bt_min);
		p.add(bt7);
		p.add(bt8);
		p.add(bt9);
		p.add(bt_mul);
		p.add(bt_clr);
		p.add(bt0);
		p.add(bt_res);
		p.add(bt_div);	
		
		bt0.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		bt_add.addActionListener(this);
		bt_min.addActionListener(this);
		bt_mul.addActionListener(this);
		bt_div.addActionListener(this);
		bt_res.addActionListener(this);
		bt_clr.addActionListener(this);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==bt0) {
			tf_result.setText(tf_result.getText()+"0");
			arr.add("0");
		}else if(obj==bt1) {
			tf_result.setText(tf_result.getText()+"1");
			arr.add("1");
		}else if(obj==bt2) {
			tf_result.setText(tf_result.getText()+"2");
			arr.add("2");
		}else if(obj==bt3) {
			tf_result.setText(tf_result.getText()+"3");
			arr.add("3");
		}else if(obj==bt4) {
			tf_result.setText(tf_result.getText()+"4");
			arr.add("4");
		}else if(obj==bt5) {
			tf_result.setText(tf_result.getText()+"5");
			arr.add("5");
		}else if(obj==bt6) {
			tf_result.setText(tf_result.getText()+"6");
			arr.add("6");
		}else if(obj==bt7) {
			tf_result.setText(tf_result.getText()+"7");
			arr.add("7");
		}else if(obj==bt8) {
			tf_result.setText(tf_result.getText()+"8");
			arr.add("8");
		}else if(obj==bt9) {
			tf_result.setText(tf_result.getText()+"9");
			arr.add("9");
		}else if(obj==bt_add) {
			tf_result.setText(tf_result.getText()+"+");
			arr.add("+");
		}else if(obj==bt_min) {
			tf_result.setText(tf_result.getText()+"-");
			arr.add("-");
		}else if(obj==bt_mul) {
			tf_result.setText(tf_result.getText()+"*");
			arr.add("*");
		}else if(obj==bt_div) {
			tf_result.setText(tf_result.getText()+"/");
			arr.add("/");
		}else if(obj==bt_res) {
			 // 비었거나 연산자로 끝나면 계산 안 함 (항목 수가 짝수면 연산자로 끝난 것)
		    if(arr.size() == 0 || arr.size() % 2 == 0) {
		        return;
		    }

		    // 1단계: * / 먼저 계산
		    for(int i=0; i<arr.size(); i++) {
		        String s = arr.get(i);
		        if(s.equals("*") || s.equals("/")) {
		            double a = Double.parseDouble(arr.get(i - 1));   // 연산자 앞 숫자
		            double b = Double.parseDouble(arr.get(i + 1));   // 연산자 뒤 숫자

		            if(s.equals("/") && b == 0) {
		                tf_result.setText("Error");
		                arr.clear();
		                return;
		            }

		            double r;
		            if(s.equals("*")) {
		                r = a * b;
		            } else {
		                r = a / b;
		            }

		            arr.set(i - 1, String.valueOf(r));   // 결과를 앞 숫자 칸에 넣기
		            arr.remove(i);                       // 연산자 칸 삭제
		            arr.remove(i);                       // 뒤 숫자 칸 삭제
		            i--;                                 // 칸이 줄었으니 인덱스 되돌리기
		        }
		    }

		    // 2단계: + - 왼쪽부터 계산
		    double result = Double.parseDouble(arr.get(0));
		    for(int j=1; j<arr.size(); j+=2) {
		        String op = arr.get(j);
		        double b = Double.parseDouble(arr.get(j + 1));

		        if(op.equals("+")) {
		            result = result + b;
		        } else {
		            result = result - b;
		        }
		    }

		    // 화면에 출력 (정수면 .0 제거)
		    if(result == (long) result) {
		        tf_result.setText(String.valueOf((long) result));
		    } else {
		        tf_result.setText(String.valueOf(result));
		    }

		    arr.clear();   // 다음 계산을 위해 비우기

		}else if(obj==bt_clr) {
			tf_result.setText("");
			arr.clear();
		}
	}
	
	public Insets getInsets() {
		return new Insets(55, 10, 10, 10);
	}


	public static void main(String[] args) {
		CalculatorTest ca = new CalculatorTest();
		ca.setSize(300, 300);
		ca.setVisible(true);
	}

}
