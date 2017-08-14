
public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[4][5];
		
		matrix[0][0] = 67;
		matrix[0][1] = 32;
		matrix[0][2] = 6;
		matrix[0][3] = 68;
		matrix[0][4] = 16;
		
		matrix[1][0] = 26;
		matrix[1][1] = 7;
		matrix[1][2] = 24;
		matrix[1][3] = 8;
		matrix[1][4] = 35;
		
		matrix[2][0] = -45;
		matrix[2][1] = 20;
		matrix[2][2] = 4;
		matrix[2][3] = -4;
		matrix[2][4] = 5;
		
		matrix[3][0] = 5;
		matrix[3][1] = 7;
		matrix[3][2] = 46;
		matrix[3][3] = 32;
		matrix[3][4] = 34;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}