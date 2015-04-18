package dialogBox003;
import javax.swing.JOptionPane;
public class DialogBox003 {

	public static void main(String[] args) {
		String num1=null,num2=null;
		int result=0;
		//just a welcome message
		JOptionPane.showMessageDialog(null, "Welcome to this app\nwere going to do a simple addition");
		num1=JOptionPane.showInputDialog("Type the firs number:");
		num2=JOptionPane.showInputDialog("Type the seccond number:");
		//in the next line we're changingin the string data type 
		//and doing the addition also we're asigning the result to the result variable  
		result=Integer.parseInt(num1)+Integer.parseInt(num2);
		// as you can see in the console the num1 and num2 variables still being Strings 
		System.out.println(num1+num2);
		JOptionPane.showMessageDialog(null, "result: "+result);
		//this is another aproach
		//JOptionPane.showMessageDialog(null, "result: "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
	}
}
