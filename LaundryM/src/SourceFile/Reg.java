import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class Reg {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	@SuppressWarnings("rawtypes")
	public static JComboBox securityQsn;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg window = new Reg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reg() {
		initialize();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
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
		
		JButton btnNewButton = new JButton("Recovery");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                Recovery log = new Recovery();
                log.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 20));
		btnNewButton.setBounds(217, 323, 115, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
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
			@Override
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
		
		JLabel lblNewLabel_4 = new JLabel("Level");
		lblNewLabel_4.setForeground(new Color(75, 0, 130));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(364, 45, 60, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setForeground(new Color(75, 0, 130));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(364, 114, 76, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setForeground(new Color(75, 0, 130));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(364, 162, 89, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Answer");
		lblNewLabel_7.setForeground(new Color(75, 0, 130));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(364, 293, 89, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		Random rand = new Random();
        int ab = rand.nextInt(10);
        int ba = rand.nextInt(10);
        
		JButton btnNewButton_2 = new JButton("Create");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText().toLowerCase(); 
                String pass = new String (passwordField.getPassword());
                String answer = textField_2.getText(); 
                String textFid1 = textField_1.getText();
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); 
                int result = 0;

                if (textFid1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Captcha.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    result = Integer.parseInt(textField_1.getText());
                    if (username.isEmpty() || pass.isEmpty() || answer.isEmpty() || textFid1.isEmpty()
                            || ((securityQsn.getSelectedIndex()) == 0)) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } else if (result != (ab + ba)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else {

                        try {
                            File file = new File("user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + username);
                            pw.println("Password : " + pass);                          
                            pw.println("Security Question : " + secQsn);
                            pw.println("Answer : " + answer);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        frame.setVisible(false);
                        Login log = new Login();
                        log.frame.setVisible(true);
                    }
                }
			}
		});
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setForeground(new Color(75, 0, 130));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(373, 368, 102, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setForeground(new Color(75, 0, 130));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(521, 368, 85, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("User");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setForeground(new Color(75, 0, 130));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(462, 41, 76, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Admin");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Admin Restricted ", "Security!",
                        JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.setForeground(new Color(75, 0, 130));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBounds(567, 41, 76, 21);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_8 = new JLabel("||");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(534, 45, 45, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Security Question");
		lblNewLabel_9.setForeground(new Color(75, 0, 130));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(364, 210, 138, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setForeground(new Color(75, 0, 130));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(450, 113, 193, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setForeground(new Color(75, 0, 130));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setBounds(450, 290, 193, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setForeground(new Color(75, 0, 130));
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField.setBounds(450, 161, 193, 19);
		frame.getContentPane().add(passwordField);
		
		String[] secQsn = { "Choose a Security Question...", "Your Favorite Person?", "Your Favorite Food?",
                "First School Name?", "Your Game Name?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(373, 233, 270, 51);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(new Font("Tahoma", Font.BOLD, 15));
        securityQsn.setBorder(new LineBorder(new Color(75, 0, 130), 3, true));
        securityQsn.setForeground(new Color(75, 0, 130));
        securityQsn.setBackground(new Color(192, 192, 192));
        frame.getContentPane().add(securityQsn);
        
        JLabel lblNewLabel_7_1 = new JLabel("Captcha");
        lblNewLabel_7_1.setForeground(new Color(75, 0, 130));
        lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_7_1.setBackground(Color.LIGHT_GRAY);
        lblNewLabel_7_1.setBounds(364, 330, 78, 25);
        frame.getContentPane().add(lblNewLabel_7_1);
        
        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_1.setBackground(new Color(192, 192, 192));
        textField_1.setForeground(new Color(75, 0, 130));
        textField_1.setBounds(510, 330, 133, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

        JLabel lblNewLabel_7_2 = new JLabel();
        lblNewLabel_7_2.setText(" " + ab + " + " + ba + " ");
        lblNewLabel_7_2.setBounds(450, 332, 42, 23);
        lblNewLabel_7_2.setForeground(Color.red);
        lblNewLabel_7_2.setBackground(Color.decode("#FFD3D3"));
        lblNewLabel_7_2.setOpaque(true);
        frame.getContentPane().add(lblNewLabel_7_2);
		
	}

}
