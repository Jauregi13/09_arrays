import java.util.Scanner;

public class OrdenarArray {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int[] ordenado = new int[5];
		int aux = 0;
		// Añadir los valores al array
		for (int i = 0; i < ordenado.length; i++){
			System.out.println("Escribe numero "+(i+1)+":");
			ordenado[i]= lector.nextInt();
		}
		for(int i = 0; i < ordenado.length - i; i++){
			for (int j = 0; j < ordenado.length; j++){
				if (ordenado[j] < ordenado[j+1]){
					aux = ordenado[j];
					ordenado[j] = ordenado[j+1];
					ordenado[j+1] = aux;
				}
	
			}
		}
		

	}

}
