package diabetes_app;


import java.sql.Connection;

import my_diabetes_package.cereales_y_derivados;

public class CerealsInsuline {
	
	
	public static void checkCelIn() {
		
		newConnectionTest.miconexion(cereales_y_derivados.valueSelected);
		
		// 
		newConnectionTest.checkingFood(cereales_y_derivados.valueSelected, newConnectionTest.valores, cereales_y_derivados.gramosCereales);
;		
		
		
	}

}
