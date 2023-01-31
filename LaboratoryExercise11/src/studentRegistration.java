import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studentRegistration extends JFrame{

	private JLabel titleL, fnameL, lnameL, courseL, passwordL;
	private JTextField fnameTF, lnameTF, courseTF, passwordTF;
	private JButton registerB, clearB, exitB;

	private static final int WIDTH = 400;
	private static final int HEIGHT = 250;
	
	private RegisterButtonHandler rbHandler;
	private ClearButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	public studentRegistration() {
		
		titleL = new JLabel ("APHS SHS TVL ICT", SwingConstants.CENTER);
			titleL.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		fnameL = new JLabel ("First Name: ", SwingConstants.LEFT);
		lnameL = new JLabel ("Last Name: ", SwingConstants.LEFT);
		courseL = new JLabel ("Course: ", SwingConstants.LEFT);
		passwordL = new JLabel ("Password: ", SwingConstants.LEFT);
		
		fnameTF = new JTextField();
		lnameTF = new JTextField();
		courseTF = new JTextField();
		passwordTF = new JTextField();
		
		registerB = new JButton("Register");
		rbHandler = new RegisterButtonHandler();
		registerB.addActionListener(rbHandler);
		
		clearB = new JButton("Clear");
		cbHandler = new ClearButtonHandler();
		clearB.addActionListener(cbHandler);
		
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		Container titlepane = getContentPane();
		titlepane.setLayout(new FlowLayout());
		
		titlepane.add(titleL);
		
		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout(4,2,10,10));
		
		pane.add(fnameL);
		pane.add(fnameTF);
		
		pane.add(lnameL);
		pane.add(lnameTF);
		
		pane.add(courseL);
		pane.add(courseTF);
		
		pane.add(passwordL);
		pane.add(passwordTF);
		
		JPanel pane2 = new JPanel();
		pane2.setLayout(new GridLayout(1,3,10,10));
		
		pane2.add(registerB);
		pane2.add(clearB);
		pane2.add(exitB);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(pane, BorderLayout.CENTER);
		panel.add(pane2, BorderLayout.SOUTH);
		add(panel);
		
		setTitle("Student Registration");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	private class RegisterButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			
			JFrame registered = new JFrame();
			String firstname, lastname, course;
			
			firstname = (fnameTF.getText());
			lastname = (lnameTF.getText());
			course = (courseTF.getText());

			JOptionPane.showMessageDialog(registered,"*REGISTERED\nName: "+ firstname + " " + lastname + "\nCourse: " + course);
		}
	}
	
	private class ClearButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			fnameTF.setText("");
			lnameTF.setText("");
			courseTF.setText("");
			passwordTF.setText("");
			
		}
	}
	
	private class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
		}
	}
}
