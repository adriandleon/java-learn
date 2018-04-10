
public class ConstantOperators {

	public static void main(String[] args) {
		
		final double toInches = 2.54;
		
		double centimeters = 6;
		double resultInches = centimeters / toInches;
		
		System.out.println("In " + centimeters + "centimeters there are " + resultInches + " inches.");
		
		// Variable declaration in the same line
		int operand1, operand2, result;
		
		operand1 = 8;
		operand2 = 7;
		result = operand1 + operand2;
		
		System.out.println(result);
	}
}
