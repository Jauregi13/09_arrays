import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		String[] nombres = new String[5];
		Scanner lector = new Scanner(System.in);
		String primerNombre = "";
		// agregar los nombres en el array
		for (int i = 0; i < nombres.length; i++){
			System.out.println("Escribe nombre "+(i+1)+":");
			nombres[i] = lector.nextLine();
			
			
		}
		// recorrer el array para ver el nombre que va antes en el alfabeto
		for (int i = 0; i < nombres.length; i++){
			if (i == 0){
				primerNombre = nombres[i];
			}
			if (primerNombre.compareTo(nombres[i]) > 0){
				primerNombre = nombres[i];
				
			}
		}
		// muestra por pantalla
		System.out.println("Este nombre es el que va antes en el alfabeto: " +primerNombre);
		

	}

}
