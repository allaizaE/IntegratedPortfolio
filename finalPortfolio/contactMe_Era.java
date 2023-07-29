package finalPortfolio;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class contactMe_Era extends homepage_Era{

	JFrame contactFrame;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField emailField;
	private JTextArea projDetailArea;
	private JCheckBox tradArtCheck;
	private File file;
	String service1;
	String service2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contactMe_Era window = new contactMe_Era();
					window.contactFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public contactMe_Era() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		contactFrame = new JFrame();
		contactFrame.setBounds(100, 100, 1100, 730);
		contactFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contactFrame.getContentPane().setLayout(null);
		
		//This section contains all the buttons for the menu bar. JLabel is used instead of JButton to provide more neat interface. 
				//Home Label Click [1]
				JLabel homeClick = new JLabel("");
				homeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						homepage_Era window = new homepage_Era();
						window.homePageFrame.setVisible(true);
						contactFrame.dispose();
						
					}
				});
				
				//About Label Click [2]
				JLabel aboutLabel = new JLabel("");
				aboutLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						about_Era window = new about_Era();
						window.aboutFrame.setVisible(true);
						contactFrame.dispose();
						
					}
				});
				aboutLabel.setBounds(465, 48, 68, 21);
				contactFrame.getContentPane().add(aboutLabel);
				
				//Work Label Click [3]
				JLabel workLabel1 = new JLabel("");
				workLabel1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						myWorks_Era window = new myWorks_Era();
						window.myWorksFrame.setVisible(true);
						contactFrame.dispose();
					}
				});
				
				workLabel1.setBounds(586, 38, 91, 41);
				contactFrame.getContentPane().add(workLabel1);
				
				//Resume Label Click [4]
				JLabel resumeClick = new JLabel("");
				resumeClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						resume_Era window = new resume_Era();
						window.resumeFrame.setVisible(true);
						contactFrame.dispose();
						
					}
				});
				resumeClick.setBounds(732, 48, 82, 21);
				contactFrame.getContentPane().add(resumeClick);
				
				//Contact Label Click [5]
				JLabel contactClick = new JLabel("");
				contactClick.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						contactMe_Era window = new contactMe_Era();
						window.contactFrame.setVisible(true);
						contactFrame.dispose();
					}
				});
				contactClick.setBounds(866, 41, 146, 34);
				contactFrame.getContentPane().add(contactClick);
				
		
		//Creating a text file to store the input of the visitor of the page. 
		file = new File("ProjectDetails.txt"); 
		try {
			FileWriter writer = new FileWriter(file, true);
			//The field for FIRST NAME
			firstNameField = new JTextField();
			firstNameField.setBounds(103, 322, 264, 28);
			contactFrame.getContentPane().add(firstNameField);
			firstNameField.setColumns(10);
			
			//The field for LAST NAME
			lastNameField = new JTextField();
			lastNameField.setColumns(10);
			lastNameField.setBounds(410, 322, 264, 28);
			contactFrame.getContentPane().add(lastNameField);
			
			//The field for EMAIL
			emailField = new JTextField();
			emailField.setColumns(10);
			emailField.setBounds(717, 322, 264, 28);
			contactFrame.getContentPane().add(emailField);
			
			//The field for PROJECT DETAILS
			projDetailArea = new JTextArea();
			projDetailArea.setColumns(10);
			projDetailArea.setBounds(463, 395, 518, 101);
			contactFrame.getContentPane().add(projDetailArea);
			
			//check if the service needed is GRAPHIC DESIGN
			JCheckBox graphicDesignCheck = new JCheckBox("");
			graphicDesignCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					service1 = "graphic design";
				}
			});
			graphicDesignCheck.setBounds(103, 400, 21, 23);
			contactFrame.getContentPane().add(graphicDesignCheck);
			
			//check if the service needed is TRADITIONAL ART
			tradArtCheck = new JCheckBox("");
			tradArtCheck.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					service2 = "traditional art";
				}
			});
			tradArtCheck.setBounds(287, 395, 21, 28);
			contactFrame.getContentPane().add(tradArtCheck);
			
			
			//project start date
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(97, 474, 203, 23);
			contactFrame.getContentPane().add(dateChooser);
			
			
			
			//Start of writing the responses.
			JLabel submitLabel = new JLabel("");
			submitLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//Get the text from the field.
					//FIRST NAME
					String firstName = firstNameField.getText();
					//SECOND NAME
					String lastName = lastNameField.getText();
					//EMAIL
					String email = emailField.getText();
					//PROJECT DETAILS
					String details = projDetailArea.getText();
					//CHOSEN DATE
					String selectedDate = ((JTextFieldDateEditor) dateChooser.getDateEditor()).getText();
					
					
					
					//Write them in the text File
					try {
						writer.write("\n" +"First Name: " + firstName + "\n");
						writer.write("Last Name: " + lastName + "\n");
						writer.write("Email: " + email + "\n");
						writer.write("Service/s:" + "\n" );
						writer.write(service1 + "\n");
						writer.write(service2 + "\n" );
						writer.write("Project Details: " + "\n" );
						writer.write(details + "\n" );
						writer.write("Date: " +selectedDate);
						writer.close();
						JOptionPane.showMessageDialog(null, "Thank you for reaching out. I'll get back to you soon.", "Thank you.",
								JOptionPane.INFORMATION_MESSAGE);
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			submitLabel.setBounds(847, 536, 137, 36);
			contactFrame.getContentPane().add(submitLabel);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
		
		
		//Contact image background.
		JLabel contactBG = new JLabel("");
		contactBG.setIcon(new ImageIcon(contactMe_Era.class.getResource("/allaiza_images/contactMe.png")));
		contactBG.setBounds(0, 0, 1084, 691);
		contactFrame.getContentPane().add(contactBG);
	}
}
