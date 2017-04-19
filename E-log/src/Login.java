import java.awt.EventQueue;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JTextField userName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Stencil", Font.PLAIN, 13));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel uName = new JLabel("Username");
		uName.setFont(new Font("Rockwell", Font.PLAIN, 13));
		uName.setBounds(72, 115, 75, 14);
		frame.getContentPane().add(uName);

		JLabel pass = new JLabel("Password");
		pass.setFont(new Font("Rockwell", Font.PLAIN, 13));
		pass.setBounds(72, 165, 75, 14);
		frame.getContentPane().add(pass);

		userName = new JTextField();
		userName.setBounds(199, 112, 149, 20);
		frame.getContentPane().add(userName);
		userName.setColumns(10);

		JButton submit = new JButton("Login");
		submit.setFont(new Font("Rockwell", Font.PLAIN, 13));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = userName.getText();
				String pass = passwordField.getText();

				
				 try { 
					 File acc = new File("src/access.txt"); 
					 Scanner fileScan =	 new Scanner(acc);
					 boolean found = false;
					 while (fileScan.hasNext() && found == false) { 
						 String[] data = fileScan.nextLine().split(","); 
						 if (name.equals(data[0]) && pass.equals(data[1])) {
							 JOptionPane.showMessageDialog(frame, "you have successfully logged in!");
							 found = true;
							 new Main();
							 }
					 }
					 if (found == false) {
						 JOptionPane.showMessageDialog(frame, "Invalid credentials!, please try again.");
						 userName.setText("");
						 passwordField.setText("");
						 }
				 }
				 catch(Exception e)
				 {
					 
				 
				 }
			}
		});
		submit.setBounds(169, 205, 89, 23);
		frame.getContentPane().add(submit);

		JLabel lblWelcomeToThe = new JLabel("Welcome to the E-Log System");
		lblWelcomeToThe.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 15));
		lblWelcomeToThe.setBounds(107, 53, 228, 14);
		frame.getContentPane().add(lblWelcomeToThe);

		JLabel lblPleaseLoginTo = new JLabel("Please login to continue");
		lblPleaseLoginTo.setFont(new Font("Rockwell", Font.ITALIC, 11));
		lblPleaseLoginTo.setBounds(146, 78, 130, 14);
		frame.getContentPane().add(lblPleaseLoginTo);

		passwordField = new JPasswordField();
		passwordField.setBounds(199, 163, 149, 20);
		frame.getContentPane().add(passwordField);

		JLabel eLabel = new JLabel("");
		eLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		eLabel.setForeground(Color.RED);
		eLabel.setBounds(58, 28, 315, 14);
		frame.getContentPane().add(eLabel);
	}
}
