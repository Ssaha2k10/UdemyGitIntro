package Loops;

public class ArrayParameters {
	
	public static int minNum(int[] n) {
		
	int min=n[0];
	
	for (int i=0; i<n.length; i++) {
		if (n[i]<min) {
		min=n[i];
		}
		
		
	}
	return min;
}
	
	public static int maxNum(int[] n) {
		
		int max=n[0];
		
		for (int i=0; i<n.length; i++) {
			if (n[i]>max) {
			max=n[i];
		}
		
	}
		
		return max;
		
	}
	
	public static int avgNum(int[] n) {
		
		int avg=0;
		int sum=0;
		
		for (int i=0; i<n.length; i++) {
			
			sum= sum+ n[i];
		}
		
		avg=sum/n.length;
		return avg;
	}
		
	public static void main(String[] args) {
		
		int [] arr= new int [] {23,4,56,3,11,9};
		System.out.println("The Smallest number is " + minNum(arr));
		System.out.println("The largest number is " + maxNum(arr));
		System.out.println("The Average of the array is " + avgNum(arr));
		
	}


}		
		
		
		
		
		
		
		
		
		
		

