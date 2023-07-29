package finalPortfolio;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.junit.Test;

import static org.junit.Assert.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.ImageIcon;

public class homepage_Era {

	JFrame homePageFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage_Era window = new homepage_Era();
					window.homePageFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Create the frame and set bounds.
		homePageFrame = new JFrame();
		homePageFrame.setBounds(100, 100, 1100, 730);
		homePageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homePageFrame.getContentPane().setLayout(null);
		
		
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
		//Home Label Click [1]
		JLabel homeClick = new JLabel("");
		homeClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homepage_Era window = new homepage_Era();
				window.homePageFrame.setVisible(true);
				homePageFrame.dispose();
				
			}
		});
		
		JLabel coderkidz = new JLabel("");
		coderkidz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				INTEGRATION window = new INTEGRATION();
				window.integrationFrame.setVisible(true);
				homePageFrame.dispose();
			}
		});
		coderkidz.setIcon(new ImageIcon(homepage_Era.class.getResource("/matt_images/logo_coderkidz 1.png")));
		coderkidz.setBounds(1015, 112, 59, 73);
		homePageFrame.getContentPane().add(coderkidz);
		homeClick.setBounds(336, 48, 59, 21);
		homePageFrame.getContentPane().add(homeClick);
		
		//About Label Click [2]
		JLabel aboutLabel = new JLabel("");
		aboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				about_Era window = new about_Era();
				window.aboutFrame.setVisible(true);
				homePageFrame.dispose();
				
			}
		});
		aboutLabel.setBounds(465, 48, 68, 21);
		homePageFrame.getContentPane().add(aboutLabel);
		
		//Work Label Click [3]
		JLabel workLabel1 = new JLabel("");
		workLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myWorks_Era window = new myWorks_Era();
				window.myWorksFrame.setVisible(true);
				homePageFrame.dispose();
			}
		});
		
		workLabel1.setBounds(586, 38, 91, 41);
		homePageFrame.getContentPane().add(workLabel1);
		
		//Resume Label Click [4]
		JLabel resumeClick = new JLabel("");
		resumeClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resume_Era window = new resume_Era();
				window.resumeFrame.setVisible(true);
				homePageFrame.dispose();
				
			}
		});
		resumeClick.setBounds(732, 48, 82, 21);
		homePageFrame.getContentPane().add(resumeClick);
		
		//Contact Label Click [5]
		JLabel contactClick = new JLabel("");
		contactClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contactMe_Era window = new contactMe_Era();
				window.contactFrame.setVisible(true);
				homePageFrame.dispose();
			}
		});
		contactClick.setBounds(866, 41, 146, 34);
		homePageFrame.getContentPane().add(contactClick);
		
		
		// Insert the background image.
		JLabel homePageBG = new JLabel("");
		homePageBG.setIcon(new ImageIcon(homepage_Era.class.getResource("/allaiza_images/homePage.png")));
		homePageBG.setBounds(0, 0, 1084, 691);
		homePageFrame.getContentPane().add(homePageBG);
		
		
		
		

}
}
