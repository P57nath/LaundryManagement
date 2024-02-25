import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.util.*;

public class Recovery {

	JFrame frame;
	@SuppressWarnings("rawtypes")
	public static JComboBox securityQsn;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recovery window = new Recovery();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Recovery() {
		initialize();
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 676, 476);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 51, 406);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Recovery");
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton.setBounds(217, 323, 115, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                Reg log = new Reg();
                log.frame.setVisible(true);
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
		
		JLabel lblNewLabel_3 = new JLabel("Already Have Account!");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
                Login log = new Login();
                log.frame.setVisible(true);
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
		lblNewLabel_2.setIcon(new ImageIcon("2.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(75, 0, 130));
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Elephant", Font.BOLD, 30));
		
		JLabel lblNewLabel_4 = new JLabel("User Name");
		lblNewLabel_4.setForeground(new Color(75, 0, 130));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(355, 45, 121, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setForeground(new Color(75, 0, 130));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(352, 84, 270, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Your Security Question....");
		lblNewLabel_5.setForeground(new Color(75, 0, 130));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(352, 129, 214, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		String[] secQsn = { "Choose a Security Question...", "Your Favorite Person?", "Your Favorite Food?",
                "First School Name?", "Your Game Name?" };
		securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(352, 166, 270, 51);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(new Font("Tahoma", Font.BOLD, 15));
        securityQsn.setBorder(new LineBorder(new Color(75, 0, 130), 3, true));
        securityQsn.setForeground(new Color(75, 0, 130));
        securityQsn.setBackground(new Color(192, 192, 192));
        frame.getContentPane().add(securityQsn);
		
		JLabel lblNewLabel_6 = new JLabel("Answer");
		lblNewLabel_6.setForeground(new Color(75, 0, 130));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(352, 237, 155, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setForeground(new Color(75, 0, 130));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setBounds(352, 277, 270, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setForeground(new Color(75, 0, 130));
		btnNewButton_2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(518, 363, 104, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("Captcha");
		lblNewLabel_7.setForeground(new Color(75, 0, 130));
		lblNewLabel_7.setBackground(new Color(192, 192, 192));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7.setBounds(352, 323, 78, 25);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setForeground(new Color(75, 0, 130));
		textField_2.setBounds(489, 323, 133, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        lblNewLabel_7 = new JLabel();
        lblNewLabel_7.setText(" " + a + " + " + b + " ");
        lblNewLabel_7.setBounds(434, 323, 42, 23);
        lblNewLabel_7.setForeground(Color.red);
        lblNewLabel_7.setBackground(Color.decode("#FFD3D3"));
        lblNewLabel_7.setOpaque(true);
        frame.getContentPane().add(lblNewLabel_7);
		
		
	}
}
