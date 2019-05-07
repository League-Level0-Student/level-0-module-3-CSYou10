
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 27th";
		String dadsBirthday = "August 9th";
		String calebBirthday = "December 23";

		// 2. Find out which birthday the user wants and and store their response in a variable
String choice = JOptionPane.showInputDialog("Whoes birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(choice);
		// 4. if user asked for "mom"
		if(choice.equals("Mom")){
		System.out.println(momsBirthday);
		}else if(choice.equals("Dad")) {
			System.out.println(dadsBirthday);
		}else if(choice.equals("Caleb")) {
			System.out.println(calebBirthday);
		}else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");	
		}
			
		
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
