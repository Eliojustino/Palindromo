/**************************************
 * Autor: Cruz Ortega Elio Justino    *
 * Fecha Creación: 17/03/23           *
 * Fecha Actualización:	19/03/23	  *
 * Descripción: Método burbuja		  *
 **************************************/

package arreglos;
import java.util.Scanner;

public class Arreglo {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Creo mis identificadores y los defino
		int arreglo[];
		int numElementos;
		int aux;
		
		//Mando un mensaje para que el usuario ingresé la cantidad de números que quiera ordenar
		System.out.println("Digite la cantidad de elementos del arreglo: ");		
		numElementos = entrada.nextInt();

		//Le asigne la cantidad de elementos que tendrá mi arreglo
		arreglo = new int[numElementos];	

		//Llenado del arreglo
		for(int i = 0 ; i < numElementos ; i++){
		System.out.println("\nDigite un número en la posición " + (i+1));
			arreglo[i] = entrada.nextInt();
		}
	
		//impresión del arreglo en el orden en que fueron ingresados los números
		System.out.println("\nEl orden en que se introdujo el arreglo es: ");
		for(int i=0 ; i < numElementos ; i++){
			System.out.println(arreglo[i] + " -");
		}

		//Método burbuja
		for(int i = 0 ; i < (numElementos-1) ; i++) {
			for(int j = 0 ; j < (numElementos-1) ; j++) {
				if(arreglo[j] > arreglo[j+1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}

		//Imprimiendo el arreglo ya ordenado
		System.out.println("\nArreglo ordenado en orden creciene: ");
		for(int i=0 ; i < numElementos ; i++){
			System.out.println(arreglo[i] + " - ");
		}

		System.out.println(" ");


		
	}
	
}
