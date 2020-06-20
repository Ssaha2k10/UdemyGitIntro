package Loops;

public class Sum {

	public static void main(String[] args) {
	
		System.out.println("The sum is "+ addition(5));
		
	}
		public static int addition(int n) {
			int num=0;
			for (int i=1; i<=n; i++) {
				num= num+i;
			}
		
			return num;
		
		}

}
