package my_diabetes_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tipo_alimento_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneTipoAlimento;
	private JButton btnNewLacteosButton;
	private JButton btnNewCerealesButton;
	private JButton btnNewFruitsButton;
	private JButton btnNewHortalizasButton;
	private JButton btnNewFrutosSecosButton;
	private JButton btnNewBebidasButton;
	private JButton btnNewOtrosButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tipo_alimento_frame frame = new tipo_alimento_frame();
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
	public tipo_alimento_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneTipoAlimento = new JPanel();
		contentPaneTipoAlimento.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPaneTipoAlimento);
		contentPaneTipoAlimento.setLayout(null);
		
		JLabel lbltipo_alimentoLabel = new JLabel("TIPO DE ALIMENTO");
		lbltipo_alimentoLabel.setBounds(167, 22, 267, 14);
		contentPaneTipoAlimento.add(lbltipo_alimentoLabel);
		
		btnNewLacteosButton = new JButton("LÁCTEOS");
		btnNewLacteosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				lacteos lacteos = new lacteos();
				lacteos.setVisible(true);
			}
		});
		btnNewLacteosButton.setBounds(10, 73, 193, 23);
		contentPaneTipoAlimento.add(btnNewLacteosButton);
		
		btnNewCerealesButton = new JButton("CEREALES Y DERIVADOS");
		btnNewCerealesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				cereales_y_derivados cereales = new cereales_y_derivados();
				cereales.setVisible(true);
			}
			
		});
		btnNewCerealesButton.setBounds(231, 73, 193, 23);
		contentPaneTipoAlimento.add(btnNewCerealesButton);
		
		btnNewFruitsButton = new JButton("FRUTAS");
		btnNewFruitsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CERRAMOS EL FRAME ACTUAL Y ABRIMOS EL CORRESPONDIENTE AL HACER CLICK
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				// PARA ELLO INSTANCIAMOS LA CLASE CORRESPONDIENTE
				frutas frutas = new frutas();
				frutas.setVisible(true);
			}
		});
		btnNewFruitsButton.setBounds(10, 121, 193, 23);
		contentPaneTipoAlimento.add(btnNewFruitsButton);
		
		btnNewHortalizasButton = new JButton("HORTALIZAS");
		btnNewHortalizasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CERRAMOS EL FRAME ACTUAL Y ABRIMOS EL CORRESPONDIENTE AL HACER CLICK
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				// PARA ELLO INSTANCIAMOS LA CLASE CORRESPONDIENTE
				hortalizas hortalizas = new hortalizas();
				hortalizas.setVisible(true);
			}
		});
		btnNewHortalizasButton.setBounds(231, 121, 193, 23);
		contentPaneTipoAlimento.add(btnNewHortalizasButton);
		
		btnNewFrutosSecosButton = new JButton("FRUTOS SECOS");
		btnNewFrutosSecosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				frutos_secos frutos_secos = new frutos_secos();
				frutos_secos.setVisible(true);
			}
		});
		btnNewFrutosSecosButton.setBounds(10, 166, 193, 23);
		contentPaneTipoAlimento.add(btnNewFrutosSecosButton);
		
		btnNewBebidasButton = new JButton("BEBIDAS");
		btnNewBebidasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				bebidas bebidas = new bebidas();
				bebidas.setVisible(true);
			}
		});
		btnNewBebidasButton.setBounds(231, 166, 193, 23);
		contentPaneTipoAlimento.add(btnNewBebidasButton);
		
		btnNewOtrosButton = new JButton("OTROS");
		btnNewOtrosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(false);
				otros otros = new otros();
				otros.setVisible(true);
			}
		});
		btnNewOtrosButton.setBounds(128, 214, 193, 23);
		contentPaneTipoAlimento.add(btnNewOtrosButton);
	}
}
