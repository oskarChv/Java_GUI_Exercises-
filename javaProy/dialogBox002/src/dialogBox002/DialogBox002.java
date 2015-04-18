package dialogBox002;
import javax.swing.JOptionPane;
public class DialogBox002 {
	public static void main(String[] args) {
		String name = null;
		byte charNum=0;
		//asigning the data from the inputdialog to the name variable
		name = JOptionPane.showInputDialog("type youre name:");
		//we can apply some logic in here or just display the value that 
		//we just got
		charNum= (byte)name.length();
		name=String.format("welcome %S to the java world\nby the way %s have %d characters", name,name,charNum);
		JOptionPane.showMessageDialog(null, name);
	}
}
