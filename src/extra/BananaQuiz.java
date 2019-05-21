//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
String	answer =	JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
if (answer.equals("no")) {
	JOptionPane.showMessageDialog(null, "You are crazy!");
	System.exit(0);
}else if (answer.equals("yes")) {
	String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
	JOptionPane.showMessageDialog(null, hobby +" is much better with bananas!");

	}else if (answer.equals("asdfghjkl;")) {
JOptionPane.showMessageDialog(null, "You are awesome");
System.exit(0);
	}else if (answer.equals("caleb")) {
	JOptionPane.showMessageDialog(null, "Hi Caleb!");
	}else if (answer.equals("1234567890")) {
		JOptionPane.showMessageDialog(null, "You know your numbers");
	}	
	else {
	JOptionPane.showMessageDialog(null, "You are bananas!");
	System.exit(0);
}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
