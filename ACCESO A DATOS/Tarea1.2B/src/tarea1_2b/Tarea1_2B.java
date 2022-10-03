package tarea1_2b;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tarea1_2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File fichero = new File("palabras.txt");
			FileReader lector = new FileReader(fichero);
			int i;
			char[] palabras = new char[(int) fichero.length()];
			while ((i = lector.read(palabras,0,5)) != -1) { 
				System.out.print(palabras); 
				System.out.println();
			}
			lector.close();  
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
