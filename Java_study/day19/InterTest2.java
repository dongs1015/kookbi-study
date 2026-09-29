package day19;

import java.awt.*;
import java.awt.event.*;

public class InterTest2 extends Frame implements WindowListener{

	public InterTest2() {
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

	@Override
	public void windowClosed(WindowEvent e) {
		
		
	}

	public static void main(String[] args) {

		InterTest2 it2=new InterTest2();
		it2.setSize(300,300);
		it2.setVisible(true);
	}

}
