package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()){
			char[] ca1= text1.toCharArray();
			char[] ca2=text2.toCharArray();
			Arrays.sort(ca1);
			Arrays.sort(ca2);
		
			if(ca1==ca2) {
				System.out.println(text1+" is Anagram of "+text2);
			}
			else {
				System.out.println(text1+" is not Anagram of "+text2);
			}
			
		}
		
	}

}
