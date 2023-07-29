package finalPortfolio;


import java.awt.EventQueue;
import org.junit.Test;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INTEGRATION {
	
	JFrame integrationFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INTEGRATION window = new INTEGRATION();
					window.integrationFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public INTEGRATION() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		integrationFrame = new JFrame();
		integrationFrame.setForeground(new Color(23, 23, 23));
		integrationFrame.setBackground(new Color(23, 23, 23));
		integrationFrame.setBounds(100, 100, 1250, 870);
		integrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		integrationFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(23, 23, 23));
		panel.setBounds(0, 0, 1234, 831);
		integrationFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(INTEGRATION.class.getResource("/matt_images/coderkidz_portfolio.png")));
		logo.setBounds(253, 11, 731, 297);
		panel.add(logo);
		
		JButton mattBTTN = new JButton("");
		mattBTTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage_Adami window = new HomePage_Adami();
				window.setVisible(true);
				integrationFrame.dispose();
			}
		});
		
		mattBTTN.setBackground(new Color(23, 23, 23));
		mattBTTN.setIgnoreRepaint(true);
		mattBTTN.setBorderPainted(false);
		mattBTTN.setBorder(null);
		mattBTTN.setIcon(new ImageIcon(INTEGRATION.class.getResource("/matt_images/matt.png")));
		mattBTTN.setBounds(115, 279, 250, 318);
		panel.add(mattBTTN);
		
		JButton johanBTTN = new JButton("");
		johanBTTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage_Angeles window = new MainPage_Angeles();
				window.HomepageFrame.setVisible(true);
				integrationFrame.dispose();
				
			}
		});
		johanBTTN.setBorder(null);
		johanBTTN.setBackground(new Color(23, 23, 23));
		johanBTTN.setIcon(new ImageIcon(INTEGRATION.class.getResource("/matt_images/johan.png")));
		johanBTTN.setBounds(493, 279, 238, 318);
		panel.add(johanBTTN);
		
		JButton allaizaBTTN = new JButton("");
		allaizaBTTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage_Era window = new homepage_Era();
				window.homePageFrame.setVisible(true);
				integrationFrame.dispose();
				integrationTest();
				
			}
		});
		allaizaBTTN.setBackground(new Color(23, 23, 23));
		allaizaBTTN.setBorder(null);
		allaizaBTTN.setIcon(new ImageIcon(INTEGRATION.class.getResource("/matt_images/allaiza.png")));
		allaizaBTTN.setBounds(836, 279, 238, 318);
		panel.add(allaizaBTTN);
	}
	@Test
	public void integrationTest() {
		
	}
}
