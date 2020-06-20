package Functions;

public class Numbers {

	public static void main(String[] args) {
		
		System.out.println("Starting the Program...");
		
		int a=10, b=15;
		add(a, b);
		System.out.println("The product is "+ multiply(a, b));
		
		

	}

	
	static void add(int numA, int numB) {
		int sum = numA + numB;
		System.out.println("The sum of " + numA +" and "+ numB +" is "+ sum);
		
	}
	
	static int multiply(int num1, int num2) {
		int product=num1 * num2;
		return product;
	}
}


