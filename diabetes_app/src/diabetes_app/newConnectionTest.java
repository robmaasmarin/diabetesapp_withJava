package diabetes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class newConnectionTest {
	//DECLARAMOS UN CONTADOR. PROBABLEMENTE HAYA QUE MOVERLO A LA MAIN CLASS Y HACERLO ACCESIBLE PARA CADA TIPO DE ALIMENTO
		public static double mycounter = 0;
		static String nombre;
		static String raciones;
		static String indiceglucemico;
		static ArrayList<String> valores = new ArrayList<String>();
		
		public static void miconexion(String argumento) {
		Connection micon = null;
		PreparedStatement statement = null;
		
		
		try {
			micon = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alimentos_nueva?allowPublicKeyRetrieval=true&useSSL=false", "root", "admin");
if (micon!=null) {
				
				JOptionPane.showMessageDialog(null, "CONNECTED", "Mensaje de Alerta", JOptionPane.INFORMATION_MESSAGE);
				
				// DEFINIMOS LA BÚSQUEDA
				String myquery = "SELECT * FROM alimentos_nueva.cereales_y_derivados";
				// EJECUTAMOS LA BÚSQUEDA
				statement = (PreparedStatement) micon.prepareStatement(myquery);
	            ResultSet resultSet = statement.executeQuery();
	            
	            {if (!resultSet.next()) {
	            	System.out.println("USER NOT FOUND");
	            }
	            else {
	            	// DO WHILE LOOP PARA IMPRIMIR DESDE LA PRIMERA ROW. DE LO CONTRARIO IMPRIMIRÍA A PARTIR DE LA SEGUNDA
	            	do
	            	 	{
	            		raciones = resultSet.getString("raciones_hc");
	            		nombre = resultSet.getString("nombre_alimento");
	            		indiceglucemico = resultSet.getString("indiceg");
	            		
	            	//System.out.println("Esto es el parámetro" +argumento);
	            		
	            		if (argumento.equals(nombre)) {
	            			//System.out.println(nombre +" " + raciones + " " + indiceglucemico);
	            			valores.add(nombre);
	            			valores.add(raciones);
	            			valores.add(indiceglucemico);
	            			//System.out.println(valores.get(0));
	            			//return valores;
	            		}

	            	}
	            	while (resultSet.next());
	            }
	            	
	            }}}
				
				
catch(Exception e) 
		
		{System.out.println("NOT CONNECTED");}
		
	}
		// ESTE MÉTODO CALCULARÁ LAS DOSIS DE INSULINA A INYECTAR
		public static void checkingFood(String comida, ArrayList miargumento, String cantidad)  {
			// PRINT DEL ALIMENTO ESCOGIDO EN EL COMBOBOX
			System.out.println(comida);
			double cantidadEnGramos = Double.parseDouble(cantidad);
			String racionesCH = (valores.get(1));
			System.out.println("Esto son las raciones de CH: " + racionesCH);
			
			double racionesFinal = Double.parseDouble(racionesCH);
			double racionesTotal = (racionesFinal * cantidadEnGramos) / 100;
			System.out.println("Esta es la cantidad: " + cantidad );
			//System.out.println("Estas son las raciones " + racionesCH);
			System.out.println("Raciones cH ingeridas: " + racionesTotal);
			
			mycounter = mycounter + racionesTotal;
			
			//System.out.println(mycounter);
			
			
			
		}
		
}

