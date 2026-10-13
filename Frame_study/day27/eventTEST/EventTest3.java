package eventTEST;

import java.awt.*;
import java.awt.event.*;


public class EventTest3 extends Frame 
		implements ActionListener,WindowListener{

	MenuBar mb;// 빨랫줄
	Menu m_file;// 옷걸이
	MenuItem mi_save, mi_load, mi_close; //빨래
	
	public EventTest3() {
		
		mb=new MenuBar();
		this.setMenuBar(mb); // 세팅하는개념 set
		
		m_file=new Menu("파일");
		mb.add(m_file); // 추가하는개념 add 
		
		mi_save=new MenuItem("저장하기");
		mi_load=new MenuItem("불러오기");
		mi_close=new MenuItem("종료하기");
		m_file.add(mi_save);
		m_file.add(mi_load);
		m_file.addSeparator();
		m_file.add(mi_close);
		
		mi_save.addActionListener(this);
		mi_load.addActionListener(this);
		mi_close.addActionListener(this);
		
		
		this.addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==mi_save) {
			//FileDialog (Frame  parent, String  title, int mode)
			FileDialog fd = new FileDialog(this, "자바용의 파일 저장하기", FileDialog.SAVE);
			fd.setVisible(true);
			
			System.out.println(fd.getDirectory()+"/"+fd.getFile()); 
			
		}else if(obj==mi_load){
			
		}else if(obj==mi_close) {
			System.exit(0);
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("test1");
		System.exit(0);
		this.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("test2");
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
		
		EventTest3 et3 =new EventTest3();
		et3.setSize(300, 300);
		et3.setVisible(true);

	}

}
