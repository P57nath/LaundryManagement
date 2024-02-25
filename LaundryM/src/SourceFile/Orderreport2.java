import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Orderreport2 {

	JFrame frame;
	private String[] column = { "Category", "Quantity", "Date and Time" };
    private String[] rows = new String[3];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orderreport2 window = new Orderreport2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Orderreport2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100,678, 478);
		frame.setLocationRelativeTo(null);
        frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
        JTable table = new JTable();
        table.setForeground(new Color(75, 0, 130));
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(new Font("Tahoma", Font.BOLD, 14));
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(new Color(192, 192, 192));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(170);
        table.getColumnModel().getColumn(1).setPreferredWidth(170);
        table.getColumnModel().getColumn(2).setPreferredWidth(250);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(43, 30, 578, 312);
        scroll.setBackground(new Color(192, 192, 192));
        frame.getContentPane().add(scroll);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
                OUtlet log = new OUtlet();
                log.frame.setVisible(true);
        	}
        });
        btnNewButton.setForeground(new Color(75, 0, 130));
        btnNewButton.setBackground(new Color(192, 192, 192));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.setBounds(248, 375, 109, 35);
        frame.getContentPane().add(btnNewButton);

        String file = "usertable_data.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 8);
                if (x.equals("Category")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(10);
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(10); 
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(14); 
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }		
		
	}
}
