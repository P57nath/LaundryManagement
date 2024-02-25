import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class ProductReg {

	JFrame frame;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductReg window = new ProductReg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ProductReg() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Laundry Category");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(183, 32, 284, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		String[] secQsn = { "Choose Laundry Category....","Men's Shirt","Men's Pant","Men's Coat","Ledis Top's","Ledis Pajama","Sharee","T-Shirt","Bedshit","Blanket",""};
        @SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox Category = new JComboBox(secQsn);
        Category.setBounds(204, 80, 250, 38);
       // securityQsn.setModel(new DefaultComboBoxModel(new String[] {"Choose Laundry Category....", "Men's Shirt", "Men's Pant", "Men's Coat", "Ledis Top's", "Ledis Pajama", "Sharee", "T-Shirt", "Bedshit", "Blanket", ""}));
        Category.setSelectedIndex(0);
        Category.setFont(new Font("Tahoma", Font.BOLD, 15));
        Category.setBorder(new LineBorder(new Color(75, 0, 130), 3, true));
        Category.setForeground(new Color(75, 0, 130));
        Category.setBackground(new Color(192, 192, 192));
        frame.getContentPane().add(Category);
        
        JLabel lblNewLabel = new JLabel("Price");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(75, 0, 130));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setBounds(270, 143, 95, 23);
        frame.getContentPane().add(lblNewLabel);
        
        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setForeground(new Color(75, 0, 130));
        textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_2.setColumns(10);
        textField_2.setBackground(Color.LIGHT_GRAY);
        textField_2.setBounds(270, 187, 96, 38);
        frame.getContentPane().add(textField_2);
        
        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        		{
                    String answer = textField_2.getText(); 
                    String cgy = String.valueOf(Category.getSelectedItem());

                    if (answer.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please Enter The Amount", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } 
                    else
                    {
                            try {
                                File file = new File("order_data.txt");
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                FileWriter fw = new FileWriter(file, true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                PrintWriter pw = new PrintWriter(bw);

                                LocalDateTime myDateObj = LocalDateTime.now();
                                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                                String timeAndDate = myDateObj.format(myFormatObj);
                          
                                pw.println("Product Category : " + cgy);
                                pw.println("Price : " + answer);
                                pw.println("Time & Date : " + timeAndDate);
                                pw.println("===============================================");
                                pw.close();

                            } catch (Exception ex) {
                                System.out.print(ex);
                            }

                            JOptionPane.showMessageDialog(null, "Product Registration Successfully Completed.",
                                    "Product Registerd", JOptionPane.WARNING_MESSAGE);
                            frame.setVisible(false);
                            OUtlet log = new OUtlet();
                            log.frame.setVisible(true);
                        }
                    }
        });
        btnNewButton.setBackground(new Color(192, 192, 192));
        btnNewButton.setForeground(new Color(75, 0, 130));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnNewButton.setBounds(365, 257, 134, 38);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
                OUtlet log = new OUtlet();
                log.frame.setVisible(true);
        	}
        });
        btnBack.setForeground(new Color(75, 0, 130));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBackground(Color.LIGHT_GRAY);
        btnBack.setBounds(159, 257, 134, 38);
        frame.getContentPane().add(btnBack);
		
	}

}
