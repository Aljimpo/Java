import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.*;
public class SeriesNumeros {
	public static void main (String[] args) throws FileNotFoundException {
		System.out.println("Escriba el valor del umbral ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Escriba el valor del umbral ");
			sc.next();
		}
		int numero = sc.nextInt();

		
		System.out.println("Escriba el nombre del archivo");
		sc.hasNext();
		String archivo;
		archivo = sc.next();
		sc.close();
		
		File mi_archivo = new File(archivo);
		Scanner myReader = new Scanner(mi_archivo);
		int i =0;
		int numeros[];
		numeros = new int[1000];
		
		while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			String[] partes = data.split(" ");
			if (partes.length!=0) {
				for(int a = 0;a<partes.length;a++) {
					numeros[i]= Integer.parseInt(partes[a]);
					i++;
				}
			}else {
			numeros[i]= Integer.parseInt(data);
			i++;
			}
				
		}
		int contador = 0;
		int contadormayor=0;
		
		for (int r=0; r<i;r++) {
			System.out.println(numeros[r]);
			if(numeros[r]>numero)
				contadormayor++;
			contador++;
		}
		System.out.println(contador);
		myReader.close();
		
		System.out.println("El umbral es : "+numero);
		System.out.println("La secuencia tiene "+contador+" Numeros");
		System.out.println("Hay "+contadormayor+" números mayores o iguales que el umbral");
		    }
	
}
	
