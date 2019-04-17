package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
 String input = JOptionPane.showInputDialog("what is your name?");
 JOptionPane.showMessageDialog(null,  "I know what you did last summer, " +input );	
}
}
