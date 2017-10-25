
public class NumerosPrimos {

	public static void main(String[] args) {
		int[] primos = new int[8];
		int numero = 1;
		for(int i = 0; i < primos.length; i++){
			int contador = 0;
			for (int divisor = 1; divisor <=20; divisor++){
				if(numero % divisor == 0){
					contador++;
					
				}	
			}
			if (contador == 2){
				primos[i] = numero;
				System.out.println(primos[i]);
				
			}
			else {
				i--;
			}
			numero++;
		}

	}

}
