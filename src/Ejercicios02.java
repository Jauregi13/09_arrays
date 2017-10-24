
public class Ejercicios02 {

	public static void main(String[] args) {
		System.out.println("Estos son los numeros pares del 1 al 100:");
		int[] pares = new int[50];
		int indice = 1;
		int numero = 1;
		for(int i = 0; i < pares.length; i++){
			if (numero % 2 == 0){
				pares[i]= numero;
				System.out.println(indice + ". " +pares[i]);
				indice++;
			}
			else{
				i--;
			}
			numero++;
			
		}

	}

}
