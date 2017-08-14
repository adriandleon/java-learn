
public class EjemploArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int X = 6;
		final int Y = 5;
		
		double acumulado, interes = 0.10;
		
		double[][] saldo = new double[X][Y];
		
		for (int i=0; i<X; i++) {
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for (int j=1; j<Y; j++) {
				acumulado = acumulado + (acumulado * interes);
				saldo[i][j] = acumulado;
			}
			
			interes = interes + 0.01;
		}
		
		for (int i=0; i<X; i++) {
			for (int j=0; j<Y; j++) {
				System.out.printf("%1.2f", saldo[i][j]);
				System.out.print(" ");
			}
			
			System.out.println("");
		}
	}
}