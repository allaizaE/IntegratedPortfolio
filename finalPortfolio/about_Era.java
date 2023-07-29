package finalPortfolio;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class about_Era extends homepage_Era {

	JFrame aboutFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about_Era window = new about_Era();
					window.aboutFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public about_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		aboutFrame = new JFrame();
		aboutFrame.setBounds(100, 100, 1100, 730);
		aboutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aboutFrame.getContentPane().setLayout(null);
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
				//Home Label Click [1]
				JLabel homeClick = new JLabel("");
				homeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						homepage_Era window = new homepage_Era();
						window.homePageFrame.setVisible(true);
						aboutFrame.dispose();
						
					}
				});
				homeClick.setBounds(336, 48, 59, 21);
				aboutFrame.getContentPane().add(homeClick);
				
				//About Label Click [2]
				JLabel aboutLabel = new JLabel("");
				aboutLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						about_Era window = new about_Era();
						window.aboutFrame.setVisible(true);
						aboutFrame.dispose();
						
					}
				});
				aboutLabel.setBounds(465, 48, 68, 21);
				aboutFrame.getContentPane().add(aboutLabel);
				
				//Work Label Click [3]
				JLabel workLabel1 = new JLabel("");
				workLabel1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						aboutFrame.dispose();
					}
				});
				
				
				workLabel1.setBounds(586, 38, 91, 41);
				aboutFrame.getContentPane().add(workLabel1);
				
				//Resume Label Click [4]
				JLabel resumeClick = new JLabel("");
				resumeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						resume_Era window = new resume_Era();
						window.resumeFrame.setVisible(true);
						aboutFrame.dispose();
						
					}
				});
				resumeClick.setBounds(732, 48, 82, 21);
				aboutFrame.getContentPane().add(resumeClick);
				
				//Contact Label Click [5]
				JLabel contactClick = new JLabel("");
				contactClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						contactMe_Era window = new contactMe_Era();
						window.contactFrame.setVisible(true);
						aboutFrame.dispose();
					}
				});
				contactClick.setBounds(866, 41, 146, 34);
				aboutFrame.getContentPane().add(contactClick);
				
		
		JLabel aboutBG = new JLabel("");
		aboutBG.setIcon(new ImageIcon(about_Era.class.getResource("/allaiza_images/about.png")));
		aboutBG.setBounds(0, 0, 1084, 691);
		aboutFrame.getContentPane().add(aboutBG);
	}

}
