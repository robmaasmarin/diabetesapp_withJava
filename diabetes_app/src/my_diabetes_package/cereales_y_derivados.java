package my_diabetes_package;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import diabetes_app.CerealsInsuline;
import diabetes_app.MoreOrCheckOut;
import diabetes_app.newConnectionTest;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class cereales_y_derivados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneCereales;
	public JTextField textFieldCereales;
	
	public static String gramosCereales;
	public static String valueSelected;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cereales_y_derivados frame = new cereales_y_derivados();
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
	public cereales_y_derivados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneCereales = new JPanel();
		contentPaneCereales.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneCereales);
		contentPaneCereales.setLayout(null);
		
		JComboBox comboBoxCereales = new JComboBox();
		comboBoxCereales.setModel(new DefaultComboBoxModel(new String[] {"Altramuz", "Arroz blanco crudo", "Arroz blanco hervido", "Arroz hinchado para desayuno", "Arroz integral crudo", "Avena cruda", "Avena hervida", "Boniato", "Cebada cruda", "Cebada hervida", "Centeno crudo", "Centeno hervido", "Cereales desayuno (trigo)", "Cereales desayuno ricos en fibra (>10%)", "Cereales tipo muesli", "Cuscús cocido", "Cuscús crudo", "Fideos de arroz hervidos", "Fideos de soja hervidos", "Galleta sin azúcar", "Galleta tipo digestiva", "Galleta tipo María", "Galleta tipo Príncipe", "Garbanzo crudo", "Garbanzo en conserva", "Garbanzo hervido", "Gofio", "Guisantes congelados, frescos, de lata", "Harina de avena", "Harina de cebada o centeno", "Harina de maíz", "Harina de soja", "Harina de trigo", "Hojaldre crudo", "Hojaldre horneado", "Hummus", "Judías blancas crudas", "Judías blancas en conserva", "Judías blancas hervidas", "Legumbres en conserva", "Lentejas en conserva", "Lentejas en crudo", "Lentejas hervidas", "Maíz en lata", "Maíz en lata sin azúcares añadidos", "Maíz tostado", "Mijo cocido", "Mijo crudo", "Pan blanco de trigo", "Pan de centeno", "Pan de hamburguesa o Frankfurt", "Pan de molde", "Pan integral", "Pan rallado", "Pan tostado", "Pasta al huevo, cruda", "Pasta cruda", "Pasta fresca rellena", "Pasta hervida", "Pasta sin gluten", "Patata al horno o asada", "Patata cruda", "Patata hervida", "Patatas chips", "Patatas fritas", "Puré de patatas elaborado con leche", "Puré de patatas en copos", "Quinoa cruda", "Quinoa hervida", "Sémola de trigo cruda", "Sémola de trigo hervida", "Soja seca cruda", "Soja seca hervida", "Sushi", "Tapioca cruda", "Tapioca hervida", "Trigo sarraceno crudo", "Trigo sarraceno hervido", "Trigo tierno crudo", "Trigo tierno hervido", "Yuca cruda", "Yuca hervida"}));
		comboBoxCereales.setBounds(152, 19, 272, 22);
		contentPaneCereales.add(comboBoxCereales);
		
		JLabel lblNewSelectCerealesLabel = new JLabel("SELECCIONA ALIMENTO");
		lblNewSelectCerealesLabel.setBounds(10, 23, 156, 14);
		contentPaneCereales.add(lblNewSelectCerealesLabel);
		
		JLabel lblCantidadCerealesLabel = new JLabel("INTRODUCE CANTIDAD (GRS.)");
		lblCantidadCerealesLabel.setBounds(10, 72, 168, 14);
		contentPaneCereales.add(lblCantidadCerealesLabel);
		
		textFieldCereales = new JTextField();
		textFieldCereales.setColumns(10);
		textFieldCereales.setBounds(206, 69, 86, 20);
		contentPaneCereales.add(textFieldCereales);
		
		
		JButton btnNewButtonCereales = new JButton("ENVIAR");
		btnNewButtonCereales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// imprimimos cantidad introducida
				gramosCereales = textFieldCereales.getText();
				System.out.println(gramosCereales);
				
				
				//VALOR SELECCIONADO EN COMBOBOX
				valueSelected = comboBoxCereales.getSelectedItem().toString();
				System.out.println("Valor del combobox: " +valueSelected);
				
				CerealsInsuline.checkCelIn();
				//System.out.println(newConnectionTest.mycounter);
				
				//INSTANCIAMOS LA CLASE MoreOrCheckOut Y LLAMAMOS AL MÉTODO check
				MoreOrCheckOut MoreOrCheckOut = new MoreOrCheckOut();
				MoreOrCheckOut.check();
			}
		});
		btnNewButtonCereales.setBounds(335, 68, 89, 23);
		contentPaneCereales.add(btnNewButtonCereales);
	}
}
