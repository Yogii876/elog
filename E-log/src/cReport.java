import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class cReport {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cReport window = new cReport();
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
	public cReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(59dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(100dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(33dlu;default):grow"),}));
		
		JLabel lblFirstName = new JLabel("First Name");
		frame.getContentPane().add(lblFirstName, "4, 2");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "14, 2, fill, default");
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		frame.getContentPane().add(lblLastName, "4, 4");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1, "14, 4, fill, default");
		
		JLabel lblMiddleInitial = new JLabel("Middle Initial");
		frame.getContentPane().add(lblMiddleInitial, "4, 6");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2, "14, 6, fill, default");
		
		JLabel lblIdNumber = new JLabel("ID Number");
		frame.getContentPane().add(lblIdNumber, "4, 8, left, bottom");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3, "14, 8, fill, default");
		
		JLabel lblIdType = new JLabel("ID Type");
		frame.getContentPane().add(lblIdType, "4, 10");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4, "14, 10, fill, default");
		
		JLabel lblArea = new JLabel("Area");
		frame.getContentPane().add(lblArea, "4, 12");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5, "14, 12, fill, default");
		
		JLabel lblParish = new JLabel("Parish");
		frame.getContentPane().add(lblParish, "4, 14");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6, "14, 14, fill, default");
		
		JLabel lblCommunity = new JLabel("Community");
		frame.getContentPane().add(lblCommunity, "4, 16");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7, "14, 16, fill, default");
		
		JLabel lblStreet = new JLabel("Street");
		frame.getContentPane().add(lblStreet, "4, 18");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8, "14, 18, fill, default");
		
		JLabel lblStory = new JLabel("Story");
		frame.getContentPane().add(lblStory, "4, 20");
		
		JTextArea textArea = new JTextArea();
		frame.getContentPane().add(textArea, "14, 20, fill, fill");
	}

}
