
public class OrdenamientoInsercion {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		// rellenamos el array con valores aleatorios
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = (int)(Math.random()*11);
		}
		
		// mostramos en pantalla valores del array
		for(int i = 0; i < numeros.length; i++){
			System.out.print(numeros[i]+" ");
		}
		int valor = numeros[0];
		for(int i = 0; i< numeros.length; i++){
			int aux = 0;
			if (valor > numeros[i+1]){
				int[] ordenacion = new int[i+2];
				for (int j = 0; j < ordenacion.length; j++){
					
				}
			}
			else {
				valor = numeros[i];
			}
		}

	}

}
