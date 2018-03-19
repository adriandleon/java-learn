
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 27},
		};
		
		for (int[] row : matrix) {
			for (int z : row) {
				System.out.print(z + " ");
			}
			System.out.println("");
		}
	}
}