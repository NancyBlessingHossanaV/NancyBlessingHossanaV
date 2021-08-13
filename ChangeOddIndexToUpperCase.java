package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String test = "changeme";
		 String result="";
		 char[] charArr=test.toCharArray();
		 for(int i=0;i<charArr.length;i++) {
			 if(i%2!=0) {
				result=result+Character.toUpperCase(charArr[i]) ;
				
			 }
			 else
				 result=result+charArr[i];
			 
		 }
System.out.println("Array is "+result);
	}

}
