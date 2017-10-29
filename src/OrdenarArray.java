import java.util.Scanner;

public class OrdenarArray {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int[] ordenado = new int[5];
		// Añadir los valores al array
		for (int i = 0; i < ordenado.length; i++){
			System.out.println("Escribe numero "+(i+1)+":");
			ordenado[i]= lector.nextInt();
		}
		// mostrar valores del array
		System.out.println("Estos son los valores que nos has dado:");
		for(int i = 0; i< ordenado.length; i++){
			System.out.print(ordenado[i]+" ");
		}
		System.out.println("");
		System.out.println("Estos son los valores de menor a mayor:");
		for(int i = 0; i < ordenado.length; i++){
			for (int j = 0; j < ordenado.length; j++){
				int aux = 0;
				if (j == ordenado.length -1){
					
				}
				else if(ordenado[j] > ordenado[j+1]){
					aux = ordenado[j];
					ordenado[j] = ordenado[j+1];
					ordenado[j+1] = aux;
					
				}
				
	
			}
			
		}
		for(int i = 0; i< ordenado.length; i++){
			System.out.print(ordenado[i]+" ");
		}

	}

}
