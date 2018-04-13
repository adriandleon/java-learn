
public class Array2DExample {

	public static void main(String[] args) {

		final int X = 6;
		final int Y = 5;
		
		double amassed, interest = 0.10;
		
		double[][] balance = new double[X][Y];
		
		for (int i=0; i<X; i++) {
			balance[i][0] = 10000;
			amassed = 10000;
			
			for (int j=1; j<Y; j++) {
				amassed = amassed + (amassed * interest);
				balance[i][j] = amassed;
			}
			
			interest = interest + 0.01;
		}
		
		for (int i=0; i<X; i++) {
			for (int j=0; j<Y; j++) {
				System.out.printf("%1.2f", balance[i][j]);
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}