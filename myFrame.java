package IndianFlag;

import java.awt.*;

import javax.swing.JFrame;

public class myFrame extends JFrame{
	
	flagDraft draft=new flagDraft();
	
	public myFrame()throws HeadlessException{
		setTitle("Indain Flag");
		setSize(900,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(draft);
		setVisible(true);
		
		
	}


}
