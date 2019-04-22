package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	 public static void main(String[] args) {
 Robot humpbackwhale=new Robot("mini"); 
 humpbackwhale.setPenWidth(6);
 humpbackwhale.setSpeed(75);
humpbackwhale.setRandomPenColor();
 humpbackwhale.penDown();
humpbackwhale.turn(90);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(60);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(60);
humpbackwhale.setRandomPenColor();
humpbackwhale.turn(80);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(75);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(75);
humpbackwhale.turn(180);
humpbackwhale.move(125);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(125);
humpbackwhale.setRandomPenColor();
humpbackwhale.turn(280);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(50);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(50);
humpbackwhale.turn(272);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(125);
humpbackwhale.setRandomPenColor();
humpbackwhale.move(125);
JOptionPane.showMessageDialog(null, "I like the letter A");
JOptionPane.showInputDialog(null, "Do you like the letter A?");
JOptionPane.showMessageDialog(null, "I DONT CARE IF YOU LIKE IT OR NOT!");
JOptionPane.showMessageDialog(null, "Wanna a hear 'A' joke?");
String input = JOptionPane.showInputDialog("what is your name?");
JOptionPane.showMessageDialog(null, "Someday you will fall into 'A' black hole, "+input);
	 }
	 

}
