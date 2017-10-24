
public class NumerosPrimos {

	public static void main(String[] args) {
		int[] primos = new int[8];
		int numero = 1;
		for(int i = 0; i < primos.length; i++){
			for (int divisor = 1; divisor <=20; divisor++){
				if(numero % divisor == 0){
					primos[i] = numero;
					System.out.println(primos[i]);
					numero++;
				}
				
			}
		}

	}

}
