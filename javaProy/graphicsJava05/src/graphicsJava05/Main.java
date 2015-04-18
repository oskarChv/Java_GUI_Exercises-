package graphicsJava05;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		Lines lines = new Lines();
		JFrame drowFrame = new JFrame();
		
		drowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drowFrame.setSize(300, 300);
		drowFrame.add(lines);
		drowFrame.setVisible(true);

	}

}
