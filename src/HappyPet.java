import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet= JOptionPane.showInputDialog(" what kind of pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0 ; i < 60; i += happinessLevel ) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what do you want to do with your pet", "noiice", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "eat it", "feed it", "play with it" }, null);
			
			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	eatIt();
}
else if(task == 1) {
	feedIt();
}
else if( task == 2) {
	PlayWithIt();
}
		}
	JOptionPane.showMessageDialog(null, "DUUUUUUUUUUUUUUUUUUUUDE Take a break man your pets grrrrrrrrrrrrrrrr8");
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
static void eatIt() {
	happinessLevel -= 100000;
	
}
static void feedIt() { 
	happinessLevel += 100000;
}
static void PlayWithIt() {
	happinessLevel += 30;
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}
