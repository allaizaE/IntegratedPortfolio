package finalPortfolio;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Achievments_Angeles {

	 JFrame AchievmentsFrame;
	private final JLabel AchievmentsBg = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achievments_Angeles window = new Achievments_Angeles();
					window.AchievmentsFrame.setVisible(true);
					window.AchievmentsFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Achievments_Angeles() {
		initialize();
	}

	private void initialize() {
		
		//contents of the frame
		AchievmentsFrame = new JFrame();
		AchievmentsFrame.setTitle("Achievements");
		AchievmentsFrame.setResizable(false);
		AchievmentsFrame.setBounds(100, 100, 900, 600);
		AchievmentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AchievmentsFrame.getContentPane().setLayout(null);
		
		
		//navigation button
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AboutMyself_Angeles abtmyself = new AboutMyself_Angeles();
				abtmyself.AboutMyselfFrame.setVisible(true);
				AchievmentsFrame.dispose();
			}
		});
		
		returnButton.setIcon(new ImageIcon(Achievments_Angeles.class.getResource("/johan_images/returnButton.png")));
		returnButton.setBounds(10, 468, 258, 261);
		AchievmentsFrame.getContentPane().add(returnButton);
		AchievmentsBg.setIcon(new ImageIcon(Achievments_Angeles.class.getResource("/johan_images/AchievmentsBg.png")));
		AchievmentsBg.setBounds(0, 0, 884, 561);
		AchievmentsFrame.getContentPane().add(AchievmentsBg);
	}

}