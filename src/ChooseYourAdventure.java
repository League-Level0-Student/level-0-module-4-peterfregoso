import javax.swing.JOptionPane;

public class ChooseYourAdventure {
public static void main(String[] args) {
	int Start = JOptionPane.showOptionDialog(null, "do you wish to start?", "start", 0, JOptionPane.INFORMATION_MESSAGE, null, 
new String[] { "start", " Exit"	}, null);		
	if(Start == 0) {
		int one = JOptionPane.showOptionDialog(null, "were do you wish to explore", "explore", 0, JOptionPane.INFORMATION_MESSAGE, null, 
				new String[] { "Africa", " England"	}, null);		
if(one== 0) {
	int two = JOptionPane.showOptionDialog(null, "do you know dae wae", "Africa", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] { "yes", " no"	}, null);	

if(two == 0) {
	int three =  JOptionPane.showOptionDialog(null, "good job, you are know king of a very powerful tribe. what would you like to do with the tribe", "Tribal King", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] { "leave them", "TAke over the world!"	}, null);	
if(three==1) {
	JOptionPane.showMessageDialog(null, "You take over the world, you win!!!");
}
else {
	JOptionPane.showMessageDialog(null, "you get killed by the tribe");
}
}
else {
	JOptionPane.showMessageDialog(null, "you got lost and dies::(");
}
}
else {
	JOptionPane.showMessageDialog(null, " you drunk to much tea and died :(");
}
	}
	else { 
		JOptionPane.showMessageDialog(null, "Bye");
	}
}
}
