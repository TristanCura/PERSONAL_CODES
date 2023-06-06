import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.ColorUIResource;

public class Portfolio_Tristan extends Images {

	private JFrame frmTristanMenu;

	public Portfolio_Tristan() {
		initialize();
	}

	private void initialize() {
		// -----------------------------------------------------//
		// Start Menu Frame
		// Initialize Frame
		frmTristanMenu = new JFrame();

		// Add Frame Components
		frmTristanMenu.getContentPane().setBackground(new Color(118, 98, 96));
		frmTristanMenu.setTitle("Portfolio | Tristan Kelly P. Cura");
		frmTristanMenu.setBounds(100, 100, 800, 530);
		frmTristanMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTristanMenu.getContentPane().setLayout(null);
		frmTristanMenu.setResizable(false);
		frmTristanMenu.setVisible(true);
		// This makes the window open on the center of the screen//
		Toolkit tk = frmTristanMenu.getToolkit();
		Dimension size = tk.getScreenSize();
		frmTristanMenu.setLocation(size.width / 2 - frmTristanMenu.getWidth() / 2,
				size.height / 2 - frmTristanMenu.getHeight() / 2);
		// ---------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------//
		// Change TabbedPane Properties using UIManager
		UIManager.put("TabbedPane.selected", Color.decode("#F4EBD8"));
		UIManager.put("TabbedPane.borderHightlightColor", new ColorUIResource(Color.decode("#766260")));
		UIManager.put("TabbedPane.darkShadow", new ColorUIResource(Color.decode("#503633")));
		UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
		// ---------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------//
		// Initialize All Components

		// All Tabbed Panes
		JTabbedPane tabbedPane_MainScreen = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPane tabbedPane_HomeScreen = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPane tabbedPane_AboutScreen = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPane tabbedPane_SkillScreen = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPane tabbedPane_WorksScreen = new JTabbedPane(JTabbedPane.TOP);

		// All Panels
		JPanel panelHome = new JPanel();
		JPanel panel_TitleScreen = new JPanel();
		JPanel panel_Introduction = new JPanel();
		JPanel panel_ReferenceScreen = new JPanel();

		JPanel panelAbout = new JPanel();
		JPanel panel_AboutScreen1 = new JPanel();
		JPanel panel_AboutScreen2 = new JPanel();
		JPanel panel_AboutScreen3 = new JPanel();

		JPanel panelSkills = new JPanel();
		JPanel panel_Skill = new JPanel();
		JPanel panel_Attributes = new JPanel();

		JPanel panelWorks = new JPanel();
		JPanel panel_Gallery1 = new JPanel();
		JPanel panel_Gallery2 = new JPanel();

		// All Buttons
		JButton btnPlay = new JButton("");
		JButton btnReferences = new JButton("");
		JButton btnLogout = new JButton("");
		JButton btnAboutMe = new JButton("");
		JButton btnSkills = new JButton("");
		JButton btnGallery = new JButton("");
		JButton btnHome = new JButton("");

		JButton btnNext = new JButton("");
		JButton btnNext_1 = new JButton("");
		JButton btnNext_2 = new JButton("");
		JButton btnNext_3 = new JButton("");

		JButton btnReturn = new JButton("");
		JButton btnReturn_1 = new JButton("");
		JButton btnReturn_2 = new JButton("");
		JButton btnReturn_3 = new JButton("");
		JButton btnReturn_4 = new JButton("");
		JButton btnReturn_5 = new JButton("");
		JButton btnReturn_6 = new JButton("");
		JButton btnReturn_7 = new JButton("");
		JButton btnReturn_8 = new JButton("");

		// All Labels
		JLabel lblSpriteLogout_img = new JLabel("");
		JLabel lblSpriteReferences_img = new JLabel("");
		JLabel lblSpritePlay_img = new JLabel("");
		JLabel lblSpriteTitle_img = new JLabel("");
		JLabel lblSpriteAboutMe_img = new JLabel("");
		JLabel lblReferences_img = new JLabel("");
		JLabel lblSpriteGallery_img = new JLabel("");
		JLabel lblSpriteHome = new JLabel("");
		JLabel lblSpriteSkills_img = new JLabel("");

		JLabel lblTitleScreenCat_img = new JLabel("");
		JLabel lblTitleScreenCat_img_1 = new JLabel("");
		JLabel lblTitleScreenCat_img_2 = new JLabel("");
		JLabel lblTitleScreenCat_img_3 = new JLabel("");
		JLabel lblTitleScreenCat_img_4 = new JLabel("");
		JLabel lblTitleScreenCat_img_5 = new JLabel("");
		JLabel lblTitleScreenCat_img_6 = new JLabel("");
		JLabel lblTitleScreenCat_img_7 = new JLabel("");
		JLabel lblTitleScreenCat_img_8 = new JLabel("");
		JLabel lblTitleScreenCat_img_9 = new JLabel("");

		JLabel lblSpriteBlob_img = new JLabel("");
		JLabel lblSpriteBlob_img_1 = new JLabel("");
		JLabel lblSpriteBlob_img_2 = new JLabel("");

		JLabel lblSpriteNext_img = new JLabel("");
		JLabel lblSpriteNext_img_1 = new JLabel("");
		JLabel lblSpriteNext_img_2 = new JLabel("");
		JLabel lblSpriteNext_img_3 = new JLabel("");

		JLabel lblSpriteReturn_img = new JLabel("");
		JLabel lblSpriteReturn_img_1 = new JLabel("");
		JLabel lblSpriteReturn_img_2 = new JLabel("");
		JLabel lblSpriteReturn_img_3 = new JLabel("");
		JLabel lblSpriteReturn_img_4 = new JLabel("");
		JLabel lblSpriteReturn_img_5 = new JLabel("");
		JLabel lblSpriteReturn_img_6 = new JLabel("");
		JLabel lblSpriteReturn_img_7 = new JLabel("");
		JLabel lblSpriteReturn_img_8 = new JLabel("");

		JLabel lblTextBox_img = new JLabel("");
		JLabel lblTextBoxLarge_img = new JLabel("");
		JLabel lblTextBoxLarge_img_1 = new JLabel("");
		JLabel lblTextBoxLarge_img_2 = new JLabel("");
		JLabel lblTextBoxExtraLarge_img = new JLabel("");
		JLabel lblTextBoxExtraLarge_img_1 = new JLabel("");
		JLabel lblImageBox_img = new JLabel("");
		JLabel lblImageBox_img_1 = new JLabel("");

		JLabel lblSpriteTristanNeutral_img = new JLabel("");
		JLabel lblSpriteTristanNeutral_img_1 = new JLabel("");
		JLabel lblSpriteTristanTalk_img = new JLabel("");
		JLabel lblSpriteTristanTalk_img_1 = new JLabel("");
		JLabel lblSpriteTristanTalk_img_2 = new JLabel("");
		JLabel lblSpriteTristanBlink_img = new JLabel("");

		// Labels with text
		JLabel lblSpeech1 = new JLabel();
		JLabel lblReferences = new JLabel();
		JLabel lblAboutMe = new JLabel();
		JLabel lblAboutMe_1 = new JLabel();
		JLabel lblAboutMe_2 = new JLabel();
		JLabel lblSkills = new JLabel();
		JLabel lblSkills_1 = new JLabel();
		JLabel lblGallery1 = new JLabel();
		JLabel lblGallery2 = new JLabel();
		JLabel lblGallery3 = new JLabel();
		JLabel lblGallery4 = new JLabel();
		// ---------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------//
		// Add Tab Properties, Main Tabs and Panels
		// Main Tab
		tabbedPane_MainScreen.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 13));
		tabbedPane_MainScreen.setBackground(new Color(118, 98, 96));
		tabbedPane_MainScreen.setBounds(0, 0, 786, 493);
		// ------------------------------------------------------//
		// Home Panel
		panelHome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelHome.setForeground(new Color(244, 235, 216));
		panelHome.setBackground(new Color(244, 235, 216));
		tabbedPane_MainScreen.addTab("Home", null, panelHome, null);
		panelHome.setLayout(null);
		// ------------------------------------------------------//
		// Title Panel
		tabbedPane_HomeScreen.addTab("Title", null, panel_TitleScreen, null);
		tabbedPane_HomeScreen.setBackground(new Color(244, 235, 216));
		tabbedPane_HomeScreen.setBounds(0, -25, 791, 499);
		panel_TitleScreen.setBackground(new Color(244, 235, 216));
		panel_TitleScreen.setLayout(null);
		panelHome.add(tabbedPane_HomeScreen);

		// Buttons in Title Panel
		// Play Button
		btnPlay.setBounds(261, 223, 319, 76);
		btnPlay.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnPlay.setOpaque(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setBorderPainted(false);
		panel_TitleScreen.add(btnPlay);

		// References Button
		btnReferences.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReferences.setOpaque(false);
		btnReferences.setContentAreaFilled(false);
		btnReferences.setBorderPainted(false);
		btnReferences.setBounds(261, 297, 319, 76);
		panel_TitleScreen.add(btnReferences);

		// Logout Button
		btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLogout.setOpaque(false);
		btnLogout.setContentAreaFilled(false);
		btnLogout.setBorderPainted(false);
		btnLogout.setBounds(261, 367, 320, 76);
		panel_TitleScreen.add(btnLogout);

		// Labels in Title Panel
		// Play Sprite
		lblSpritePlay_img.setBounds(260, 208, 320, 100);
		panel_TitleScreen.add(lblSpritePlay_img);
		lblSpritePlay_img.setIcon(iconPlayPNG);

		// References Sprite
		lblSpriteReferences_img.setBounds(260, 285, 320, 100);
		panel_TitleScreen.add(lblSpriteReferences_img);
		lblSpriteReferences_img.setIcon(iconReferencesPNG);

		// Logout Sprite
		lblSpriteLogout_img.setBounds(260, 361, 320, 100);
		panel_TitleScreen.add(lblSpriteLogout_img);
		lblSpriteLogout_img.setIcon(iconLogoutPNG);

		// Title Sprite
		lblSpriteTitle_img.setBounds(33, 36, 900, 300);
		panel_TitleScreen.add(lblSpriteTitle_img);
		lblSpriteTitle_img.setIcon(iconTitlePNG);

		// Blob Sprite
		lblSpriteBlob_img.setBounds(151, 65, 600, 425);
		panel_TitleScreen.add(lblSpriteBlob_img);
		lblSpriteBlob_img.setIcon(iconBlobPNG);

		// BG
		lblTitleScreenCat_img.setBounds(10, -52, 940, 611);
		panel_TitleScreen.add(lblTitleScreenCat_img);
		lblTitleScreenCat_img.setIcon(iconCatPNG);

		// ------------------------------------------------------//
		// Introduction Panel
		panel_Introduction.setBackground(new Color(244, 235, 216));
		tabbedPane_HomeScreen.addTab("Introduction", null, panel_Introduction, null);
		panel_Introduction.setLayout(null);

		// Buttons in Introduction Panel
		// Return Button
		btnReturn.setBounds(476, 200, 283, 78);
		btnReturn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn.setOpaque(false);
		btnReturn.setContentAreaFilled(false);
		btnReturn.setBorderPainted(false);
		panel_Introduction.add(btnReturn);

		// About Me Button
		btnAboutMe.setBounds(476, 101, 283, 78);
		btnAboutMe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAboutMe.setOpaque(false);
		btnAboutMe.setContentAreaFilled(false);
		btnAboutMe.setBorderPainted(false);
		panel_Introduction.add(btnAboutMe);

		// Labels in Introduction Panel
		// Speech 1
		lblSpeech1.setForeground(new Color(247, 240, 227));
		lblSpeech1.setText("<html> [ TRISTAN ]: <br> Hello there! Welcome to my Portfolio! My name is Tristan "
				+ "and I am a digital artist looking for a game designer position. If you want to learn more about me, "
				+ "press the 'About me' button.</html>");
		lblSpeech1.setVerticalAlignment(SwingConstants.TOP);
		lblSpeech1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSpeech1.setFont(new Font("MV Boli", Font.BOLD, 18));
		lblSpeech1.setBounds(73, 317, 648, 141);
		panel_Introduction.add(lblSpeech1);

		// Return Sprite
		lblSpriteReturn_img.setIcon(iconReturnPNG);
		lblSpriteReturn_img.setBounds(476, 189, 320, 100);
		panel_Introduction.add(lblSpriteReturn_img);

		// About Me Sprite
		lblSpriteAboutMe_img.setIcon(iconAboutMePNG);
		lblSpriteAboutMe_img.setBounds(476, 92, 320, 100);
		panel_Introduction.add(lblSpriteAboutMe_img);

		// Text Box Sprite
		lblTextBox_img.setIcon(iconTextBoxPNG);
		lblTextBox_img.setBounds(33, 256, 900, 300);
		panel_Introduction.add(lblTextBox_img);

		// Tristan Sprite
		lblSpriteTristanTalk_img.setIcon(spriteTristanTalk);
		lblSpriteTristanTalk_img.setBounds(-39, 10, 600, 600);
		panel_Introduction.add(lblSpriteTristanTalk_img);

		// Blob Sprite 2
		lblSpriteBlob_img_2.setIcon(iconBlobPNG);
		lblSpriteBlob_img_2.setBounds(511, 78, 600, 425);
		panel_Introduction.add(lblSpriteBlob_img_2);

		// Blob Sprite 1
		lblSpriteBlob_img_1.setIcon(iconBlobPNG);
		lblSpriteBlob_img_1.setBounds(-168, 33, 600, 425);
		panel_Introduction.add(lblSpriteBlob_img_1);

		// BG
		lblTitleScreenCat_img_1.setIcon(iconCatPNG);
		lblTitleScreenCat_img_1.setBounds(10, -52, 940, 611);
		panel_Introduction.add(lblTitleScreenCat_img_1);

		// ------------------------------------------------------//
		// References Panel
		panel_ReferenceScreen.setBackground(new Color(244, 235, 216));
		tabbedPane_HomeScreen.addTab("References", null, panel_ReferenceScreen, null);
		panel_ReferenceScreen.setLayout(null);

		// Buttons in References Panel
		// Return Button
		btnReturn_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_8.setOpaque(false);
		btnReturn_8.setContentAreaFilled(false);
		btnReturn_8.setBorderPainted(false);
		btnReturn_8.setBounds(253, 402, 283, 78);
		panel_ReferenceScreen.add(btnReturn_8);

		// Labels in References Panel
		// Return Sprite
		lblSpriteReturn_img_8.setIcon(iconReturnPNG);
		lblSpriteReturn_img_8.setBounds(253, 392, 320, 100);
		panel_ReferenceScreen.add(lblSpriteReturn_img_8);

		// Reference Text
		lblReferences.setText("<html>When it comes to the idea for this project's design, "
				+ "I decided to reference the following.<br>"
				+ "* Visual Novel games<br>* Doki Doki Literature CLub<br>* Cute Pastel Art<br>* Home-y Vibes<br>* "
				+ "Cottagecore<br>To add to the context, I am applying to game companies as a designer.</html>");
		lblReferences.setVerticalAlignment(SwingConstants.TOP);
		lblReferences.setForeground(new Color(247, 240, 227));
		lblReferences.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblReferences.setBounds(181, 140, 486, 259);
		panel_ReferenceScreen.add(lblReferences);

		// Reference Sprite
		lblReferences_img.setIcon(iconReferenceBoxPNG);
		lblReferences_img.setBounds(29, 0, 900, 600);
		panel_ReferenceScreen.add(lblReferences_img);

		// BG
		lblTitleScreenCat_img_9.setBackground(new Color(244, 235, 216));
		lblTitleScreenCat_img_9.setBounds(10, -52, 940, 611);
		panel_ReferenceScreen.add(lblTitleScreenCat_img_9);
		lblTitleScreenCat_img_9.setIcon(iconCatPNG);

		// Other Main Tab properties
		tabbedPane_MainScreen.setEnabledAt(0, true);
		tabbedPane_MainScreen.setBackgroundAt(0, new Color(118, 98, 96));
		tabbedPane_MainScreen.setForegroundAt(0, new Color(53, 44, 43));

		// ------------------------------------------------------//
		// About Panel
		panelAbout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelAbout.setBackground(new Color(244, 235, 216));
		tabbedPane_MainScreen.addTab("About Me", null, panelAbout, null);
		tabbedPane_MainScreen.setEnabledAt(1, true);
		panelAbout.setLayout(null);
		tabbedPane_AboutScreen.setBackground(new Color(240, 240, 240));
		tabbedPane_AboutScreen.setBounds(0, -29, 796, 490);
		panelAbout.add(tabbedPane_AboutScreen);
		// ------------------------------------------------------//
		// Background Panel
		panel_AboutScreen1.setBackground(new Color(244, 235, 216));
		tabbedPane_AboutScreen.addTab("Background", null, panel_AboutScreen1, null);
		panel_AboutScreen1.setLayout(null);

		// Buttons
		// Next Button
		btnNext.setBounds(276, 404, 256, 59);
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext.setOpaque(false);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		panel_AboutScreen1.add(btnNext);

		// Return Button
		btnReturn_1.setBounds(10, 404, 256, 59);
		btnReturn_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_1.setOpaque(false);
		btnReturn_1.setContentAreaFilled(false);
		btnReturn_1.setBorderPainted(false);
		panel_AboutScreen1.add(btnReturn_1);

		// Labels
		// Background Text
		lblAboutMe.setText(
				"<html>[ PERSONAL ]<br>Name: Tristan Kelly P. Cura<br>Birthday: August 24<br>Occupancy: College Freshmen, Freelancer<br>Course: BSIT-MAA<br>Pronouns: He/Him<br><br>"
						+ "[ CONTACT ]<br>Number: 09566496363<br>Email: tristancura00@gmail.com<br>Address: Binangonan Rizal</html>");
		lblAboutMe.setForeground(new Color(247, 240, 227));
		lblAboutMe.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblAboutMe.setVerticalAlignment(SwingConstants.TOP);
		lblAboutMe.setBounds(110, 78, 412, 298);
		panel_AboutScreen1.add(lblAboutMe);

		// Next Sprite
		lblSpriteNext_img.setBounds(276, 369, 352, 138);
		lblSpriteNext_img.setIcon(iconNextPNG);
		panel_AboutScreen1.add(lblSpriteNext_img);

		// Return Sprite
		lblSpriteReturn_img_1.setBounds(10, 363, 407, 154);
		lblSpriteReturn_img_1.setIcon(iconReturnPNG);
		panel_AboutScreen1.add(lblSpriteReturn_img_1);

		// Tristan Sprite
		lblSpriteTristanNeutral_img.setIcon(spriteTristanNeutral);
		lblSpriteTristanNeutral_img.setBounds(364, -11, 639, 624);
		panel_AboutScreen1.add(lblSpriteTristanNeutral_img);

		// Text Box Sprite
		lblTextBoxLarge_img.setBounds(-89, -47, 940, 642);
		lblTextBoxLarge_img.setIcon(iconTextBoxLargePNG);
		panel_AboutScreen1.add(lblTextBoxLarge_img);

		// BG
		lblTitleScreenCat_img_2.setBounds(10, -52, 940, 611);
		lblTitleScreenCat_img_2.setIcon(iconCatPNG);
		panel_AboutScreen1.add(lblTitleScreenCat_img_2);

		// ------------------------------------------------------//
		// Hobbies Panel
		panel_AboutScreen2.setBackground(new Color(244, 235, 216));
		tabbedPane_AboutScreen.addTab("Hobbies", null, panel_AboutScreen2, null);
		panel_AboutScreen2.setLayout(null);

		// Buttons
		// Next Button
		btnNext_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext_1.setOpaque(false);
		btnNext_1.setContentAreaFilled(false);
		btnNext_1.setBorderPainted(false);
		btnNext_1.setBounds(275, 404, 256, 59);
		panel_AboutScreen2.add(btnNext_1);

		// Return Button
		btnReturn_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_2.setOpaque(false);
		btnReturn_2.setContentAreaFilled(false);
		btnReturn_2.setBorderPainted(false);
		btnReturn_2.setBounds(9, 404, 256, 59);
		panel_AboutScreen2.add(btnReturn_2);

		// Labels
		// Hobbies Text
		lblAboutMe_1.setText(
				"<html>[ HOBBIES ]<br>* Drawing<br>* 3D Modeling<br>* Drinking Coffee and Tea<br>* Listening to Music<br>* Sitting Alone<br>* Cafe Hopping<br>* Traveling</html>");
		lblAboutMe_1.setVerticalAlignment(SwingConstants.TOP);
		lblAboutMe_1.setForeground(new Color(247, 240, 227));
		lblAboutMe_1.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblAboutMe_1.setBounds(106, 80, 412, 298);
		panel_AboutScreen2.add(lblAboutMe_1);

		// Next Sprite
		lblSpriteNext_img_1.setBounds(275, 370, 352, 138);
		lblSpriteNext_img_1.setIcon(iconNextPNG);
		panel_AboutScreen2.add(lblSpriteNext_img_1);

		// Return Sprite
		lblSpriteReturn_img_2.setBounds(10, 363, 407, 154);
		lblSpriteReturn_img_2.setIcon(iconReturnPNG);
		panel_AboutScreen2.add(lblSpriteReturn_img_2);

		// Tristan Sprite
		lblSpriteTristanBlink_img.setBounds(364, -31, 639, 665);
		lblSpriteTristanBlink_img.setIcon(spriteTristanBlink);
		panel_AboutScreen2.add(lblSpriteTristanBlink_img);

		// Text Box Sprite
		lblTextBoxLarge_img_1.setBounds(-89, -47, 940, 642);
		lblTextBoxLarge_img_1.setIcon(iconTextBoxLargePNG);
		panel_AboutScreen2.add(lblTextBoxLarge_img_1);

		// BG
		lblTitleScreenCat_img_3.setBounds(10, -52, 940, 611);
		lblTitleScreenCat_img_3.setIcon(iconCatPNG);
		panel_AboutScreen2.add(lblTitleScreenCat_img_3);

		// ------------------------------------------------------//
		// Education Panel
		panel_AboutScreen3.setBackground(new Color(244, 235, 216));
		tabbedPane_AboutScreen.addTab("Education", null, panel_AboutScreen3, null);
		panel_AboutScreen3.setLayout(null);

		// Buttons
		// Skills Button
		btnSkills.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSkills.setOpaque(false);
		btnSkills.setContentAreaFilled(false);
		btnSkills.setBorderPainted(false);
		btnSkills.setBounds(276, 404, 256, 59);
		panel_AboutScreen3.add(btnSkills);

		// Return Button
		btnReturn_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_3.setOpaque(false);
		btnReturn_3.setContentAreaFilled(false);
		btnReturn_3.setBorderPainted(false);
		btnReturn_3.setBounds(10, 404, 256, 59);
		panel_AboutScreen3.add(btnReturn_3);

		// Labels
		// Education Text
		lblAboutMe_2.setText(
				"<html>[ EDUCATION ]<br>Junior: Raises Montessori Academe<br>(SY. 2016-2020)<br>Senior: Angono Private High School<br>(SY. 2020-2022)<br>College: National University Manila - CCIT<br>(BSIT-MAA, SY. 2022-Present)<br>"
						+ "[ ACHIEVEMENTS ]<br>*Graduated Senior High School with Honors<br>*Graduated Best in Computer Subject in <br>Junior High School</html>");
		lblAboutMe_2.setVerticalAlignment(SwingConstants.TOP);
		lblAboutMe_2.setForeground(new Color(247, 240, 227));
		lblAboutMe_2.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblAboutMe_2.setBounds(104, 78, 412, 298);
		panel_AboutScreen3.add(lblAboutMe_2);

		// Skills Sprite
		lblSpriteSkills_img.setBounds(276, 370, 352, 138);
		lblSpriteSkills_img.setIcon(iconSkillsPNG);
		panel_AboutScreen3.add(lblSpriteSkills_img);

		// Return Sprite
		lblSpriteReturn_img_3.setBounds(10, 363, 407, 154);
		lblSpriteReturn_img_3.setIcon(iconReturnPNG);
		panel_AboutScreen3.add(lblSpriteReturn_img_3);

		// Tristan Sprite
		lblSpriteTristanTalk_img_1.setBounds(364, -13, 600, 629);
		lblSpriteTristanTalk_img_1.setIcon(spriteTristanTalk);
		panel_AboutScreen3.add(lblSpriteTristanTalk_img_1);

		// Text Box Sprite
		lblTextBoxLarge_img_2.setBounds(-89, -47, 940, 642);
		lblTextBoxLarge_img_2.setIcon(iconTextBoxLargePNG);
		panel_AboutScreen3.add(lblTextBoxLarge_img_2);

		// BG
		lblTitleScreenCat_img_4.setBounds(10, -52, 940, 611);
		lblTitleScreenCat_img_4.setIcon(iconCatPNG);
		panel_AboutScreen3.add(lblTitleScreenCat_img_4);

		// Other Main Tab Properties
		tabbedPane_MainScreen.setForegroundAt(1, new Color(53, 44, 43));

		// ------------------------------------------------------//
		// Skills Panel
		panelSkills.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelSkills.setBackground(new Color(244, 235, 216));
		tabbedPane_MainScreen.addTab("Skills and Attributes", null, panelSkills, null);
		panelSkills.setLayout(null);
		tabbedPane_SkillScreen.setBounds(0, -28, 781, 489);
		panelSkills.add(tabbedPane_SkillScreen);
		panel_Skill.setBackground(new Color(244, 235, 216));
		tabbedPane_SkillScreen.addTab("Skills", null, panel_Skill, null);
		panel_Skill.setLayout(null);

		// Buttons in Skills Panel
		// Next Button
		btnNext_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext_2.setOpaque(false);
		btnNext_2.setContentAreaFilled(false);
		btnNext_2.setBorderPainted(false);
		btnNext_2.setBounds(510, 393, 256, 59);
		panel_Skill.add(btnNext_2);

		// Return Button
		btnReturn_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_4.setOpaque(false);
		btnReturn_4.setContentAreaFilled(false);
		btnReturn_4.setBorderPainted(false);
		btnReturn_4.setBounds(225, 393, 256, 59);
		panel_Skill.add(btnReturn_4);

		// Labels in Skills Panel
		// Skills Text
		lblSkills.setText(
				"<html>[ SOFT SKILLS ]<br>* Time Management<br>* Problem Solving<br>* Team Work<br>* Creativity<br>* Leadership<br>* Situational Awareness<br>* Confidence</html>");
		lblSkills.setVerticalAlignment(SwingConstants.TOP);
		lblSkills.setForeground(new Color(247, 240, 227));
		lblSkills.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblSkills.setBounds(316, 79, 412, 298);
		panel_Skill.add(lblSkills);

		// Return Sprite
		lblSpriteReturn_img_4.setBounds(225, 361, 407, 138);
		lblSpriteReturn_img_4.setIcon(iconReturnPNG);
		panel_Skill.add(lblSpriteReturn_img_4);

		// Next Sprite
		lblSpriteNext_img_2.setBounds(489, 361, 352, 138);
		lblSpriteNext_img_2.setIcon(iconNextPNG);
		panel_Skill.add(lblSpriteNext_img_2);

		// Tristan Sprite
		lblSpriteTristanTalk_img_2.setBounds(-100, -40, 600, 680);
		lblSpriteTristanTalk_img_2.setIcon(spriteTristanTalk);
		panel_Skill.add(lblSpriteTristanTalk_img_2);

		// Text Box Sprite
		lblTextBoxExtraLarge_img.setBounds(73, -45, 900, 667);
		lblTextBoxExtraLarge_img.setIcon(iconTextBoxExtraLargePNG);
		panel_Skill.add(lblTextBoxExtraLarge_img);

		// BG
		lblTitleScreenCat_img_5.setBounds(10, -52, 940, 611);
		lblTitleScreenCat_img_5.setIcon(iconCatPNG);
		panel_Skill.add(lblTitleScreenCat_img_5);

		// ------------------------------------------------------//
		// Attributes Panel
		panel_Attributes.setBackground(new Color(244, 235, 216));
		tabbedPane_SkillScreen.addTab("Attributes", null, panel_Attributes, null);
		panel_Attributes.setLayout(null);

		// Buttons
		// Return Button
		btnReturn_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_5.setOpaque(false);
		btnReturn_5.setContentAreaFilled(false);
		btnReturn_5.setBorderPainted(false);
		btnReturn_5.setBounds(225, 403, 256, 59);
		panel_Attributes.add(btnReturn_5);

		// Gallery Button
		btnGallery.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnGallery.setOpaque(false);
		btnGallery.setContentAreaFilled(false);
		btnGallery.setBorderPainted(false);
		btnGallery.setBounds(491, 403, 256, 59);
		panel_Attributes.add(btnGallery);

		// Labels
		// Skills Text
		lblSkills_1.setText(
				"<html>[ HARD SKILLS ]<br>* Computer Software Knowledge<br>* Computer Programming (Java, C#, Python)<br>* Graphics Design<br>* 3D Modeling<br>* Social Media Marketing</html>");
		lblSkills_1.setVerticalAlignment(SwingConstants.TOP);
		lblSkills_1.setForeground(new Color(247, 240, 227));
		lblSkills_1.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblSkills_1.setBounds(316, 81, 412, 298);
		panel_Attributes.add(lblSkills_1);

		// Return Sprite
		lblSpriteReturn_img_5.setBounds(225, 361, 407, 138);
		lblSpriteReturn_img_5.setIcon(iconReturnPNG);
		panel_Attributes.add(lblSpriteReturn_img_5);

		// Gallery Sprite
		lblSpriteGallery_img.setBounds(488, 361, 352, 138);
		lblSpriteGallery_img.setIcon(iconPreviousWorksPNG);
		panel_Attributes.add(lblSpriteGallery_img);

		// Tristan Sprite
		lblSpriteTristanNeutral_img_1.setBounds(-100, -65, 639, 733);
		lblSpriteTristanNeutral_img_1.setIcon(spriteTristanNeutral);
		panel_Attributes.add(lblSpriteTristanNeutral_img_1);

		// Text Box Sprite
		lblTextBoxExtraLarge_img_1.setBounds(73, -45, 900, 667);
		lblTextBoxExtraLarge_img_1.setIcon(iconTextBoxExtraLargePNG);
		panel_Attributes.add(lblTextBoxExtraLarge_img_1);

		// BG
		lblTitleScreenCat_img_6.setBounds(10, -52, 940, 611);
		lblTitleScreenCat_img_6.setIcon(iconCatPNG);
		panel_Attributes.add(lblTitleScreenCat_img_6);

		// Other Main Tab Properties
		tabbedPane_MainScreen.setForegroundAt(2, new Color(53, 44, 43));

		// ------------------------------------------------------//
		// Works Panel
		panelWorks.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelWorks.setBackground(new Color(244, 235, 216));
		tabbedPane_MainScreen.addTab("Previous Works", null, panelWorks, null);
		tabbedPane_MainScreen.setEnabledAt(3, true);
		panelWorks.setLayout(null);
		tabbedPane_WorksScreen.setBounds(0, -27, 794, 503);
		panelWorks.add(tabbedPane_WorksScreen);

		// ------------------------------------------------------//
		// Gallery 1 Panel
		panel_Gallery1.setBackground(new Color(244, 235, 216));
		tabbedPane_WorksScreen.addTab("Gallery1", null, panel_Gallery1, null);
		panel_Gallery1.setLayout(null);

		// Buttons
		// Next Button
		btnNext_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext_3.setOpaque(false);
		btnNext_3.setContentAreaFilled(false);
		btnNext_3.setBorderPainted(false);
		btnNext_3.setBounds(514, 402, 256, 59);
		panel_Gallery1.add(btnNext_3);

		// Return Button
		btnReturn_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_6.setOpaque(false);
		btnReturn_6.setContentAreaFilled(false);
		btnReturn_6.setBorderPainted(false);
		btnReturn_6.setBounds(10, 402, 256, 59);
		panel_Gallery1.add(btnReturn_6);

		// Labels
		// Gallery Text
		lblGallery2.setText(
				"<html>[ COMMISSIONED MODEL ]<br>Total Price: $>300<br>Owner: @MooshMoo_Inc<br> -A commissioned model. This VTuber was the first of its base which is an adult size base that was created by me.</html>");
		lblGallery2.setVerticalAlignment(SwingConstants.TOP);
		lblGallery2.setForeground(new Color(247, 240, 227));
		lblGallery2.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblGallery2.setBounds(82, 218, 323, 270);
		panel_Gallery1.add(lblGallery2);

		// Gallery Text
		lblGallery1.setText(
				"<html>[ GIVEAWAY MODEL ]<br>Total Price: $270<br>Owner: @bunipom<br> -A giveaway model from my March-April Model Raffle costing more than $200. This VTuber model has custom toggles like accessories and expressions.</html>");
		lblGallery1.setVerticalAlignment(SwingConstants.TOP);
		lblGallery1.setForeground(new Color(247, 240, 227));
		lblGallery1.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblGallery1.setBounds(403, 10, 376, 302);
		panel_Gallery1.add(lblGallery1);

		// Next Sprite
		lblSpriteNext_img_3.setBounds(514, 365, 352, 138);
		lblSpriteNext_img_3.setIcon(iconNextPNG);
		panel_Gallery1.add(lblSpriteNext_img_3);

		// Return Sprite
		lblSpriteReturn_img_6.setBounds(10, 365, 353, 138);
		lblSpriteReturn_img_6.setIcon(iconReturnPNG);
		panel_Gallery1.add(lblSpriteReturn_img_6);

		// Image Box Sprite
		lblImageBox_img.setBounds(-85, -16, 900, 600);
		lblImageBox_img.setIcon(iconImageBox1PNG);
		panel_Gallery1.add(lblImageBox_img);

		// BG
		lblTitleScreenCat_img_7.setBounds(0, -91, 940, 611);
		lblTitleScreenCat_img_7.setIcon(iconCatPNG);
		panel_Gallery1.add(lblTitleScreenCat_img_7);

		// ------------------------------------------------------//
		// Gallery 2 Panel
		panel_Gallery2.setBackground(new Color(244, 235, 216));
		tabbedPane_WorksScreen.addTab("Gallery2", null, panel_Gallery2, null);
		panel_Gallery2.setLayout(null);

		// Buttons
		// Home Button
		btnHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnHome.setOpaque(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorderPainted(false);
		btnHome.setBounds(510, 402, 256, 59);
		panel_Gallery2.add(btnHome);

		// Return Button
		btnReturn_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReturn_7.setOpaque(false);
		btnReturn_7.setContentAreaFilled(false);
		btnReturn_7.setBorderPainted(false);
		btnReturn_7.setBounds(10, 402, 256, 59);
		panel_Gallery2.add(btnReturn_7);

		// Labels
		// Gallery Text
		lblGallery4.setText(
				"<html>[ COMMISSIONED MODEL ]<br>Total Price: $>300<br>Owner: @komekumami<br> -A commissioned model. This VTuber's design was the first of my favorites that I've done so far. This model has two outfits.</html>");
		lblGallery4.setVerticalAlignment(SwingConstants.TOP);
		lblGallery4.setForeground(new Color(247, 240, 227));
		lblGallery4.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblGallery4.setBounds(403, 10, 376, 302);
		panel_Gallery2.add(lblGallery4);

		// Gallery Text
		lblGallery3.setText(
				"<html>[ COMMISSIONED MODEL ]<br>Total Price: $>300<br>Owner: @HanibiiVtubing<br> -A commissioned model. This VTuber's design was one of my favorites that I've done so far. This model has two outfits.</html>");
		lblGallery3.setVerticalAlignment(SwingConstants.TOP);
		lblGallery3.setForeground(new Color(247, 240, 227));
		lblGallery3.setFont(new Font("MV Boli", Font.BOLD, 15));
		lblGallery3.setBounds(82, 218, 323, 270);
		panel_Gallery2.add(lblGallery3);

		// Home Sprite
		lblSpriteHome.setBounds(516, 365, 353, 138);
		lblSpriteHome.setIcon(iconHomePNG);
		panel_Gallery2.add(lblSpriteHome);

		// Return Sprite
		lblSpriteReturn_img_7.setBounds(10, 365, 353, 138);
		lblSpriteReturn_img_7.setIcon(iconReturnPNG);
		panel_Gallery2.add(lblSpriteReturn_img_7);

		// Image Box Sprite
		lblImageBox_img_1.setBounds(-85, -16, 900, 600);
		lblImageBox_img_1.setIcon(iconImageBox2PNG);
		panel_Gallery2.add(lblImageBox_img_1);

		// BG
		lblTitleScreenCat_img_8.setBounds(0, -90, 940, 611);
		lblTitleScreenCat_img_8.setIcon(iconCatPNG);
		panel_Gallery2.add(lblTitleScreenCat_img_8);

		// Other Main Tab Properties
		tabbedPane_MainScreen.setForegroundAt(3, new Color(53, 44, 43));
		// ---------------------------------------------------------------------------//

		// ---------------------------------------------------------------------------//
		// Add Action Listeners to Components
		// Play Button
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_HomeScreen.setSelectedIndex(1);
			}
		});

		// References Button
		btnReferences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_HomeScreen.setSelectedIndex(2);
			}
		});

		// Logout Button
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTristanMenu.dispose();
				StartMenu startMenu = new StartMenu();
			}
		});

		// Introduction Panel's Return Button
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_HomeScreen.setSelectedIndex(0);
			}
		});

		// Introduction Panel's Next/About Me Button
		btnAboutMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_MainScreen.setEnabledAt(1, true);
				tabbedPane_HomeScreen.setSelectedIndex(0);
				tabbedPane_MainScreen.setSelectedIndex(1);
			}
		});

		// Reference Panel's Return Button
		btnReturn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_HomeScreen.setSelectedIndex(0);
			}
		});

		// Background Panel's Next Button
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_AboutScreen.setSelectedIndex(1);
			}
		});

		// Background Panel's Return Button
		btnReturn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_HomeScreen.setSelectedIndex(1);
				tabbedPane_MainScreen.setSelectedIndex(0);
			}
		});

		// Hobbies Panel's Next Button
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_AboutScreen.setSelectedIndex(2);
			}
		});

		// Hobbies Panel's Return Button
		btnReturn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_AboutScreen.setSelectedIndex(0);
			}
		});

		// Education Panel's Skills Button
		btnSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_MainScreen.setEnabledAt(2, true);
				tabbedPane_AboutScreen.setSelectedIndex(0);
				tabbedPane_MainScreen.setSelectedIndex(2);
			}
		});

		// Education Panel's Return Button
		btnReturn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_AboutScreen.setSelectedIndex(1);
			}
		});

		// Skill Panel's Next Button
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_SkillScreen.setSelectedIndex(1);
			}
		});

		// Skill Panel's Return Button
		btnReturn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_AboutScreen.setSelectedIndex(2);
				tabbedPane_MainScreen.setSelectedIndex(1);
			}
		});

		// Attribute Panel's Gallery Button
		btnGallery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_MainScreen.setEnabledAt(3, true);
				tabbedPane_SkillScreen.setSelectedIndex(0);
				tabbedPane_MainScreen.setSelectedIndex(3);
			}
		});

		// Attribute Panel's Return Button
		btnReturn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_SkillScreen.setSelectedIndex(0);
			}
		});

		// Gallery 1 Panel's Next Button
		btnNext_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_WorksScreen.setSelectedIndex(1);
			}
		});

		// Gallery 1 Panel's Return Button
		btnReturn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_SkillScreen.setSelectedIndex(1);
				tabbedPane_MainScreen.setSelectedIndex(2);
			}
		});

		// Gallery 2 Panel's Home Button
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_WorksScreen.setSelectedIndex(0);
				tabbedPane_MainScreen.setSelectedIndex(0);
			}
		});

		// Gallery 2 Panel's Return Button
		btnReturn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_WorksScreen.setSelectedIndex(0);
			}
		});

		// ---------------------------------------------------------------------------//

		frmTristanMenu.getContentPane().add(tabbedPane_MainScreen);
	}
}
