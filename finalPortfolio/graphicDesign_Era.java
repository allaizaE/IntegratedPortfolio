package finalPortfolio;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class graphicDesign_Era {

	JFrame graphicDesignFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					graphicDesign_Era window = new graphicDesign_Era();
					window.graphicDesignFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public graphicDesign_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Initialize the frame.
		graphicDesignFrame = new JFrame();
		graphicDesignFrame.setBounds(100, 100, 1100, 730);
		graphicDesignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
				//Home Label Click [1]
				JLabel homeClick = new JLabel("");
				homeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						homepage_Era window = new homepage_Era();
						window.homePageFrame.setVisible(true);
						graphicDesignFrame.dispose();
						
					}
				});
				graphicDesignFrame.getContentPane().setLayout(null);
				homeClick.setBounds(336, 48, 59, 21);
				graphicDesignFrame.getContentPane().add(homeClick);
				
				//About Label Click [2]
				JLabel aboutLabel = new JLabel("");
				aboutLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						about_Era window = new about_Era();
						window.aboutFrame.setVisible(true);
						graphicDesignFrame.dispose();
						
					}
				});
				aboutLabel.setBounds(465, 48, 68, 21);
				graphicDesignFrame.getContentPane().add(aboutLabel);
				
				//Work Label Click [3]
				JLabel workLabel1 = new JLabel("");
				workLabel1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						graphicDesignFrame.dispose();
					}
				});
				
				workLabel1.setBounds(586, 38, 91, 41);
				graphicDesignFrame.getContentPane().add(workLabel1);
				
				//Resume Label Click [4]
				JLabel resumeClick = new JLabel("");
				resumeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						resume_Era window = new resume_Era();
						window.resumeFrame.setVisible(true);
						graphicDesignFrame.dispose();
						
					}
				});
				resumeClick.setBounds(732, 48, 82, 21);
				graphicDesignFrame.getContentPane().add(resumeClick);
				
				//Contact Label Click [5]
				JLabel contactClick = new JLabel("");
				contactClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						contactMe_Era window = new contactMe_Era();
						window.contactFrame.setVisible(true);
						graphicDesignFrame.dispose();
					}
				});
				contactClick.setBounds(866, 41, 146, 34);
				graphicDesignFrame.getContentPane().add(contactClick);
				
		//Buttons for the three choices.
				//When clicked, it proceeds to infographics1Frame.
				JLabel infoNext = new JLabel("");
				infoNext.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					infographics1_Era window = new infographics1_Era();
					window.infographics1Frame.setVisible(true);
					graphicDesignFrame.dispose();
				}
				});
				infoNext.setBounds(68, 275, 299, 366);
				graphicDesignFrame.getContentPane().add(infoNext);	
				
				//When clicked, it proceeds to academicRequirementFrame.
				JLabel acadNext = new JLabel("");
				acadNext.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					academicRequirement1_Era window = new academicRequirement1_Era();
					window.academicRequirement1F.setVisible(true);
					graphicDesignFrame.dispose();
				}
				});
				acadNext.setBounds(393, 275, 299, 366);
				graphicDesignFrame.getContentPane().add(acadNext);	
				
				//When clicked, it proceeds to	socialMediaPost1Frame.
				JLabel socmedNext = new JLabel("");
				socmedNext.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					socialMediaPost1_Era window = new socialMediaPost1_Era();
					window.socialMediaPost1Frame.setVisible(true);
					graphicDesignFrame.dispose();
				}
				});
				socmedNext.setBounds(713, 275, 299, 366);
				graphicDesignFrame.getContentPane().add(socmedNext);	
		
		
		//Insert the image label.
		JLabel graphicDBG = new JLabel("");
		graphicDBG.setIcon(new ImageIcon(graphicDesign_Era.class.getResource("/allaiza_images/graphic design.png")));
		graphicDBG.setBounds(0, 0, 1084, 691);
		graphicDesignFrame.getContentPane().add(graphicDBG);
		
		
		
			
			
			
			
			
			
			
	}
	

}
