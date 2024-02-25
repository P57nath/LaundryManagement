import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Itemmaster {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Itemmaster window = new Itemmaster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Itemmaster() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 780, 574);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 117, 165, 152);
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setIcon(new ImageIcon("MicrosoftTeams-image (9)13.png"));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(196, 117, 165, 152);
		btnNewButton_1.setIcon(new ImageIcon("MicrosoftTeams-image (8)12.png"));
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(382, 117, 165, 152);
		btnNewButton_2.setIcon(new ImageIcon("MicrosoftTeams-image (12).png"));
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(571, 117, 165, 152);
		btnNewButton_3.setIcon(new ImageIcon("MicrosoftTeams-image (14).png"));
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(10, 334, 165, 152);
		btnNewButton_4.setIcon(new ImageIcon("MicrosoftTeams-image (13).png"));
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(196, 334, 165, 152);
		btnNewButton_5.setIcon(new ImageIcon("MicrosoftTeams-image (10).png"));
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(571, 334, 165, 152);
		btnNewButton_7.setIcon(new ImageIcon("MicrosoftTeams-image (15).png"));
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(382, 337, 165, 152);
		btnNewButton_6.setIcon(new ImageIcon("MicrosoftTeams-image (15).png"));
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("Mens Coat");
		lblNewLabel_1.setBounds(10, 279, 85, 13);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mens Pant");
		lblNewLabel_2.setBounds(196, 279, 107, 13);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tshirt");
		lblNewLabel_3.setBounds(382, 280, 107, 13);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Womens Sari");
		lblNewLabel_4.setBounds(571, 280, 119, 13);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BDT 100");
		lblNewLabel_5.setBounds(10, 299, 85, 13);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Womens Top");
		lblNewLabel_6.setBounds(10, 491, 107, 13);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mens Shirt");
		lblNewLabel_7.setBounds(196, 496, 85, 13);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comming Soon");
		lblNewLabel_8.setBounds(382, 492, 126, 21);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Comming Soon");
		lblNewLabel_9.setBounds(571, 492, 119, 21);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("BDT 50");
		lblNewLabel_10.setBounds(196, 300, 85, 13);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("BDT 50");
		lblNewLabel_10_1.setBounds(382, 299, 85, 13);
		lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("BDT 50");
		lblNewLabel_10_2.setBounds(571, 300, 85, 13);
		lblNewLabel_10_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("BDT 50");
		lblNewLabel_10_3.setBounds(10, 512, 85, 13);
		lblNewLabel_10_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("BDT 50");
		lblNewLabel_10_4.setBounds(196, 512, 85, 13);
		lblNewLabel_10_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_10_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(0, 0, 766, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item Master");
		lblNewLabel.setBounds(218, 10, 270, 58);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("logout (1)color.png"));
		btnNewButton_8.setBackground(new Color(75, 0, 130));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8.setForeground(new Color(75, 0, 130));
		btnNewButton_8.setToolTipText("Back");
		btnNewButton_8.setBounds(692, 26, 50, 32);
		panel.add(btnNewButton_8);
		
		
		btnNewButton_8.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                OUtlet ou = new OUtlet();
                ou.frame.setVisible(true);
            }
        });
	}
}