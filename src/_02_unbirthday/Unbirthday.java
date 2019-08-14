package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("When is your birthday (mm/dd)");
		if(input .equals("08/13")){
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}

	}

}
