
public class CalculateMath {

	public static void main(String[] args) {
		
//		double square = Math.sqrt(9);
		
		double base = 5;
		double power = 3;
		
		int result = (int)Math.pow(base, power);
		
		System.out.println("The result of " + base + " power by "
				+ power + " is " + result);
	}
}