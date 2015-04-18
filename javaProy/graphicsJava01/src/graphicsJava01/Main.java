package graphicsJava01;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		Line line = new Line();
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(line);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
