package eventTEST; // 교수님이 말한 람다식

import java.awt.*;
import java.awt.event.*;

public class EventTest4_1 extends Frame implements WindowListener{

	MenuBar mb;
	Menu m_f, m_c, m_cc;
	MenuItem mi_y, mi_g, mi_r, mi_b;
	Label l;

	public EventTest4_1() {

		l = new Label();
		this.add(l, "South");

		mb = new MenuBar();
		this.setMenuBar(mb);

		m_f = new Menu("파일");
		m_c = new Menu("색상");
		mb.add(m_f);
		mb.add(m_c);

		mi_y = new MenuItem("노랑");
		mi_g = new MenuItem("회색");
		m_cc = new Menu("대화색상");

		mi_r = new MenuItem("빨강");
		mi_b = new MenuItem("파랑");

		m_c.add(mi_y);
		m_c.add(mi_g);
		m_c.addSeparator();
		m_c.add(m_cc);
		m_cc.add(mi_r);
		m_cc.add(mi_b);

		// 람다식
		mi_y.addActionListener(e -> this.setBackground(Color.yellow));
		mi_g.addActionListener(e -> this.setBackground(Color.gray));
		mi_r.addActionListener(e -> l.setBackground(Color.red));
		mi_b.addActionListener(e -> l.setBackground(Color.blue));
		
		this.addWindowListener(this);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {	
	}
	@Override
	public void windowClosed(WindowEvent e) {	
	}
	@Override
	public void windowIconified(WindowEvent e) {	
	}
	@Override
	public void windowDeiconified(WindowEvent e) {	
	}
	@Override
	public void windowActivated(WindowEvent e) {	
	}
	@Override
	public void windowDeactivated(WindowEvent e) {	
	}

	public static void main(String[] args) {
		EventTest4 et4 = new EventTest4();
		et4.setSize(300, 300);
		et4.setVisible(true);
	}
}