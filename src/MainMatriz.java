
public class MainMatriz {

	public static void main(String[] args) {
		int[][] matriz = new int[5][3];
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				matriz[i][j] = 10;
			}
		}
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matriz[i][j]);
				System.out.print(", ");
			}
			System.out.println(" ");
		} 

	}

}
