package graphicsJava02;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		CrossingLines lines = new CrossingLines();
		JFrame drawFrame = new JFrame(); //this its going to be our window
		//so we have to prepare it to support a close operation 
		//the follow line do it 
		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//now we have to specify the window size (w and h)
		drawFrame.setSize(300, 300);
		//now we should add the drow that we allready have 
		drawFrame.add(lines);
		// now we have to make it visible other wise were not going to be able to see anything
		drawFrame.setVisible(true);
	}
}
