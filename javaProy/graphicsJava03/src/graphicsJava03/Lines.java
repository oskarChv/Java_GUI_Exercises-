package graphicsJava03;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Lines extends JPanel{

	public void paint(Graphics g){
		//setting the initial p2 values
		int x2=0;
		int y2 = getHeight();
		
		//setting our limits 
		int xlimit = getWidth()/2;
		//int ylimit = getHeight();
		
		super.paint(g);
		//now we have to calculate the values for the p2(x2,y2)
		while (x2 <= xlimit && y2 >= 0){
			g.drawLine(0, 0, x2, y2);
			//simple math to find the p2 
			x2+=5;
			y2-=5;
		}
	}
}