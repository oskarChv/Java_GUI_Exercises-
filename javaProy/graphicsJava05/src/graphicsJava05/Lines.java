package graphicsJava05;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lines extends JPanel {
	
	private int [] p1 = new int[2];
	private int [] p2 = new int[2];
	
	public void paint (Graphics g){
		
		int maxWidth= getWidth();
		int maxHeight = getHeight();
		
		p1[0] = 0;
		p1[1] = maxHeight;
                p2[0] = 0;
                p2[1] = 0;
		
		while ( p1[0] <= maxWidth && p2[0]<= maxHeight){
			
			g.drawLine(0, 0, p1[0],maxHeight);
			p1[0]+=20;
			
			g.drawLine(maxWidth, maxHeight, p2[0], p2[1]);
                        p2[1] +=20;
                        
		}
	}
}
