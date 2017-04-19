import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Please Select an Option");
		title.setFont(new Font("Rockwell", Font.PLAIN, 16));
		title.setBounds(151, 11, 196, 20);
		frame.getContentPane().add(title);
		
		JButton cReport = new JButton("Create Report");
		cReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new cReport();
			}
		});
		cReport.setFont(new Font("Rockwell", Font.PLAIN, 12));
		cReport.setBounds(293, 42, 145, 23);
		frame.getContentPane().add(cReport);
		
		JButton vReport = new JButton("View Report");
		vReport.setFont(new Font("Rockwell", Font.PLAIN, 12));
		vReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		vReport.setBounds(293, 116, 145, 23);
		frame.getContentPane().add(vReport);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		search.setFont(new Font("Rockwell", Font.PLAIN, 12));
		search.setBounds(293, 189, 145, 23);
		frame.getContentPane().add(search);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL-USER\\workspace\\E-log\\src\\Screenshot_1.png"));
		lblNewLabel.setBounds(37, 42, 216, 121);
		frame.getContentPane().add(lblNewLabel);
		
		input = new JTextField();
		input.setFont(new Font("Rockwell", Font.PLAIN, 12));
		input.setBounds(37, 191, 216, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		try {
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
