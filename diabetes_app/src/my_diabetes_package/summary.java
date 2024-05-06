package my_diabetes_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class summary extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneSummary;
	private JTextField textFieldSummary;
	private JTextField textFieldSummary2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					summary frame = new summary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public summary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneSummary = new JPanel();
		contentPaneSummary.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneSummary);
		contentPaneSummary.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUMMARY");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(181, 30, 105, 14);
		contentPaneSummary.add(lblNewLabel);
		
		textFieldSummary = new JTextField();
		textFieldSummary.setBounds(115, 72, 199, 20);
		contentPaneSummary.add(textFieldSummary);
		
		textFieldSummary.setColumns(10);
		textFieldSummary.setText(first_frame.sugarInBlood);
		
		textFieldSummary2 = new JTextField();
		textFieldSummary2.setBounds(167, 157, 119, 20);
		contentPaneSummary.add(textFieldSummary2);
		textFieldSummary2.setColumns(10);
		textFieldSummary2.setText(Integer.toString(first_frame.myweight));
	}

}
