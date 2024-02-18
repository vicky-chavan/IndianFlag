package IndianFlag;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;

public class flagDraft extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.decode("#FF8F1C"));
		g.drawRect(10, 20, 450, 70);
		g.fillRect(10, 20, 450, 70);
		
		g.setColor(Color.white);
		g.drawRect(10, 90, 450, 70);
		g.fillRect(10, 90, 450, 70);
		
		g.setColor(Color.decode("#509E2F"));
		g.drawRect(10, 160, 450, 70);
		g.fillRect(10, 160, 450, 70);
		
		g.setColor(Color.GRAY);
		g.drawRect(10, 20, 10, 550);
		g.fillRect(10, 20,10, 550);
		
		try {
			Image img=ImageIO.read(new FileInputStream("src/1708256066674.jpg"));
			g.drawImage(img,200,90,80,67,null);
			
			g.setFont(new Font("lato", 12, 45));
			g.drawString("Jai Hind..", 50, 400);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	
	}
	

}
