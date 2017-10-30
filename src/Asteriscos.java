
public class Asteriscos {

	public static void main(String[] args) {
		String[][] asterisco = new String[6][6];
		String caracter = "*";
		for (int i = 0; i < asterisco.length; i++){
			int indice = 0;
			for (int j = 0; j < asterisco[i].length; j++){
				if(j < i+1){
					asterisco[i][j]= caracter;
					System.out.print(asterisco[i][j]);
				}
				else{
					asterisco[i][j]= "";
					System.out.print(asterisco[i][j]);
				}
			}
			System.out.println("");
		}

	}

}
