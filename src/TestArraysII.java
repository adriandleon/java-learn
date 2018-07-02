
public class TestArraysII {

	public static void main(String[] args) {
		
		int[] randomNumber = new int[150];
		
		for (int i=0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int random : randomNumber) {
			System.out.print(random + " ");
		}
	}
}
