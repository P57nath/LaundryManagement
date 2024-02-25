import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Payment {

	JFrame frame;
	private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Payment() {
		initialize();
	}

	private void initialize() {
			frame = new JFrame();
	        frame.getContentPane().setBackground(new Color(192, 192, 192));
	        frame.setBounds(100, 100, 447, 447);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);

	        JLabel lblNewLabel_1 = new JLabel("We Accept ");
	        lblNewLabel_1.setForeground(new Color(75, 0, 130));
	        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblNewLabel_1.setBounds(64, 78, 114, 24);
	        frame.getContentPane().add(lblNewLabel_1);

	        JLabel lblNewLabel_2 = new JLabel("");
	        lblNewLabel_2.setIcon(new ImageIcon("MicrosoftTeams-image (8).png"));
	        lblNewLabel_2.setBounds(215, 62, 70, 53);
	        frame.getContentPane().add(lblNewLabel_2);

	        JLabel lblNewLabel_3 = new JLabel("");
	        lblNewLabel_3.setIcon(new ImageIcon("MicrosoftTeams-image (9).png"));
	        lblNewLabel_3.setBounds(306, 62, 76, 53);
	        frame.getContentPane().add(lblNewLabel_3);

	        JLabel lblNewLabel_4 = new JLabel("Card Details");
	        lblNewLabel_4.setForeground(new Color(75, 0, 130));
	        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblNewLabel_4.setBounds(64, 137, 114, 27);
	        frame.getContentPane().add(lblNewLabel_4);

	        JLabel lblNewLabel_5 = new JLabel("Name On Card");
	        lblNewLabel_5.setForeground(new Color(75, 0, 130));
	        lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNewLabel_5.setBounds(64, 174, 114, 24);
	        frame.getContentPane().add(lblNewLabel_5);

	        textField = new JTextField();
	        textField.setFont(new Font("Tahoma", Font.BOLD, 14));
	        textField.setForeground(new Color(75, 0, 130));
	        textField.setBackground(new Color(192, 192, 192));
	        textField.setBounds(197, 177, 172, 19);
	        frame.getContentPane().add(textField);
	        textField.setColumns(10);

	        JLabel lblNewLabel_6 = new JLabel("Card Number");
	        lblNewLabel_6.setForeground(new Color(75, 0, 130));
	        lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNewLabel_6.setBounds(64, 208, 114, 24);
	        frame.getContentPane().add(lblNewLabel_6);

	        textField_1 = new JTextField();
	        textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	        textField_1.setForeground(new Color(75, 0, 130));
	        textField_1.setBackground(new Color(192, 192, 192));
	        textField_1.setBounds(197, 211, 172, 19);
	        frame.getContentPane().add(textField_1);
	        textField_1.setColumns(10);

	        JLabel lblNewLabel_7 = new JLabel("Valid On");
	        lblNewLabel_7.setForeground(new Color(75, 0, 130));
	        lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNewLabel_7.setBounds(64, 242, 93, 24);
	        frame.getContentPane().add(lblNewLabel_7);

	        textField_2 = new JTextField();
	        textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	        textField_2.setForeground(new Color(75, 0, 130));
	        textField_2.setBackground(new Color(192, 192, 192));
	        textField_2.setBounds(136, 245, 82, 19);
	        frame.getContentPane().add(textField_2);
	        textField_2.setColumns(10);

	        JLabel lblNewLabel_8 = new JLabel("CVV Code");
	        lblNewLabel_8.setForeground(new Color(75, 0, 130));
	        lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNewLabel_8.setBounds(228, 244, 93, 20);
	        frame.getContentPane().add(lblNewLabel_8);

	        textField_3 = new JTextField();
	        textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
	        textField_3.setForeground(new Color(75, 0, 130));
	        textField_3.setBackground(new Color(192, 192, 192));
	        textField_3.setBounds(320, 245, 45, 19);
	        frame.getContentPane().add(textField_3);
	        textField_3.setColumns(10);

	        JButton btnNewButton = new JButton("Confirm Payment");
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		String nameOnCard = textField.getText();
	                String cardNumber = textField_1.getText();
	                String validOn = textField_2.getText();
	                String cvvCode = textField_3.getText();
	                String price = textField_4.getText();
	                if(price.isEmpty()) 
	                {
	                	JOptionPane.showMessageDialog(null, "Please Enter the Amount", "Warning!",
	                            JOptionPane.WARNING_MESSAGE);
	                }
	                else {
	                		if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() || cvvCode.isEmpty()) {
	                			JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
	                            JOptionPane.WARNING_MESSAGE);
	                		} 	                
	                		else {
	                			try {
	                                File file2 = new File("payment_data.txt");
	                                if (!file2.exists()) {
	                                    file2.createNewFile();
	                                }
	                                FileWriter fw = new FileWriter(file2, true);
	                                BufferedWriter bw = new BufferedWriter(fw);
	                                PrintWriter pw = new PrintWriter(bw);
	                                	                              
	                                pw.println("Name On Card : " + nameOnCard);
	                                pw.println("Card Number : " + cardNumber);                                                     
	                                pw.println("Valid On : " + validOn);
	                                pw.println("CVV : " + cvvCode);
	                                pw.println("Price : " + price);
	                                pw.println("===============================================");
	                                pw.close();

	                            } catch (Exception ex) {
	                                System.out.print(ex);
	                            }
	                    
	                			JOptionPane.showMessageDialog(null, "Payment Successfully Completed.",
	                					"Payment Complete", JOptionPane.WARNING_MESSAGE);                       
	                			frame.setVisible(false);
	                			paySuccess pay = new paySuccess();
	                			pay.frame.setVisible(true);
	                		}
	                	}	
	        	}
	        });
	        btnNewButton.setForeground(new Color(75, 0, 130));
	        btnNewButton.setBackground(new Color(192, 192, 192));
	        btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
	        btnNewButton.setBounds(230, 369, 139, 21);
	        frame.getContentPane().add(btnNewButton);

	        JButton btnNewButton_2 = new JButton("Exit");
	        btnNewButton_2.setForeground(new Color(75, 0, 130));
	        btnNewButton_2.setBackground(new Color(192, 192, 192));
	        btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 11));
	        btnNewButton_2.setBounds(64, 369, 85, 21);
	        frame.getContentPane().add(btnNewButton_2);
	        

	        btnNewButton_2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                System.exit(0);
	            }
	        });

	        JPanel panel = new JPanel();
	        panel.setBackground(new Color(75, 0, 130));
	        panel.setBounds(0, 0, 752, 45);
	        frame.getContentPane().add(panel);
	        	        panel.setLayout(null);
	        
	        	        JLabel lblNewLabel = new JLabel("Complete Your Payment");
	        	        lblNewLabel.setBounds(41, 10, 322, 35);
	        	        panel.add(lblNewLabel);
	        	        lblNewLabel.setForeground(new Color(255, 255, 255));
	        	        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
	        	        
	        	        JLabel lblNewLabel_5_1 = new JLabel("Amount");
	        	        lblNewLabel_5_1.setForeground(new Color(75, 0, 130));
	        	        lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        	        lblNewLabel_5_1.setBounds(64, 305, 114, 24);
	        	        frame.getContentPane().add(lblNewLabel_5_1);
	        	        
	        	        textField_4 = new JTextField();
	        	        textField_4.setForeground(new Color(75, 0, 130));
	        	        textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
	        	        textField_4.setColumns(10);
	        	        textField_4.setBackground(Color.LIGHT_GRAY);
	        	        textField_4.setBounds(197, 308, 172, 19);
	        	        frame.getContentPane().add(textField_4);
	}

}
