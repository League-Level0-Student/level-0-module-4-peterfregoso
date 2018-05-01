//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick = JOptionPane.showInputDialog(null, "how many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
 int nick2= Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
 String quart = JOptionPane.showInputDialog(null, "how many quarters do you have?");
	// Convert their answer to an int using Integer.parseInt()
int quart2= Integer.parseInt(quart);
		// Ask the user how many quarters they have, and convert their answer
double val = .25;
double val2 = .05;
		// Calculate how much money the user has and save it in a double variable 
 double money =val*quart2 +  val2*nick2 ; 
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "$" + money);
	}
}

