package matrizes;

public class Identidade {

	public static void main(String[] args) {

		int identidade[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 3; j++) {				
				identidade[i][j] = i == j ? 1 : 0;
				
				/*
				 * if (i == j) System.out.print(1); else System.out.print(0);
				 * System.out.println();
				 */		
			} 
		}
		
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 3; j++) {
				System.out.print(identidade[i][j]);				
			}
			System.out.println();			
		}
	}
}
