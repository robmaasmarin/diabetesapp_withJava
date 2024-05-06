package diabetes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class first {
	
		public static void miconexion() {
		Connection micon = null;
		PreparedStatement statement = null;
		
		
		try {
			micon = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alimentos_nueva?allowPublicKeyRetrieval=true&useSSL=false", "root", "admin");
if (micon!=null) {
				
				JOptionPane.showMessageDialog(null, "CONNECTED", "Mensaje de Alerta", JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("CONNECTED");
				
				// TEST TEST TEST TEST
				
				String myquery = "SELECT * FROM alimentos_nueva.cereales_y_derivados";
				//String secondquery = "SELECT * FROM alimentos_nueva.cereales_y_derivados WHERE nombre_alimento = 'Boniato'";
				
				
				statement = (PreparedStatement) micon.prepareStatement(myquery);
	            ResultSet resultSet = statement.executeQuery();
	            
	            

  
	            {if (!resultSet.next()) {
	            	System.out.println("USER NOT FOUND");
	            }
	            else {
	            	// DO WHILE LOOP PARA IMPRIMIR DESDE LA PRIMERA ROW. DE LO CONTRARIO IMPRIMIRÍA A PARTIR DE LA SEGUNDA
	            	do
	            	//while (resultSet.next()) 
	            	{
	            		
	            		String raciones = resultSet.getString("raciones_hc");
	            		String nombre = resultSet.getString("nombre_alimento");
	            		String indiceglucemico = resultSet.getString("indiceg");
	            		     	
	            		//System.out.println(nombre);
	            		//System.out.println(name);
	            		//System.out.println(raciones);
	            		// CREAMOS UN DICCIONARIO PARA ALMACENAR ALIMENTO Y RACIONES DE HIDRATOS
	            		HashMap<String, String> diccionario = new HashMap<String, String>();
	            		
	            		// CREAMOS UN DICCIONARIO BIDIMENSIONAL PARA PODER ALMACENAR EL ANTERIOR JUNTO CON EL INDICE GLUCÉMICO
	            		HashMap<HashMap<String, String>, String> dictionary = new HashMap<HashMap<String, String>, String>();
	            		
	            		// DICCIONARIO1
	            		diccionario.put(nombre, raciones);
	            		//System.out.println(diccionario);
	            		
	            		//DICCIONARIO BIDIMENSIONAL
	            		dictionary.put(diccionario, indiceglucemico);
	            		System.out.println(dictionary);
	            		
	            		
	            		
	            		//if (nombre.equals("Yuca cruda")) { 			System.out.println(raciones);	            		}
	            	
	            	}
	            	while (resultSet.next());
	            	
	            }
	            	
	            }
				
				
}}catch(Exception e) 
		
		{System.out.println("NOT CONNECTED");}
		
	}
}

