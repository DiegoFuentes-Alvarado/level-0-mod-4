import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
		int happinessLevel = 0;
		
		static void takeAWalk(){
			JOptionPane.showMessageDialog(null, "Your pet is leaping in joy and exitement!");
			happinessLevel += 4;
		}
		static void groom(){
			JOptionPane.showMessageDialog(null, "Your pet is not sure at first, but it all ends well.");
			happinessLevel += 2;
		}
		static void giveToy(){
			JOptionPane.showMessageDialog(null, "Your pet doesen't let you grab it anymore!");
			happinessLevel += 5;
		}
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String buyPet = JOptionPane.showInputDialog("What kind of pet would you like to buy?" );

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i = 0; i<10; i++){
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take a walk", "Groom", "Give toy" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0){
				takeAWalk();
			}
			if(task == 1){
				groom();
			}
			if(task == 2){
				giveToy();
			}
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 10){
				JOptionPane.showMessageDialog(null, "You love your pet!");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	

}