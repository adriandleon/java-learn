
public class HandleStrings2 {

	public static void main(String[] args) {

		String sentence = "Today is a great day to learn how to program in Java";

		System.out.println(sentence);

		String summarySentence = sentence.substring(0, 23) + " go to the beach, " +
				"forget about everything and " + sentence.substring(24, sentence.length());

		System.out.println(summarySentence);
	}
}
