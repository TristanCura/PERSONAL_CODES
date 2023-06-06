import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class StartMenu extends Images{

	private JFrame frmStartMenu;

	public StartMenu() {
		initialize();
	}

	private void initialize() {
		// -----------------------------------------------------//
		// Start Menu Frame
		// Initialize Frame
		frmStartMenu = new JFrame();
		
		// Add Frame Components
		frmStartMenu.setTitle("Portfolio | Home");
		frmStartMenu.setBounds(100, 100, 490, 360);
		frmStartMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStartMenu.getContentPane().setLayout(null);
		frmStartMenu.setVisible(true);
		// This makes the window open on the center of the screen//
		Toolkit tk = frmStartMenu.getToolkit();
		Dimension size = tk.getScreenSize();
		frmStartMenu.setLocation(size.width / 2 - frmStartMenu.getWidth() / 2,
				size.height / 2 - frmStartMenu.getHeight() / 2);
		// ------------------------------------------------------//

		// ------------------------------------------------------//
		// Initialize All Components
		JButton btnUser1_Tristan = new JButton("");
		JButton btnUser2 = new JButton("");
		JButton btnUser3 = new JButton("");
		JLabel lblStartMenu_img = new JLabel("");
		// ------------------------------------------------------//

		// ------------------------------------------------------//
		// Add Properties to Components
		// Add Button 1 Properties
		btnUser1_Tristan.setBounds(183, 159, 121, 108);
		btnUser1_Tristan.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnUser1_Tristan.setOpaque(false);
		btnUser1_Tristan.setContentAreaFilled(false);
		btnUser1_Tristan.setBorderPainted(false);	

		// Add Button 2 Properties
		btnUser2.setBounds(38, 159, 121, 108);
		btnUser2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnUser2.setOpaque(false);
		btnUser2.setContentAreaFilled(false);
		btnUser2.setBorderPainted(false);

		// Add Button 3 Properties
		btnUser3.setBounds(324, 159, 121, 108);
		btnUser3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnUser3.setOpaque(false);
		btnUser3.setContentAreaFilled(false);
		btnUser3.setBorderPainted(false);

		// Add Start Menu Label Properties
		lblStartMenu_img.setIcon(startMenuBG);
		lblStartMenu_img.setBounds(0, 0, 600, 425);
		// ------------------------------------------------------//

		// ------------------------------------------------------//
		// Add Event Listenerts to Components
		// Add Button 1 Event Listener
		// This Listener will bring the user to the class 'Portfolio_Tristan'
		btnUser1_Tristan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStartMenu.dispose();
				Portfolio_Tristan tristan = new Portfolio_Tristan();
			}
		});

		// Add Button 2 Event Listener
		// This Listener currently does not have a class to redirect to. This Listener
		// will simply display a message dialogue stating that the user click currently
		// does not exist.
		btnUser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This user currently does not have a 'Portfolio'.",
						"Portfolio | Error", JOptionPane.WARNING_MESSAGE);
			}
		});

		// Add Button 3 Event Listener
		// This Listener currently does not have a class to redirect to. This Listener
		// will simply display a message dialogue stating that the user click currently
		// does not exist.
		btnUser3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This user currently does not have a 'Portfolio'.",
						"Portfolio | Error", JOptionPane.WARNING_MESSAGE);
			}
		});
		// ------------------------------------------------------//

		// ------------------------------------------------------//
		// Add all Components to Frame
		frmStartMenu.getContentPane().add(btnUser1_Tristan);
		frmStartMenu.getContentPane().add(btnUser2);
		frmStartMenu.getContentPane().add(btnUser3);
		frmStartMenu.getContentPane().add(lblStartMenu_img);
		// ------------------------------------------------------//
	}
}
