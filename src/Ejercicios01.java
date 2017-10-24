import java.text.DecimalFormat;

public class Ejercicios01 {

	public static void main(String[] args) {
		// crear un array de 15 con numeros aleatorios entre 0 y 10
		
		int[] numeros = new int[15];
		int sumaTotal = 0;
		double media = 0.0;
		int valor_Max = 0;
		DecimalFormat decimal = new DecimalFormat("#.00");
		for (int i = 0; i < numeros.length; i++){
			numeros[i]= (int)(Math.random()*11);
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
		for (int i = 0; i < numeros.length; i++){
			if (i < numeros.length-1){
				System.out.print(numeros[i]+", ");
			}
			else{
				System.out.println(numeros[i]+".");
			}
			
		}
		// sacar la suma de todos los valores por pantalla
		
		System.out.println("La suma de todos los valores es: " + sumaTotal);
		// sacar la media de todos los valores
		System.out.println(sumaTotal);
		System.out.println(numeros.length);
		media = sumaTotal / numeros.length;
		System.out.println("La media de todos los valores es: " + media);
		
		
		//valor maximo del array
		System.out.println("El valor maximo de todos los numeros es: " +valor_Max);

	}

}
