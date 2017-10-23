
public class Ejercicios01 {

	public static void main(String[] args) {
		// crear un array de 15 con numeros aleatorios entre 0 y 10
		
		int[] numeros = new int[15];
		int sumaTotal = 0;
		double media = 0;
		for (int i = 0; i < numeros.length; i++){
			numeros[i]= (int)(Math.random()*11);
			System.out.print(numeros[i]+", ");
			sumaTotal = sumaTotal + numeros[i];
						
		}
		System.out.println("");
		// sacar por pantalla todos los valores en una misma linea separados por coma
		
		// sacar la suma de todos los valores por pantalla
		
		System.out.println("La suma de todos los valores es: " + sumaTotal);
		// sacar la media de todos los valores
		media = sumaTotal / numeros.length;
		System.out.println("La media de todos los valores es: " + media);
		
		
		//valor maximo del array

	}

}
