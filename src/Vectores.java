import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int[] vector1 = new int[2];
		int[] vector2 = new int[2];
		int[] vectorConcatenado = new int[4];
		//agregar los valores al vector1
		for (int i = 0; i < vector1.length; i++){
			System.out.println("Escribe segmento " +(i+1) +" del vector 1:");
			vector1[i] = lector.nextInt();
		}
		
		//agregar los valores al vector2
		for (int j = 0; j < vector2.length; j++){
			System.out.println("Escribe segmento " +(j+1) +" del vector 2:");
			vector2[j] = lector.nextInt();
		}
		//añadir los valores del vector1 al vector concatenado
		System.out.print("Estos son los valores del vector concatenado: ");
		for (int i = 0; i < vectorConcatenado.length;i++){
			// con esta condicion añade primero los valores del vector1
			if (i < vector1.length){
				vectorConcatenado[i] = vector1[i];
			}
			// despues de esto añadira los valores del vector2
			else {
				vectorConcatenado[i] = vector2[i-2];
			}
			System.out.print(vectorConcatenado[i] + " ");
		}
		
		

	}

}
