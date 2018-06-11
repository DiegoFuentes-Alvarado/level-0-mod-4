
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i = 0; i<100; i++){
		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Choose a number" );
		String num2 = JOptionPane.showInputDialog("Chose another number" );
		int N1 = Integer.parseInt(num1);
		int N2 = Integer.parseInt(num2);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do with them?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == 0){
			add( N1, N2);
		}
		if (operation == 1){
			sub( N1, N2);
		}
		if (operation == 2){
			mult( N1, N2);
		}
		if (operation == 3){
			div( N1, N2);
		}
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	}

	// 3. Create method for addition operation.
	public static void add (int num1,int num2 ){
		System.out.println(num1 + num2);
	}
	public static void sub (int num1,int num2 ){
		System.out.println(num1 - num2);
	}
	public static void mult (int num1,int num2 ){
		System.out.println(num1 * num2);
	}
	public static void div (int num1,int num2 ){
		System.out.println(num1 / num2);
	}
	
// 4. Create similar methods for subtraction, multiplication and division.
}