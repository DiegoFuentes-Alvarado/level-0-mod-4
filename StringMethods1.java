import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class StringMethods1 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to whatever you want
		String i = "987654321";
		// 2. Print the 3rd char of your String to the console.
		// HINT: .charAt
		System.out.println(i.charAt(2));
		// 3. Print the length of your String to the console.
		// HINT: .length
		int l = i.length();
		System.out.println(l);
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int c = 0; c < i.length(); c++) {
			System.out.println(i.charAt(c));
		}
		String qu = JOptionPane.showInputDialog("Pick a digit in the number.");
		char t = qu.charAt(0);
		for (int c = 0; c < i.length(); c++) {
			char y = i.charAt(c);
			if (y == t){
				System.out.println(t + " is at index " + c);
			}
		}
		System.out.println(t);
		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"

	}
}
