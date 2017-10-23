
public class Main {

	public static void main(String[] args) {
		int[] numeros; // se define el array
		numeros = new int[8]; //se crea el array
		double random = Math.random()*10;
		int aleatorio = (int)random;
		int edad = 21;
		numeros[0] = 3;
		numeros[1] = 34;
		numeros[5] = 9;
		numeros[7] = aleatorio;
		numeros[6]= edad;
		
		System.out.println(numeros[0] + " " + numeros[1]+ " " + numeros[7] + " " + numeros[6]);
		
		int[] notas = new int[10]; // se declara y se crea
		
		for (int i = 0; i < notas.length; i++){
			notas[i]=6;
		}
		int sumaDeNotas;
		sumaDeNotas = notas[0] + notas[1] + notas[3];
		System.out.println(notas.length);
		System.out.println("la suma de notas es: " + sumaDeNotas);
		
		String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		// recorrer un array
		for (int i = 0; i < semana.length; i++){
			System.out.println(semana[i]);
		}
	

	}

}
