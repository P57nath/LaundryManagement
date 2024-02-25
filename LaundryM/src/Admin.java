import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Admin() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("X Laundry");
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 678, 478);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 51, 406);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                Login log = new Login();
                log.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton.setBounds(217, 323, 115, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBackground(new Color(75, 0, 130));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton_1.setBounds(67, 323, 115, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("||");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(192, 302, 14, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Don't Have Any Account?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(149, 365, 138, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(75, 0, 130));
		panel_1.setBounds(47, 0, 295, 406);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("icons8_Login_As_User_250px_1.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(75, 0, 130));
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Elephant", Font.BOLD, 30));
		
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(149, 365, 138, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		Label label = new Label("Admin Login");
		label.setForeground(new Color(75, 0, 130));
		label.setFont(new Font("Segoe UI Variable", Font.BOLD, 25));
		label.setBounds(362, 0, 196, 58);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setForeground(new Color(75, 0, 130));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(364, 78, 124, 43);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setForeground(new Color(75, 0, 130));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(362, 131, 217, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(75, 0, 130));
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setBounds(361, 241, 217, 32);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_6 = new JLabel("Password ");
		lblNewLabel_6.setForeground(new Color(75, 0, 130));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(363, 187, 125, 44);
		frame.getContentPane().add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ShowPassword");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					passwordField.setEchoChar((char)0);
				   } else {
					   passwordField.setEchoChar('*');
				   }
			}
		});
		rdbtnNewRadioButton.setBackground(new Color(192, 192, 192));
		rdbtnNewRadioButton.setForeground(new Color(75, 0, 130));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(489, 296, 127, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String username = textField.getText().toLowerCase(); 
                String pass = new String (passwordField.getPassword());

                if (username.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
                else 
                {
                    try 
                    {
        				if(username.equals("admin1234"))
        				{
							if(pass.equals("admin1234"))
							{
								JOptionPane.showMessageDialog(null, "Login Successful.", "X Laundry!",
                                        JOptionPane.WARNING_MESSAGE);
								frame.setVisible(false);
	                            OUtlet log = new OUtlet();
	                            log.frame.setVisible(true);				
							}
        				}
        				else
						{
							JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
	                                JOptionPane.WARNING_MESSAGE);
						}
                    } 
                    catch (Exception ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
			}
		});
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setForeground(new Color(75, 0, 130));
		btnNewButton_2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(376, 323, 100, 53);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setForeground(new Color(75, 0, 130));
		btnNewButton_3.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_3.setBounds(489, 323, 100, 53);
		frame.getContentPane().add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(342, 0, 280, 406);
		frame.getContentPane().add(panel_2);
	}
}
