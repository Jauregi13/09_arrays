
public class OrdenamientoInsercion {

	public static void main(String[] args) {
		int[] numeros = new int[10];

		// rellenamos el array con valores aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 11);
		}

		// mostramos en pantalla valores del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		int valor = numeros[0];
		int indice = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (i == numeros.length - 1) {

			} else if (valor > numeros[i + 1]) {
				int aux = 0;
				for (int j = i+1; j >= 1; j--) {
					if(numeros[j] < valor){
						aux = numeros[j];
						numeros[j]= numeros[j-1];
						numeros[j-1] = aux;
						valor = numeros[j-2];
					}
						
						
					
				}
				valor = numeros[i+1];
			} else {
				valor = numeros[i+1];
			}
		}

	}

}
