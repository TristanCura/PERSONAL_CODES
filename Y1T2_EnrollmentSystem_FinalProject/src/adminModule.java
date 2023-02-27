import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class adminModule {

	JFrame adminMenu = new JFrame("Admin Menu | National University Philippines");

	public adminModule() {
		adminMenu.setLayout(new GridLayout());
		adminMenu.setSize(400, 180);
		adminMenu.setResizable(false);
		adminMenu.setDefaultCloseOperation(adminMenu.EXIT_ON_CLOSE);
		
		adminMenu.setVisible(true);
	}
}
