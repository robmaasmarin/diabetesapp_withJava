package diabetes_app;

import javax.swing.JOptionPane;

import my_diabetes_package.summary;
import my_diabetes_package.tipo_alimento_frame;

public class MoreOrCheckOut {
	static int input;
	
	public void check() {
	
		input = JOptionPane.showOptionDialog(null, 
	            "Añadir otro alimento?", "Elige una opción...",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
	            null,
	            new Object[] { "Aceptar", "Cancelar y checkout" },
	            null);
		
		 if(input == 0) {
	            System.out.println("YES");
	            tipo_alimento_frame tipo_alimento_frame = new tipo_alimento_frame();
				tipo_alimento_frame.setVisible(true);
				//SI LA RESPUESTA ES SÍ VOLVEMOS A LA PANTALLA TIPO_ALIMENTO
	        }
	        else {
	            //System.out.println("NO");
	            summary summary = new summary();
	            summary.setVisible(true);
	            //IMPRIMIMOS EL CONTADOR TOTAL DE CARBOHIDRATOS CUANDO YA NO QUEREMOS SELECCIONAR MÁS ALIMENTOS
	            System.out.println(newConnectionTest.mycounter);
	            //EN CASO CONTRARIO AVANZAMOS A LA PANTALLA FINAL EN LA QUE SE MUESTRA EL RESUMEN
	        }
	}
}
