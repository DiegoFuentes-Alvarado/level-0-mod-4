
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one
		 * below JOptionPane.showConfirmDialog(null, "Is it a weekday?",
		 * "Sleepy Head", JOptionPane.YES_NO_OPTION);
		 */
		int vaca = JOptionPane.showConfirmDialog(null, "Is it vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		int day = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);

		if (vaca == 0){
			System.out.println("Sleep in!");
		}
		else if (day == 1) {
			System.out.println("Sleep in!");
		}
		else{
			System.out.println("Get up lazybones!");
		}
		/*
		 * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a
		 * weekday, print â€œget up lazybones!â€� If it is a weekday, and we are
		 * on vacation, print â€œsleep inâ€�.
		 */
	}
}
