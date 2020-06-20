package Loops;

public class FibonnacciNumber {

	public static void main(String[] args) {
		System.out.println (fibNum(4));
	}
		public static int fibNum(int n){
			
			if (n==0) 
				return 0;			
			
			else if (n==1)
				return 1;
			
			return (fibNum(n-1)+ fibNum(n-2));
				
			
					}
			
			
				
			}
			
			
		

	


