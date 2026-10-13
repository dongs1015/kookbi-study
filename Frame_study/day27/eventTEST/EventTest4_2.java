package eventTEST; // ±³¼ö´Ô¹öÀü

import java.awt.*;
import java.awt.event.*;

public class EventTest4_2 extends Frame implements ActionListener{

	MenuBar mb;
	Menu m_color, m_cc;
	MenuItem mi_yellow, mi_gray;
	
	Menu m_subcolor;
	MenuItem mi_red, mi_blue;
	Label lb_test;
	
	public EventTest4_2() {
		mb = new MenuBar();
		this.setMenuBar(mb);
		m_color = new Menu("»ö»ó");
		mb.add(m_color);
		
		mi_yellow = new MenuItem("³ë¶û");
		mi_gray = new MenuItem("È¸»ö");
		
		m_color.add(mi_yellow);
		m_color.add(mi_gray);
		
		mi_yellow.addActionListener(this);
		mi_gray.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				EventTest4_2.this.setBackground(Color.gray);
			}	
		});
		
		lb_test=new Label("test");
		this.add(lb_test,"South");
		
		m_subcolor=new Menu("ÀÌÇÏ»ö»ó");
		m_color.add(m_subcolor);
		mi_red=new MenuItem("»¡°­");
		mi_blue=new MenuItem("ÆÄ¶û");
		m_subcolor.add(mi_red);
		m_subcolor.add(mi_blue);
		
		mi_red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lb_test.setBackground(Color.red);
			}		
		});		
		mi_blue.addActionListener(e -> lb_test.setBackground(Color.blue));
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setBackground(Color.yellow);
	}

	
	public static void main(String[] args) {
		EventTest4_2 et4 = new EventTest4_2();
		et4.setSize(300, 300);
		et4.setVisible(true);

	}

}
