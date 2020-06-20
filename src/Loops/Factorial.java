package Loops;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner so=new Scanner (System.in);
	System.out.println("Enter the number to find the factorial for ");
	
	int n = so.nextInt();
		
		
	System.out.println("The factorial for " + n + " is "+ fact(n));

	}
	 
	public static  long fact(int n) {
		//long num=1;
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		
		
		/*	for (int i=1; i<=n; i++) {
				
				num= num* i;
				
						
			}				
				
			*/ 
		return fact(n-1)*n;
		
		
		
	}
	
}


