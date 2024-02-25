import java.awt.EventQueue;
import javax.swing.JFrame;

public class Orderlist {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orderlist window = new Orderlist();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Orderlist() {
		initialize();
	}

	private void initialize() {
		frame =  new JFrame();
		frame.setBounds(100, 100, 676, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
