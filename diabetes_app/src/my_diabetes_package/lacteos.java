package my_diabetes_package;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import diabetes_app.MoreOrCheckOut;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lacteos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneLacteos;
	private JTextField textFieldLacteoCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lacteos frame = new lacteos();
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
	public lacteos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneLacteos = new JPanel();
		contentPaneLacteos.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneLacteos);
		contentPaneLacteos.setLayout(null);
		
		JComboBox comboBoxLacteos = new JComboBox();
		comboBoxLacteos.setBounds(206, 11, 204, 20);
		comboBoxLacteos.setModel(new DefaultComboBoxModel(new String[] {"Flan", "Helado de crema", "Helado de hielo", "Helado sin azúcares añadidos", "Kéfir", "Leche condensada", "Leche desnatada", "Leche en polvo", "Leche entera", "Leche semidesnatada", "Nata líquida", "Natillas", "Petit Suisse", "Queso fresco", "Yogur desnatado, de sabores o fruta", "Yogur entero, de sabores o fruta", "Yogur líquido", "Yogur natural, entero o desnatado", "Yogur tipo Actimel", "Yogur tipo Actimel 0%"}));
		contentPaneLacteos.add(comboBoxLacteos);
		
		JLabel lblNewSelectLacteoLabel = new JLabel("SELECCIONA ALIMENTO");
		lblNewSelectLacteoLabel.setBounds(10, 17, 156, 14);
		contentPaneLacteos.add(lblNewSelectLacteoLabel);
		
		JLabel lblCantidadLacteoLabel = new JLabel("INTRODUCE CANTIDAD (GRS.)");
		lblCantidadLacteoLabel.setBounds(10, 65, 168, 14);
		contentPaneLacteos.add(lblCantidadLacteoLabel);
		
		textFieldLacteoCantidad = new JTextField();
		textFieldLacteoCantidad.setBounds(206, 62, 86, 20);
		contentPaneLacteos.add(textFieldLacteoCantidad);
		textFieldLacteoCantidad.setColumns(10);
		
		JButton btnNewButtonLacteos = new JButton("ENVIAR");
		btnNewButtonLacteos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lacteos lacteos = new lacteos();
				//lacteos.setVisible(false);
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonLacteos.setBounds(321, 61, 89, 23);
		contentPaneLacteos.add(btnNewButtonLacteos);
	}
}
