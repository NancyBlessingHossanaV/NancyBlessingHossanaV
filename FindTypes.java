package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ca = test.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if (Character.isLetter(ca[i])) {
				letter = letter + 1;
			} else if (Character.isDigit(ca[i])) {
				num = num + 1;
			}

			else if (Character.isSpaceChar(ca[i])) {
				space = space + 1;
			} else
				specialChar += 1;
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}
