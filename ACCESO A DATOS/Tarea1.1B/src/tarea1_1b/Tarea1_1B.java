package tarea1_1b;

import java.io.File;

public class Tarea1_1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
   // Creamos el objeto que encapsula el fichero
   File fichero = new File("C:\\Users\\Usuario\\Documents\\ALEJANDRO\\2º CFGS\\Tarea1.1A\\AD\\AD\\UA01\\AD\\UA02\\AD\\UA03\\AD\\UA01\\EJ01\\AD\\UA01\\EJ02\\AD\\UA01\\EJ03\\AD\\UA02\\EJ01\\prueba.html");
   // A partir del objeto File creamos el fichero físicamente
   if (fichero.createNewFile()) 
      System.out.println("El fichero se ha creado correctamente");
   else
      System.out.println("No se ha podido crear el fichero");
} catch (Exception e){
   e.getMessage();
}


	}

}
