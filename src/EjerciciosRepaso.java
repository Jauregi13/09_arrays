import java.util.Scanner;

/*1- 	Dado un array de int-s sacar por pantalla los numeros
		 * 		mayores que 5 y mernores o iguales que 14
		 * 		y mayores o iguales que 20 menores o iguales que 30.
		 * 
		 *2-	Dado un array de String-s sacar por pantalla los que
		 *		empiezen con 'a' o tengan la 3. letra la 'a'
		 *
		 *3-	Programa que lea una cadena de caracteres del teclado 
		 *		y muestre sus siglas. Por ejemplo: tren articulado ligero 
		 *		goicoechea oriol TALGO 
		 */
public class EjerciciosRepaso {
	
	public static void ejercicio1() {
		
	}
	
	public static void ejercicio2(String[] nombres){
		
		for (int i = 0; i < nombres.length; i++){
			if(nombres[i].charAt(0) == 'a' || nombres[i].charAt(2) == 'a'){
				System.out.println(nombres[i]);
			}
		}
		
	}
	public static String ejercicio3 (String cadena){
		String siglas = "";
		
		String[] cadena_array = cadena.split(" ");
		
		for (int i = 0; i < cadena_array.length; i++){
			siglas = siglas + cadena_array[i].toUpperCase().charAt(0);
		}
		
		return siglas;
		
			}
	
	public static int[] ejercicio4(int divisor, int maximo){
		
		int valores_totales = maximo / divisor;
		int[] multiplos = new int [valores_totales];
		int indice = 0;
		for (int numero = divisor; numero <= maximo; numero++){
			if (numero % divisor == 0){
				multiplos[indice] = numero;
				indice++;
			}
		}
		return multiplos;
	}

	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
		
		String[] nombres = {"jon","ana", "afagga","fasdfa","ajafasd"};
		
		ejercicio2(nombres);
		
		
		System.out.println("Escribe una cadena de texto:");
		
		String cadena = lector.nextLine();
		
		System.out.println(ejercicio3(cadena));
		
		int numero = 9;
		
		int numero2 = 20;
		
		int[] multiplos = ejercicio4(numero,numero2);
		
		for(int i = 0; i < multiplos.length; i++){
			System.out.println(multiplos[i]);
		}

	}

}
