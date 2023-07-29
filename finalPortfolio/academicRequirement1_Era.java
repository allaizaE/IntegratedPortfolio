package finalPortfolio;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class academicRequirement1_Era {

	 JFrame academicRequirement1F;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					academicRequirement1_Era window = new academicRequirement1_Era();
					window.academicRequirement1F.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public academicRequirement1_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Initialize the frame.
		academicRequirement1F = new JFrame();
		academicRequirement1F.setBounds(100, 100, 1100, 730);
		academicRequirement1F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
				//Home Label Click [1]
				JLabel homeClick = new JLabel("");
				homeClick.setBounds(336, 48, 59, 21);
				homeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						homepage_Era window = new homepage_Era();
						window.homePageFrame.setVisible(true);
						academicRequirement1F.dispose();
						
					}
				});
				academicRequirement1F.getContentPane().setLayout(null);
				academicRequirement1F.getContentPane().add(homeClick);
				
				//About Label Click [2]
				JLabel aboutLabel = new JLabel("");
				aboutLabel.setBounds(465, 48, 68, 21);
				aboutLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						about_Era window = new about_Era();
						window.aboutFrame.setVisible(true);
						academicRequirement1F.dispose();
						
					}
				});
				academicRequirement1F.getContentPane().add(aboutLabel);
				
				//Work Label Click [3]
				JLabel workLabel1 = new JLabel("");
				workLabel1.setBounds(586, 38, 91, 41);
				workLabel1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						academicRequirement1F.dispose();
					}
				});
				academicRequirement1F.getContentPane().add(workLabel1);
				
				//Resume Label Click [4]
				JLabel resumeClick = new JLabel("");
				resumeClick.setBounds(732, 48, 82, 21);
				resumeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						resume_Era window = new resume_Era();
						window.resumeFrame.setVisible(true);
						academicRequirement1F.dispose();
						
					}
				});
				academicRequirement1F.getContentPane().add(resumeClick);
				
				//Contact Label Click [5]
				JLabel contactClick = new JLabel("");
				contactClick.setBounds(866, 41, 146, 34);
				contactClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						contactMe_Era window = new contactMe_Era();
						window.contactFrame.setVisible(true);
						academicRequirement1F.dispose();
					}
					
				});
				academicRequirement1F.getContentPane().add(contactClick);
		

			//Button for paths.
				//Mouse click to go back to my works page.
				JLabel myWorkPath = new JLabel("");
				myWorkPath.setBounds(78, 119, 91, 14);
				myWorkPath.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						academicRequirement1F.dispose();
					}
				});
				academicRequirement1F.getContentPane().add(myWorkPath);
		
				//Mouse click to go back to graphic design page.
				JLabel graphicPath = new JLabel("");
				graphicPath.setBounds(204, 119, 146, 14);
				graphicPath.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						graphicDesign_Era window = new graphicDesign_Era();
						window.graphicDesignFrame.setVisible(true);
						academicRequirement1F.dispose();
					}
				});
				academicRequirement1F.getContentPane().add(graphicPath);
				
				//Mouse click to go back to acadRequirement page.
				JLabel acadPath = new JLabel("");
				acadPath.setBounds(374, 119, 238, 14);
				acadPath.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						academicRequirement1_Era window = new academicRequirement1_Era();
						window.academicRequirement1F.setVisible(true);
						academicRequirement1F.dispose();
					}
				});
				academicRequirement1F.getContentPane().add(acadPath);
		
				
		//Next Button to proceed to the next acadRequirement.
		JLabel nextButton = new JLabel("");
		nextButton.setBounds(924, 236, 88, 41);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				academicRequirement2_Era window = new academicRequirement2_Era();
				window.academicRequirement2F.setVisible(true);
				academicRequirement1F.dispose();
			}
		});
		academicRequirement1F.getContentPane().add(nextButton);
		
		
		
		
		
		//Insert the image label.
		JLabel academicRequirement1BG = new JLabel("");
		academicRequirement1BG.setBounds(0, 0, 1084, 691);
		academicRequirement1BG.setIcon(new ImageIcon(academicRequirement1_Era.class.getResource("/allaiza_images/academicRequirements1.png")));
		academicRequirement1F.getContentPane().add(academicRequirement1BG);
	}

}
