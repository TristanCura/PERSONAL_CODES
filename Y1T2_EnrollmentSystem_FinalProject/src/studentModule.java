import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class studentModule {

	//Containers
	JFrame studentMenu = new JFrame("Student Menu | National University Philippines");

	//Components
	JButton bttnEnroll = new JButton("Enroll Course");
	JButton bttnView = new JButton("View Course");
	JButton bttnLogout = new JButton("Logout");
	public studentModule() {
		studentMenu.setLayout(new GridLayout());
		studentMenu.setSize(950, 700);
		studentMenu.setResizable(false);
		studentMenu.setDefaultCloseOperation(studentMenu.EXIT_ON_CLOSE);
		
		Toolkit tk = studentMenu.getToolkit();
		Dimension size = tk.getScreenSize();
		studentMenu.setLocation(size.width / 2 - studentMenu.getWidth() / 2, size.height / 2 - studentMenu.getHeight() / 2);
		
		studentMenu.setVisible(true);
	}
}
