import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OUtlet {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OUtlet window = new OUtlet();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public OUtlet() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 676, 476);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(75, 0, 130));
		menuBar.setBackground(new Color(192, 192, 192));
		menuBar.setBounds(0, 0, 662, 32);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Product Reports");
		mnNewMenu.setForeground(new Color(75, 0, 130));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Product Register");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                ProductReg log = new ProductReg();
                log.frame.setVisible(true);
			}
		});
		mntmNewMenuItem.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Product Reports");
		mntmNewMenuItem_1.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("PDS");
		mnNewMenu_1.setForeground(new Color(75, 0, 130));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Job Order Register");
		mntmNewMenuItem_2.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Order List");
		mntmNewMenuItem_3.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Order Delivery");
		mntmNewMenuItem_4.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_5 = new JMenu("Reports");
		mnNewMenu_5.setForeground(new Color(75, 0, 130));
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Order List(All)");
		mntmNewMenuItem_5.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Un Deliverd Order List");
		mntmNewMenuItem_6.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Delivery List");
		mntmNewMenuItem_7.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Job Order Reports");
		mntmNewMenuItem_8.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Delivery History");
		mntmNewMenuItem_9.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_2 = new JMenu("Customer");
		mnNewMenu_2.setForeground(new Color(75, 0, 130));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Customer Payment Register");
		mntmNewMenuItem_10.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Customer Bill Register");
		mntmNewMenuItem_11.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_6 = new JMenu("Reports");
		mnNewMenu_6.setForeground(new Color(75, 0, 130));
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Customer Account Reports");
		mntmNewMenuItem_12.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_12.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_6.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Customer Due Reports");
		mntmNewMenuItem_13.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_13.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_6.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Customer Payment Reports");
		mntmNewMenuItem_14.setForeground(new Color(75, 0, 130));
		mntmNewMenuItem_14.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_6.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_3 = new JMenu("Control Panel");
		mnNewMenu_3.setForeground(new Color(75, 0, 130));
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Tools");
		mnNewMenu_4.setForeground(new Color(75, 0, 130));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(266, 62, 83, 59);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setToolTipText("ItemMaster");
		btnNewButton.setIcon(new ImageIcon("trolley-cart.png"));
		btnNewButton.setForeground(new Color(75, 0, 130));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("Order Report ");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                Orderreport2 log = new Orderreport2();
                log.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(400, 223, 83, 59);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("report.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setToolTipText("Order Process");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(29, 109, 83, 59);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon("process (1)color.png"));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setToolTipText("Delivery List");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(29, 328, 83, 59);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon("packing-list.png"));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                ProductReg log = new ProductReg();
                log.frame.setVisible(true);
			}
		});
		btnNewButton_4.setToolTipText("Order Register");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(147, 223, 83, 59);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.setIcon(new ImageIcon("checklist.png"));
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Paymentreport pay = new Paymentreport();
				pay.frame.setVisible(true);
			}
		});
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.setToolTipText("Customer Bills");
		btnNewButton_5.setBounds(522, 109, 83, 59);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.setIcon(new ImageIcon("invoicebill.png"));
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
                Admin log = new Admin();
                log.frame.setVisible(true);
			}
		});
		btnNewButton_6.setToolTipText("LogOut");
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.setBounds(522, 328, 83, 59);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.setIcon(new ImageIcon("logout (1)color.png"));
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                Itemmaster itm = new Itemmaster();
                itm.frame.setVisible(true);
            }
        });
	}
}
