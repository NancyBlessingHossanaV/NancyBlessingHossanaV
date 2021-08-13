package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		int add=c.add(1,2,3);
		System.out.println("Addition: "+add);
		int sub=c.sub(1,2);
		System.out.println("Sub: "+sub);
		float mul=c.mul(4.4f,5.5f);
		System.out.println("Mul: "+mul);
		
		float div=c.div(8.4f,2.4f);
		System.out.println("Div: "+div);
	}

}
