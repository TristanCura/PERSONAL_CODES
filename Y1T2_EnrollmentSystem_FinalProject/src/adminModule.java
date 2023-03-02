import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class adminModule {
	//Containers
	JFrame adminMenu = new JFrame("Admin Menu | National University Philippines");
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	//Components
	JTextField txtCourses = new JTextField(15); 
	JButton bttnAdd = new JButton("Add Course");
	JButton bttnView = new JButton("View Course");
	JButton bttnLogout = new JButton("Logout");
	
	public adminModule() {
		adminMenu.setLayout(new GridLayout());
		adminMenu.setSize(950, 700);
		adminMenu.setResizable(false);
		adminMenu.setDefaultCloseOperation(adminMenu.EXIT_ON_CLOSE);
				
		Toolkit tk = adminMenu.getToolkit();
		Dimension size = tk.getScreenSize();
		adminMenu.setLocation(size.width / 2 - adminMenu.getWidth() / 2, size.height / 2 - adminMenu.getHeight() / 2);

		adminMenu.setVisible(true);
		
		//Panel 1
		panel1.add(bttnAdd);
		panel1.add(bttnView);
		panel1.add(bttnLogout);
		adminMenu.getContentPane().add(panel1, BorderLayout.WEST);
		
		//Panel 2
		panel2.add(txtCourses);
		adminMenu.getContentPane().add(panel2, BorderLayout.EAST);
	}
}
