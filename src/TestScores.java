import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String J = JOptionPane.showInputDialog("what is yor test score");
	double J2 = Double.parseDouble(J);
	if(J2> 70){
		JOptionPane.showMessageDialog(null, "Nice Job");
	
	}
	else if(J2< 71)
		JOptionPane.showMessageDialog(null, "thats Ok Try harder next time");
}
}
