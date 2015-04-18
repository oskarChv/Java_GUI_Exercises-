package graphicsJava01;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Line extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		int width= getWidth();//the total width 
		int height= getHeight();//the total height
		
		//this is the line that makes the draw
		g.drawLine(0, 0, width, height); 
	}
}