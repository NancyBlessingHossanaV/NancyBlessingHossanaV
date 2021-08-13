package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "welcome to chennai";
		char[] ca=str.toCharArray();
		int count=0;
		for(int i=0;i<ca.length;i++) {
			if(ca[i]=='e') {
				count=count+1;
				
			}
		}
System.out.println("Occurance of 'e' is: "+count);
	}

}
