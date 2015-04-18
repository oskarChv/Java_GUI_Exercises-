package graphicsJava04;
import javax.swing.JFrame;
public class Main {
	public static void main(String args[]){
		Lines lines = new Lines();
		JFrame drawFrame = new JFrame();
		
		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawFrame.setSize(400, 400);
		drawFrame.add(lines);
		drawFrame.setVisible(true);
	}
}
