import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class studentModule {

	JFrame studentMenu = new JFrame("Student Menu | National University Philippines");

	public studentModule() {
		studentMenu.setLayout(new GridLayout());
		studentMenu.setSize(400, 180);
		studentMenu.setResizable(false);
		studentMenu.setDefaultCloseOperation(studentMenu.EXIT_ON_CLOSE);
		
		studentMenu.setVisible(true);
	}
}
