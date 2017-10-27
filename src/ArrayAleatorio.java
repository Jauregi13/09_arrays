import java.util.Scanner;

public class ArrayAleatorio {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Escribe la capacidad que tendrá el array (un numero):");
		// declarar el array con la capacidad que escribimos por teclado
		int[] numero = new int[lector.nextInt()];
		
		//rellenar el array de numeros aleatorios
		for (int i = 0; i < numero.length; i++){
			numero[i] = (int)(Math.random()*6);
			//System.out.println(numero[i]);
		}
		
		System.out.println("Ahora escribe un numero para saber cuantas veces sale en el array:");
		
		int contarNumero = lector.nextInt();
		int contador = 0;
		//recorrer el array para contar ese numero
		for (int i = 0; i < numero.length; i++){
			if (contarNumero == numero[i]){
				contador ++;
			}
		}
		//imprimir por pantalla
		System.out.println("El numero " + contarNumero + " sale " + contador + " vez(es)");

	}

}
