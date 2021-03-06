//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		robot.penDown();
		robot.setSpeed(1234567890);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String dizzy  = JOptionPane.showInputDialog("How dizzy do you want the robot to be?");
 // 1. Use the dance method to make the robot spin.
int i = Integer.parseInt(dizzy);
dance(i);

	}
	

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

