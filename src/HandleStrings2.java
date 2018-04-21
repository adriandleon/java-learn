
public class HandleStrings2 {

	public static void main(String[] args) {

		String sentence = "Today is a great day to learn how to program in Java";
		
		String summarySentence = sentence.substring(0, 28) + " go to the beach, " +
		"forget about everything and " + sentence.substring(29, 57);
		
		System.out.println(summarySentence);
	}
}
