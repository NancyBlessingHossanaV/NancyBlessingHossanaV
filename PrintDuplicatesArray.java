package week1.day2;

public class PrintDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrlen = arr.length;	
		int count=0;
		for(int i = 0; i < arrlen; i++) {
			for(int j=i+1;j<arrlen;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
					
				}
				if(count>0) {
					System.out.println("Duplicate is "+arr[i]);
				}
			}
			
			
		}

	}

}
