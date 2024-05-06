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

public class frutas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldFrutas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frutas frame = new frutas();
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
	public frutas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewSelectCerealesLabel = new JLabel("SELECCIONA ALIMENTO");
		lblNewSelectCerealesLabel.setBounds(10, 23, 162, 14);
		contentPane.add(lblNewSelectCerealesLabel);
		
		JComboBox comboBoxFrutas = new JComboBox();
		comboBoxFrutas.setModel(new DefaultComboBoxModel(new String[] {"Albaricoque", "Arándano", "Caqui", "Cerezas", "Chirimoya", "Ciruela", "Coco fresco", "Dátil", "Frambuesa", "Fresas", "Granada", "Grosella", "Grosella negra", "Higos", "Kiwi", "Litchi", "Mandarina", "Mango", "Manzana", "Manzana asada", "Melocotón", "Melocotón en conserva", "Melón", "Membrillo", "Membrillo dulce", "Moras", "Naranja", "Nectarina", "Níspero", "Papaya", "Paragüayo", "Pera", "Piña", "Piña en conserva", "Piña en su jugo", "Plátano", "Sandía", "Uva"}));
		comboBoxFrutas.setBounds(206, 19, 201, 22);
		contentPane.add(comboBoxFrutas);
		
		JLabel lblCantidadFrutasLabel = new JLabel("INTRODUCE CANTIDAD (GRS.)");
		lblCantidadFrutasLabel.setBounds(10, 74, 168, 14);
		contentPane.add(lblCantidadFrutasLabel);
		
		textFieldFrutas = new JTextField();
		textFieldFrutas.setColumns(10);
		textFieldFrutas.setBounds(206, 71, 86, 20);
		contentPane.add(textFieldFrutas);
		
		JButton btnNewButtonFrutas = new JButton("ENVIAR");
		btnNewButtonFrutas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonFrutas.setBounds(335, 70, 89, 23);
		contentPane.add(btnNewButtonFrutas);
	}

}
