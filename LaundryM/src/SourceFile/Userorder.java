import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Userorder {

	JFrame frame;
	private JTextField textField_1;
    private JTable table;
    

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userorder window = new Userorder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Userorder() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Laundry Category");
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(10, 36, 182, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		String[] secQsn = { "Choose Laundry Category....","Men's Shirt","Men's Pant","Men's Coat","Ledis Top's","Ledis Pajama","Sharee","T-Shirt","Bedshit","Blanket",""};
        @SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox Category = new JComboBox(secQsn);
        Category.setBounds(10, 86, 250, 38);       
        Category.setSelectedIndex(0);
        Category.setFont(new Font("Tahoma", Font.BOLD, 15));
        Category.setBorder(new LineBorder(new Color(75, 0, 130), 3, true));
        Category.setForeground(new Color(75, 0, 130));
        Category.setBackground(new Color(192, 192, 192));
        frame.getContentPane().add(Category);
        
        JLabel lblNewLabel_2 = new JLabel("Quantity");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBackground(new Color(192, 192, 192));
        lblNewLabel_2.setForeground(new Color(75, 0, 130));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2.setBounds(301, 36, 95, 27);
        frame.getContentPane().add(lblNewLabel_2);
        
        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setBackground(new Color(192, 192, 192));
        textField_1.setForeground(new Color(75, 0, 130));
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_1.setBounds(311, 87, 96, 38);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 154, 642, 229);
        frame.getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setFont(new Font("Tahoma", Font.BOLD, 14));
        table.setForeground(new Color(75, 0, 130));
        table.setBackground(new Color(192, 192, 192));
        DefaultTableModel model = new DefaultTableModel();
        Object [] column = {"Category","Quantity","Unit Price","Total Amount"};
        final Object [] row = new Object[4];
        model.setColumnIdentifiers(column);
        table.setModel(model);
        scrollPane.setViewportView(table);
        
        
        JButton btnNewButton = new JButton("+Add to Cart");
        
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String file = "order_data.txt";
        		String answer = textField_1.getText();
        		String cgy = String.valueOf(Category.getSelectedItem());
        		String answer2 = textField_1.getText();
        		int ans = Integer.parseInt(answer2); 
        		int a = 50*ans;
        		String total = String.valueOf(a);
        		String cgy2 = String.valueOf(Category.getSelectedItem());
        		
        		if (answer.isEmpty() || ((Category.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }  
                else {
                    try {
                        File file2 = new File("usertable_data.txt");
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file2, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                        String timeAndDate = myDateObj.format(myFormatObj);

                        pw.println("Category : " + cgy2);
                        pw.println("Quantity : " + answer2);                                                     
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }
            	}
        		try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    int totalLines = 0;
                    while (reader.readLine() != null)
                        totalLines++;
                    reader.close();

                    for (int i = 0; i < totalLines; i++) {
                        String line = Files.readAllLines(Paths.get(file)).get(i);
                        String x = line.substring(0, 7);
                        String cat = Files.readAllLines(Paths.get(file)).get((i)).substring(19);
                        String cat1 = Files.readAllLines(Paths.get(file)).get((i+4)).substring(19);
                        String cat2 = Files.readAllLines(Paths.get(file)).get((i+8)).substring(19);
                        String cat3 = Files.readAllLines(Paths.get(file)).get((i+12)).substring(19);
                        String cat4 = Files.readAllLines(Paths.get(file)).get((i+16)).substring(19);
                        String cat5 = Files.readAllLines(Paths.get(file)).get((i+20)).substring(19);
                        String cat6 = Files.readAllLines(Paths.get(file)).get((i+24)).substring(19);
                		String price = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(7);
                		//int pri = Integer.parseInt(price);
                		String price1 = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(7);
                		String price2 = Files.readAllLines(Paths.get(file)).get((i + 9)).substring(7);
                		String price3 = Files.readAllLines(Paths.get(file)).get((i + 13)).substring(7);
                		String price4 = Files.readAllLines(Paths.get(file)).get((i + 17)).substring(7);
                		String price5 = Files.readAllLines(Paths.get(file)).get((i + 21)).substring(7);
                		String price6 = Files.readAllLines(Paths.get(file)).get((i + 25)).substring(7);
                		//String total = String.valueOf(a);//Integer.parseInt(answer) * Integer.parseInt(price));
                        if (x.equals("Product")) 
                        {
                        	row[0]=cgy;
                    		row[1]=answer;
                    		if(cgy.equals(cat)) 
                    		{
                    			row[2] = price;
                    			row[3] =total;
                    		}
                    		else if(cgy.equals(cat1)) 
                    		{
                    			row[2] = price1;
                    			row[3] =total;
                    		}
                    		else if(cgy.equals(cat2)) 
                    		{
                    			row[2] = price2;
                    			row[3] =total;
                    		}
                    		else if(cgy.equals(cat3)) 
                    		{
                    			row[2] = price3;
                    			row[3] =total;
                    		}
                    		else if(cgy.equals(cat4)) 
                    		{
                    			row[2] = price4;
                    			row[3] =total;
                    		}
                    		else if(cgy.equals(cat5)) 
                    		{
                    			row[2] = price5;
                    			row[3] =total;
                    		}
                    		else if(cgy.equals(cat6)) 
                    		{
                    			row[2] = price6;
                    			row[3] =total;
                    		}                   		
                    		model.addRow(row);
                            
                        }
                    }

                } catch (Exception ex) {
                    return;
                }  
        		
                    
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.setForeground(new Color(75, 0, 130));
        btnNewButton.setBackground(new Color(192, 192, 192));
        btnNewButton.setBounds(454, 58, 182, 32);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Make Payment");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String answer = textField_1.getText();  
        		int ans = Integer.parseInt(answer); 
        		int a = 50*ans;
                    if (answer.isEmpty() || ((Category.getSelectedIndex()) == 0)) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }  
                    else {
                    	JOptionPane.showMessageDialog(null, "Total Cost : $" + a, "Make Payment!",
                                JOptionPane.INFORMATION_MESSAGE);
                        frame.setVisible(false);
                    	Payment log = new Payment();
                    	log.frame.setVisible(true);
                	}
        	    }
            });        		
        btnNewButton_1.setForeground(new Color(75, 0, 130));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.setBackground(new Color(192, 192, 192));
        btnNewButton_1.setBounds(245, 396, 151, 33);
        frame.getContentPane().add(btnNewButton_1);
        
        
   }
}
