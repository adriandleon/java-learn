
public class HandleStrings {

	public static void main(String[] args) {
		
		String name = "Adrian";
		
		System.out.println("My name is " + name);
		
		System.out.println("My name has " + name.length() + " characters");
		
		System.out.println("The first letter of my name is " + name.charAt(0));
		
		int lastLetter = name.length();
			
		System.out.println("The last letter is " + name.charAt(lastLetter-1));
	}
}
