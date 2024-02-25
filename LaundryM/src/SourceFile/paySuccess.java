import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paySuccess {
	
   JFrame frame;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	paySuccess window = new paySuccess();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public paySuccess() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 766, 373);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("green-round-check-tick-mark-icon-free-11642102801wvxzxfjqmg.jpg"));
        lblNewLabel.setBounds(328, 76, 94, 89);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Your payment was successful");
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
        lblNewLabel_1.setBounds(207, 175, 456, 31);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Thank you for your payment. We will ");
        lblNewLabel_2.setForeground(Color.BLACK);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(242, 210, 366, 25);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("be in contact with more details shortly");
        lblNewLabel_3.setForeground(Color.BLACK);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_3.setBounds(242, 233, 323, 17);
        frame.getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Thankyou :)");
        lblNewLabel_4.setBackground(new Color(75, 0, 130));
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblNewLabel_4.setBounds(274, 10, 259, 39);
        frame.getContentPane().add(lblNewLabel_4);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(75, 0, 130));
        panel.setBounds(0, 0, 752, 62);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton btnNewButton_8 = new JButton("");
        btnNewButton_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Admin ad = new Admin();
        		ad.frame.setVisible(true);
        	}
        });
        btnNewButton_8.setIcon(new ImageIcon("logout.png"));
        btnNewButton_8.setBounds(697, 22, 33, 30);
        btnNewButton_8.setToolTipText("Back");
        btnNewButton_8.setForeground(new Color(75, 0, 130));
        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_8.setBackground(new Color(75, 0, 130));
        panel.add(btnNewButton_8);
    }
}
