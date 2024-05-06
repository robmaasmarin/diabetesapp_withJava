package my_diabetes_package;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import diabetes_app.MoreOrCheckOut;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frutos_secos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneFrutosSecos;
	private JTextField textFieldFrutosSecos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frutos_secos frame = new frutos_secos();
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
	public frutos_secos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneFrutosSecos = new JPanel();
		contentPaneFrutosSecos.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneFrutosSecos);
		contentPaneFrutosSecos.setLayout(null);
		
		JLabel lblNewSelectFrutosSecosLabel = new JLabel("SELECCIONA ALIMENTO");
		lblNewSelectFrutosSecosLabel.setBounds(10, 25, 117, 14);
		contentPaneFrutosSecos.add(lblNewSelectFrutosSecosLabel);
		
		JComboBox comboBoxFrutosSecos = new JComboBox();
		comboBoxFrutosSecos.setModel(new DefaultComboBoxModel(new String[] {"Albaricoque seco", "Almendra", "Almendra tostada", "Avellana", "Cacahuete", "Castaña cruda", "Castaña tostada", "Ciruela pasa", "Dátil seco", "Higo seco", "Nuez", "Piñón", "Pipas", "Pistacho", "Sésamo", "Uvas pasas"}));
		comboBoxFrutosSecos.setBounds(197, 21, 187, 22);
		contentPaneFrutosSecos.add(comboBoxFrutosSecos);
		
		JLabel lblCantidadFrutosSecosLabel = new JLabel("INTRODUCE CANTIDAD (GRS.)");
		lblCantidadFrutosSecosLabel.setBounds(10, 75, 168, 14);
		contentPaneFrutosSecos.add(lblCantidadFrutosSecosLabel);
		
		textFieldFrutosSecos = new JTextField();
		textFieldFrutosSecos.setColumns(10);
		textFieldFrutosSecos.setBounds(206, 72, 86, 20);
		contentPaneFrutosSecos.add(textFieldFrutosSecos);
		
		JButton btnNewButtonFrutosSecos = new JButton("ENVIAR");
		btnNewButtonFrutosSecos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonFrutosSecos.setBounds(335, 71, 89, 23);
		contentPaneFrutosSecos.add(btnNewButtonFrutosSecos);
	}

}
