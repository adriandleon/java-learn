import java.util.Scanner;

public class TestSizes {
	
//	enum Size { SHORT, MEDIUM, LARGE, XLARGE };
	
	enum Size {
		
		SHORT("S"), MEDIUM("M"), LARGE("L"), XLARGE("XL");
		
		private String sizeLetter;
		
		Size(String sizeLetter) {
			this.sizeLetter = sizeLetter;
		}
		
		public String getSizeLetter() {
			return sizeLetter;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Write your size (SHORT, MEDIUM, LARGE, XLARGE): ");
		
		String inputData = input.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, inputData);
		
		System.out.println("Size = " + size);
		
		System.out.println("Size letter = " + size.getSizeLetter());
	}
}
