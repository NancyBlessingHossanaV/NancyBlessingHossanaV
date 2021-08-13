package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] stringArray = test.split(" ");
		String revString = "";
		for (int i = 0; i < stringArray.length; i++) {
			if ((i + 1) % 2 == 0) {
				String reverse = "";
				for (int j = stringArray[i].length() - 1; j >= 0; j--) {
					reverse = reverse + stringArray[i].charAt(j);
				}
				revString = revString + reverse;
			} else {
				revString = revString + stringArray[i];
			}
			revString = revString + " ";
		}
		System.out.println("Even words reversed string is : " + revString);

	}

}