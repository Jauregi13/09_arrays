
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
		int valor = 0;
		for(int i = 0; i< numeros.length; i++){
			if (i == 0){
				valor = numeros[i];
			}
			if (valor > numeros[i+1]){
				
			}
		}

	}

}
