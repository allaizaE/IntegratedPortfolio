package finalPortfolio;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class codesProgram_Angeles extends MainPage_Angeles{

	JFrame CodesProgramFrame;
	private final JLabel JavaworksButton = new JLabel("");
	private final JLabel HTMLWorksButton = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					codesProgram_Angeles window = new codesProgram_Angeles();
					window.CodesProgramFrame.setVisible(true);
					window.CodesProgramFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public codesProgram_Angeles() {
		initialize();
	}

	
	private void initialize() {
		
		//contents of the frame
		CodesProgramFrame = new JFrame();
		CodesProgramFrame.setTitle("Codes/Program");
		CodesProgramFrame.setBounds(100, 100, 910, 632);
		CodesProgramFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CodesProgramFrame.getContentPane().setLayout(null);
		
		//navigation button
		HTMLWorksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				HTMLWorkss__Angeles htmlworks = new HTMLWorkss__Angeles();
				htmlworks.body();
				CodesProgramFrame.dispose();
			} 
		});
		HTMLWorksButton.setIcon(new ImageIcon(codesProgram_Angeles.class.getResource("/johan_images/HTMLButton.png")));
		HTMLWorksButton.setBounds(434, 275, 202, 120);
		
		CodesProgramFrame.getContentPane().add(HTMLWorksButton);
		JavaworksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JavaWorks_Angeles javaWorks = new JavaWorks_Angeles();
				javaWorks.body();
				CodesProgramFrame.dispose();
				
		        
				
			}
		});
		JavaworksButton.setIcon(new ImageIcon(codesProgram_Angeles.class.getResource("/johan_images/JavaButton.png")));
		JavaworksButton.setBounds(670, 275, 200, 120);
		
		CodesProgramFrame.getContentPane().add(JavaworksButton);
		
		JLabel CodesBackground = new JLabel("");
		CodesBackground.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainPage_Angeles main = new MainPage_Angeles();
				main.HomepageFrame.setVisible(true);
				CodesProgramFrame.dispose();
			}
		});
		CodesBackground.setIcon(new ImageIcon(codesProgram_Angeles.class.getResource("/johan_images/codesProgrambg.png")));
		CodesBackground.setBounds(0, 0, 909, 600);
		CodesProgramFrame.getContentPane().add(CodesBackground);
	}
	
}