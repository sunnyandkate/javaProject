package newExample;




import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class GUI {

	JFrame myWindow;
	JPanel myPanel;
	JTextArea myTextarea;
	JButton myButton;
	JMenuBar myMenu;
	JMenu item1, item2, item3;
	LineBorder myBorder;
	
	
	public static void main(String[] args) {
		
		new GUI();
		
	}
	public GUI() {
		
		createWindow();
		createButton();
		createMenu();
		createPanel();
		createTextarea();
		createBorder();
		
		myWindow.setVisible(true);
		
	}

	public void createWindow() {
		
		myWindow = new JFrame("hello");
		myWindow.setSize(500,500);
		
	
		
	}
	
	
	public void createButton() {
		myButton = new JButton("click me");
		myButton.setForeground(new Color(220, 54, 65));
		myButton.setBackground(new Color(90, 150, 210));
		myButton.setBounds(50, 100, 95, 30);
	
		myWindow.add(myButton);
	}
	
	public void createMenu() {
		
		myMenu = new JMenuBar();
		myMenu.setBackground(new Color(144, 174, 210));
		myWindow.setJMenuBar(myMenu);
		
		item1 = new JMenu("Sunny");
		myMenu.add(item1);
		
		item2 = new JMenu("and");
		myMenu.add(item2);
		
		item3 = new JMenu("Kate");
		myMenu.add(item3);
		
	
	}
	public void createPanel() {
		myPanel = new JPanel();
		myPanel.setBounds(0, 0, 500, 500);
		myPanel.setBackground(Color.pink);
		myWindow.add(myPanel);
		
		
		
	}
public void createTextarea() {
		
		myTextarea = new JTextArea("Welcome to the Adventure");
		myTextarea.setBounds(10, 10, 400, 400);
		myPanel.add(myTextarea);
		
	}
	public void createBorder() {
		
		myBorder = new LineBorder(new Color(90, 150, 210));
		myMenu.setBorder(myBorder);
		
		
		
		
		
	}
}
