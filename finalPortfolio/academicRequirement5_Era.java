package finalPortfolio;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class academicRequirement5_Era {

	 JFrame academicRequirement5F;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					academicRequirement5_Era window = new academicRequirement5_Era();
					window.academicRequirement5F.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public academicRequirement5_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Initialize the frame.
		academicRequirement5F = new JFrame();
		academicRequirement5F.setBounds(100, 100, 1100, 730);
		academicRequirement5F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
		//Home Label Click [1]
		JLabel homeClick = new JLabel("");
		homeClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homepage_Era window = new homepage_Era();
				window.homePageFrame.setVisible(true);
				academicRequirement5F.dispose();
				
			}
		});
		academicRequirement5F.getContentPane().setLayout(null);
		homeClick.setBounds(336, 48, 59, 21);
		academicRequirement5F.getContentPane().add(homeClick);
		
		//About Label Click [2]
		JLabel aboutLabel = new JLabel("");
		aboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				about_Era window = new about_Era();
				window.aboutFrame.setVisible(true);
				academicRequirement5F.dispose();
				
			}
		});
		aboutLabel.setBounds(465, 48, 68, 21);
		academicRequirement5F.getContentPane().add(aboutLabel);
		
		//Work Label Click [3]
		JLabel workLabel1 = new JLabel("");
		workLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myWorks_Era window = new myWorks_Era();
				window.myWorksFrame.setVisible(true);
				academicRequirement5F.dispose();
			}
		});
		
		workLabel1.setBounds(586, 38, 91, 41);
		academicRequirement5F.getContentPane().add(workLabel1);
		
		//Resume Label Click [4]
		JLabel resumeClick = new JLabel("");
		resumeClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resume_Era window = new resume_Era();
				window.resumeFrame.setVisible(true);
				academicRequirement5F.dispose();
				
			}
		});
		resumeClick.setBounds(732, 48, 82, 21);
		academicRequirement5F.getContentPane().add(resumeClick);
		
		//Contact Label Click [5]
		JLabel contactClick = new JLabel("");
		contactClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contactMe_Era window = new contactMe_Era();
				window.contactFrame.setVisible(true);
				academicRequirement5F.dispose();
			}
		});
		contactClick.setBounds(866, 41, 146, 34);
		academicRequirement5F.getContentPane().add(contactClick);


		
	//Button for paths.
		//Mouse click to go back to my works page.
		JLabel myWorkPath = new JLabel("");
		myWorkPath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myWorks_Era window = new myWorks_Era();
				window.myWorksFrame.setVisible(true);
				academicRequirement5F.dispose();
			}
		});
		myWorkPath.setBounds(78, 119, 91, 14);
		academicRequirement5F.getContentPane().add(myWorkPath);

		//Mouse click to go back to graphic design page.
		JLabel graphicPath = new JLabel("");
		graphicPath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				graphicDesign_Era window = new graphicDesign_Era();
				window.graphicDesignFrame.setVisible(true);
				academicRequirement5F.dispose();
			}
		});
		graphicPath.setBounds(204, 119, 146, 14);
		academicRequirement5F.getContentPane().add(graphicPath);
		
		//Mouse click to go back to acadRequirement page.
		JLabel acadPath = new JLabel("");
		acadPath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				academicRequirement1_Era window = new academicRequirement1_Era();
				window.academicRequirement1F.setVisible(true);
				academicRequirement5F.dispose();
			}
		});
		acadPath.setBounds(374, 119, 238, 14);
		academicRequirement5F.getContentPane().add(acadPath);

		
	
	
	//Previous button to go to the previous page shown. 
		JLabel previousButton = new JLabel("");
		previousButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				academicRequirement4_Era window = new academicRequirement4_Era();
				window.academicRequirement4F.setVisible(true);
				academicRequirement5F.dispose();
			}
		});
		previousButton.setBounds(919, 238, 82, 41);
		academicRequirement5F.getContentPane().add(previousButton);
		
		//Insert the image label.
		JLabel academicRequirement5BG = new JLabel("");
		academicRequirement5BG.setIcon(new ImageIcon(academicRequirement5_Era.class.getResource("/allaiza_images/academicRequirements5.png")));
		academicRequirement5BG.setBounds(0, 0, 1084, 691);
		academicRequirement5F.getContentPane().add(academicRequirement5BG);
	}

}
