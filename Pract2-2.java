import java.util.Scanner;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter; 
public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numParametros;
		 int i;
		 int valorParametro;
		 System.out.println("Muestra los primos entre 3 y el número que se pasa como argumento.");
		 Scanner cantidad = new Scanner(System.in);
		 
		 numParametros= cantidad.nextInt();
		 cantidad.close();

		 File salida = new File("salida.txt");
		 try {
			 salida.createNewFile();	
			 
		 }catch(IOException e) {
			 System.out.println("Error en la creación del fichero");
		 }
		 
		 try {
			 FileWriter escribir = new FileWriter("salida.txt");
			 valorParametro=numParametros;
			 for (i=3; i<=valorParametro; i++)
			 if (esPrimo(i)) {
				 escribir.write("El número: " +i+ " es primo");
				 escribir.write("\n");
				 System.out.println("El número: " +i+ " es primo");
			 }
			 escribir.close();
			 
		 }catch(IOException a){
			 System.out.println("Error al escribir en el fichero");
			 
		 }
	}

		 /**
		 * Determina si un número es o no primo
		 * @param numero Número del que se desea saber si es o no primo
		 * @return boolean true si el número es primo
		 */
		 private static boolean esPrimo (int numero){
		 int contador;
		 boolean esNumeroPrimo;
		 esNumeroPrimo = ( numero % 2 ) != 0;
		 contador = 3;
		 while ( esNumeroPrimo && contador < numero) {
		 esNumeroPrimo = ( numero % contador ) != 0;
		 contador = contador + 2;
		 }
		 return esNumeroPrimo;
		 }
	
}


