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

public class bebidas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bebidas frame = new bebidas();
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
	public bebidas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewSelectBebidasLabel = new JLabel("SELECCIONA BEBIDA");
		lblNewSelectBebidasLabel.setBounds(10, 23, 133, 14);
		contentPane.add(lblNewSelectBebidasLabel);
		
		JComboBox comboBoxBebidas = new JComboBox();
		comboBoxBebidas.setModel(new DefaultComboBoxModel(new String[] {"Bebida de arroz", "Bebida de avena", "Bebida de cacao", "Bebida de soja", "Bebida isotónica", "Bitter", "Cava seco o semiseco", "Cerveza", "Cerveza light", "Cerveza sin alcohol", "Horchata", "Horchata light", "Licor de melocotón", "Mosto", "Refresco cola (10% hidratos de carbono)", "Refresco sabores (4.5% hidratos carbono)", "Sangría", "Sidra", "Tónica", "Vermut", "Zumo de fruta sin azúcares añadidos", "Zumo de fruta, natural o comercial", "Zumo de tomate"}));
		comboBoxBebidas.setBounds(167, 19, 257, 22);
		contentPane.add(comboBoxBebidas);
		
		JLabel lblIntroduceCantidadcc = new JLabel("INTRODUCE CANTIDAD (CC.)");
		lblIntroduceCantidadcc.setBounds(10, 69, 168, 14);
		contentPane.add(lblIntroduceCantidadcc);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(206, 66, 86, 20);
		contentPane.add(textField);
		
		JButton btnNewButtonCereales = new JButton("ENVIAR");
		btnNewButtonCereales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonCereales.setBounds(335, 65, 89, 23);
		contentPane.add(btnNewButtonCereales);
	}
}
