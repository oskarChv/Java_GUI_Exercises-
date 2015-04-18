package graphicsJava04;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Lines extends JPanel{
	//------------------------------
	//defining our set of points 
	//to make our draw
	//------------------------------
	private int [] p1 = new int[2];
	private int [] p2 = new int[2];
	private int [] p3 = new int[2];
	private int [] p4 = new int[2];
	public void paint(Graphics g){
		
		//setting the initials values 
		int maxWidth = getWidth();
		int maxHeight = getHeight();
		
		p1[0] = 0;
		p1[1] = maxHeight;
		p2[0] = maxWidth;
		p2[1] = maxHeight;
		p3[0] = 0;
		p3[1] = 0;
		p4[0] = maxWidth;
		p4[1] = 0; 
		//-------------------------------------------
		
		while ( p1[0] <= maxWidth && p1[1] >= 0 && p2[0] >= 0 && p2[1]>=0 && 
				p3[0] <= maxWidth && p3[1] <= maxHeight && p4[0] >= 0 &&
				p4[1] <= maxHeight){
			g.drawLine(0, 0, p1[0],p1[1] );
			p1[0]+=10;
			p1[1]-=10;
			
			g.drawLine(maxWidth, 0, p2[0],p2[1]);
			p2[0]-=10;
			p2[1]-=10;
			
			g.drawLine(0, maxHeight, p3[0], p3[1]);
			p3[0]+=10;
			p3[1]+=10;
			
			g.drawLine(maxWidth, maxHeight, p4[0], p4[1]);
			p4[0]-=10;
			p4[1]+=10;
		}
		
	}
}
