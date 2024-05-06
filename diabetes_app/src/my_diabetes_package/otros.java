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

public class otros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneOtros;
	private JTextField textFieldOtros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otros frame = new otros();
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
	public otros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneOtros = new JPanel();
		contentPaneOtros.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneOtros);
		contentPaneOtros.setLayout(null);
		
		JLabel lblNewSelectOtrosLabel = new JLabel("SELECCIONA ALIMENTO");
		lblNewSelectOtrosLabel.setBounds(10, 31, 151, 14);
		contentPaneOtros.add(lblNewSelectOtrosLabel);
		
		JComboBox comboBoxOtros = new JComboBox();
		comboBoxOtros.setModel(new DefaultComboBoxModel(new String[] {"Arepa", "Azúcar blanco", "Azúcar moreno", "Barrita energética(de cereales)", "Bizcocho", "Bollería en general", "Cacao en polvo", "Cacao en polvo sin azúcar", "Calamares a la romana", "Canelones con bechamel", "Caramelo", "Carne rebozada", "Chocolate > 90% cacao", "Chocolate blanco o con leche", "Chocolate negro", "Churros", "Crema de cacahuete", "Crema de cacao", "Crema pastelera", "Crepe", "Croquetas", "Cruasán", "Döner kevab", "Donut", "Durum", "Empanadilla de carne", "Ensaimada", "Ensaladilla rusa", "Fajita, tortilla mexicana", "Fructosa (edulcorante)", "Gazpacho comercial", "Gelatina 0%", "Gelatina comercial", "Glucosa (líquida o en pastillas)", "Golosinas", "Ketchup", "Lasaña", "Levadura", "Magdalena", "Mazapán", "Merengue", "Mermelada", "Mermelada light", "Miel", "Palomitas", "Pastel de chocolate", "Pastel de crema", "Pastel o tarta de manzana", "Pizza", "Regaliz", "Rollito de primavera", "Salsa barbacoa", "Salsa bechamel", "Salsa boloñesa", "Salsa de soja", "Salsa de tomate comercial", "Seitán", "Surimi(palitos de cangrejo)", "Tofu", "Tortilla de patatas", "Turrón tipo Alicante", "Turrón tipo chocolate", "Turrón tipo Jijona", "Vinagre tipo Módena"}));
		comboBoxOtros.setBounds(208, 27, 193, 22);
		contentPaneOtros.add(comboBoxOtros);
		
		JLabel lblCantidadOtrosLabel = new JLabel("INTRODUCE CANTIDAD (GRS.)");
		lblCantidadOtrosLabel.setBounds(10, 83, 168, 14);
		contentPaneOtros.add(lblCantidadOtrosLabel);
		
		textFieldOtros = new JTextField();
		textFieldOtros.setColumns(10);
		textFieldOtros.setBounds(206, 80, 86, 20);
		contentPaneOtros.add(textFieldOtros);
		
		JButton btnNewButtonOtros = new JButton("ENVIAR");
		btnNewButtonOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonOtros.setBounds(335, 79, 89, 23);
		contentPaneOtros.add(btnNewButtonOtros);
	}

}
