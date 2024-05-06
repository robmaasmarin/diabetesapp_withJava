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

public class hortalizas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneHortalizas;
	private JTextField textFieldHortalizas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hortalizas frame = new hortalizas();
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
	public hortalizas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneHortalizas = new JPanel();
		contentPaneHortalizas.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneHortalizas);
		contentPaneHortalizas.setLayout(null);
		
		JLabel lblNewSelectHortalizasLabel = new JLabel("SELECCIONA ALIMENTO");
		lblNewSelectHortalizasLabel.setBounds(10, 25, 164, 14);
		contentPaneHortalizas.add(lblNewSelectHortalizasLabel);
		
		JComboBox comboBoxHortalizas = new JComboBox();
		comboBoxHortalizas.setModel(new DefaultComboBoxModel(new String[] {"Ajo", "Alcachofa", "Algas", "Apio", "Apio-nabo", "Berenjena", "Borraja", "Brócoli", "Calabacín", "Calabaza", "Cardo", "Cebolla", "Cebolla frita en aros", "Col de bruselas", "Edamame", "Endibia", "Espárrago blanco en conserva", "Espárrago verde", "Judía verde", "Lechuga", "Nabo", "Palmitos", "Pepino", "Pimiento rojo/verde", "Puerro", "Rábano", "Remolacha", "Repollo", "Setas", "Soja en brotes", "Tomate", "Zanahoria", "Zanahoria en conserva", "Zanahoria hervida"}));
		comboBoxHortalizas.setBounds(208, 25, 216, 22);
		contentPaneHortalizas.add(comboBoxHortalizas);
		
		JLabel lblCantidadHortalizasLabel = new JLabel("INTRODUCE CANTIDAD (GRS.)");
		lblCantidadHortalizasLabel.setBounds(10, 88, 168, 14);
		contentPaneHortalizas.add(lblCantidadHortalizasLabel);
		
		textFieldHortalizas = new JTextField();
		textFieldHortalizas.setColumns(10);
		textFieldHortalizas.setBounds(206, 85, 86, 20);
		contentPaneHortalizas.add(textFieldHortalizas);
		
		JButton btnNewButtonHortalizas = new JButton("ENVIAR");
		btnNewButtonHortalizas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonHortalizas.setBounds(335, 84, 89, 23);
		contentPaneHortalizas.add(btnNewButtonHortalizas);
	}

}
