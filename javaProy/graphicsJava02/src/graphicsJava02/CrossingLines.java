package graphicsJava02;
import java.awt.Graphics;
import javax.swing.JPanel;
public class CrossingLines extends JPanel{
	public void paint(Graphics g){
		 super.paint(g);
		 int height = getHeight();
		 int width = getWidth();
		 //the follow line of code draws a vertical line from left to right 
		 g.drawLine(0, 0, height, width);
		 //the follow line of code draws a vertical line from right to left
		 g.drawLine(width, 0, 0, height);
	}
}
