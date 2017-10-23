
public class Ejercicios01 {

	public static void main(String[] args) {
		// crear un array de 15 con numeros aleatorios entre 0 y 10
		
		int[] numeros = new int[15];
		int sumaTotal = 0;
		float media = 0;
		int i= 0;
		int valor_Max = 0;
		for (i = 0; i < numeros.length; i++){
			numeros[i]= (int)(Math.random()*11);
			System.out.print(numeros[i]+", ");
			sumaTotal = sumaTotal + numeros[i];
			if (i == 0){
				valor_Max = numeros[i];
			}
			if (numeros[i] >= valor_Max){
				valor_Max = numeros[i];
			}
						
		}
		System.out.println("");
		// sacar por pantalla todos los valores en una misma linea separados por coma
		
		// sacar la suma de todos los valores por pantalla
		
		System.out.println("La suma de todos los valores es: " + sumaTotal);
		// sacar la media de todos los valores
		media = sumaTotal / numeros.length;
		System.out.println("La media de todos los valores es: " + media);
		
		
		//valor maximo del array
		System.out.println("El valor maximo de todos los numeros es: " +valor_Max);

	}

}
