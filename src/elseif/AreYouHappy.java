package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else if (answer.equalsIgnoreCase("no")) {
			String a = JOptionPane.showInputDialog("Do you want to be happy?");
			if (a.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			} else if (a.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}

		}
	}

}
