package finalPortfolio;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class infographics1_Era {

	JFrame infographics1Frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infographics1_Era window = new infographics1_Era();
					window.infographics1Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public infographics1_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Initialize the frame.
		infographics1Frame = new JFrame();
		infographics1Frame.setBounds(100, 100, 1100, 730);
		infographics1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
				//Home Label Click [1]
				JLabel homeClick = new JLabel("");
				homeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						homepage_Era window = new homepage_Era();
						window.homePageFrame.setVisible(true);
						infographics1Frame.dispose();
						
					}
				});
				infographics1Frame.getContentPane().setLayout(null);
				homeClick.setBounds(336, 48, 59, 21);
				infographics1Frame.getContentPane().add(homeClick);
				
				//About Label Click [2]
				JLabel aboutLabel = new JLabel("");
				aboutLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						about_Era window = new about_Era();
						window.aboutFrame.setVisible(true);
						infographics1Frame.dispose();
						
					}
				});
				aboutLabel.setBounds(465, 48, 68, 21);
				infographics1Frame.getContentPane().add(aboutLabel);
				
				//Work Label Click [3]
				JLabel workLabel1 = new JLabel("");
				workLabel1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						infographics1Frame.dispose();
					}
				});
				
				workLabel1.setBounds(586, 38, 91, 41);
				infographics1Frame.getContentPane().add(workLabel1);
				
				//Resume Label Click [4]
				JLabel resumeClick = new JLabel("");
				resumeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						resume_Era window = new resume_Era();
						window.resumeFrame.setVisible(true);
						infographics1Frame.dispose();
						
					}
				});
				resumeClick.setBounds(732, 48, 82, 21);
				infographics1Frame.getContentPane().add(resumeClick);
				
				//Contact Label Click [5]
				JLabel contactClick = new JLabel("");
				contactClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						contactMe_Era window = new contactMe_Era();
						window.contactFrame.setVisible(true);
						infographics1Frame.dispose();
					}
				});
				contactClick.setBounds(866, 41, 146, 34);
				infographics1Frame.getContentPane().add(contactClick);
		
				
				
		//Button for paths.
				//Mouse click to go back to my works page.
				JLabel myWorkPath = new JLabel("");
				myWorkPath.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						infographics1Frame.dispose();
					}
				});
				myWorkPath.setBounds(78, 119, 91, 14);
				infographics1Frame.getContentPane().add(myWorkPath);
		
				//Mouse click to go back to graphic design page.
				JLabel graphicPath = new JLabel("");
				graphicPath.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						graphicDesign_Era window = new graphicDesign_Era();
						window.graphicDesignFrame.setVisible(true);
						infographics1Frame.dispose();
					}
				});
				graphicPath.setBounds(204, 119, 146, 14);
				infographics1Frame.getContentPane().add(graphicPath);
				
				//Mouse click to go back to infographics1.
				JLabel infographicPath = new JLabel("");
				infographicPath.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						infographics1_Era window = new infographics1_Era();
						window.infographics1Frame.setVisible(true);
						infographics1Frame.dispose();
					}
				});
				infographicPath.setBounds(380, 119, 124, 14);
				infographics1Frame.getContentPane().add(infographicPath);
		
		//Next Button
				JLabel nextButton = new JLabel("");
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						infographics2_Era window = new infographics2_Era();
						window.infographics2Frame.setVisible(true);
						infographics1Frame.dispose();
					}
				});
				nextButton.setBounds(879, 237, 82, 34);
				infographics1Frame.getContentPane().add(nextButton);
		
		
		
	
		//Insert the image label.
		JLabel infographics1BG = new JLabel("");
		infographics1BG.setIcon(new ImageIcon(infographics1_Era.class.getResource("/allaiza_images/infographics1.png")));
		infographics1BG.setBounds(0, 0, 1084, 691);
		infographics1Frame.getContentPane().add(infographics1BG);
		
		
	}

}
