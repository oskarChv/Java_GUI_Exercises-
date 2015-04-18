package graphicsJava03;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		Lines lines = new Lines();
		JFrame drawFrame = new JFrame();
		
		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawFrame.add(lines);
		drawFrame.setSize(400, 200);
		drawFrame.setVisible(true);
	}
}
