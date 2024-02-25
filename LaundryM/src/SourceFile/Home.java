import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Home{

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("X Laundry");
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 676, 476);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("image_processing20210911-14256-1sen0jl.gif"));
		lblNewLabel.setBounds(0, 111, 664, 328);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("-_-X Laundry -_-");
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setFont(new Font("Magneto", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(33, 10, 594, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.setVisible(false);
                Login log = new Login();
                log.frame.setVisible(true);
			}
		});
		
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(75, 0, 130));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(266, 69, 127, 32);
		frame.getContentPane().add(btnNewButton);
	}

	}


