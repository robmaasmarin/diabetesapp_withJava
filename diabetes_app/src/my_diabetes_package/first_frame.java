package my_diabetes_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class first_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String sugarInBlood =null;
	static int myweight;
	static int quantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first_frame frame = new first_frame();
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
	public first_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox.setBounds(239, 17, 106, 22);
		contentPane.add(comboBox);
		
		JLabel lblGenderLabel = new JLabel("SELECCIONA GÉNERO");
		lblGenderLabel.setBounds(10, 29, 141, 14);
		contentPane.add(lblGenderLabel);
		
		JLabel lblWeightLabel = new JLabel("INTRODUCE TU PESO");
		lblWeightLabel.setBounds(10, 65, 141, 14);
		contentPane.add(lblWeightLabel);
		
		JTextArea textAreaWeight = new JTextArea();
		textAreaWeight.setBounds(239, 50, 71, 22);
		contentPane.add(textAreaWeight);
		
		JLabel lblFactorLabel = new JLabel("FACTOR DE SENSIBILIDAD");
		lblFactorLabel.setBounds(10, 100, 195, 14);
		contentPane.add(lblFactorLabel);
		
		JTextArea textArea_SENS2 = new JTextArea();
		textArea_SENS2.setBounds(293, 92, 34, 22);
		contentPane.add(textArea_SENS2);
		
		JTextArea textArea_SENS1 = new JTextArea();
		textArea_SENS1.setBounds(239, 92, 34, 22);
		contentPane.add(textArea_SENS1);
		
		JLabel lblNewLabelDOTS = new JLabel(":");
		lblNewLabelDOTS.setBounds(283, 97, 24, 14);
		contentPane.add(lblNewLabelDOTS);
		
		JLabel lblSugarLabel = new JLabel("INTRODUCIR AZÚCAR EN SANGRE");
		lblSugarLabel.setBounds(10, 141, 214, 14);
		contentPane.add(lblSugarLabel);
		
		JTextArea textAreaSugarInBlood = new JTextArea();
		textAreaSugarInBlood.setBounds(239, 136, 77, 22);
		contentPane.add(textAreaSugarInBlood);
		
		
		JButton btnNewSendButton = new JButton("ENVIAR");
		btnNewSendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_frame first = new first_frame();
				// DEFINIMOS AZÚCAR EN SANGRE COM LA INFO QUE INTRODUCIMOS EN EL CAMPO textAreaSugarInBlood
				sugarInBlood =  textAreaSugarInBlood.getText();
				System.out.println(sugarInBlood);
				// DEFINIMOS EL PESO COM LA INFO QUE INTRODUCIMOS EN EL CAMPO textAreaWeight
				myweight = Integer.parseInt(textAreaWeight.getText());
				System.out.println(myweight);
				
				first.setVisible(false);
				
				tipo_alimento_frame tipo = new tipo_alimento_frame();
				tipo.setVisible(true);
				
			}
		});
		btnNewSendButton.setBounds(159, 191, 89, 23);
		contentPane.add(btnNewSendButton);
	}
}
