package Loops;

public class ArraysUsingLoops {

	public static void main(String[] args) {
		
		String[] states= new String[5];
		states[0]= "Texas";
		states[1]= "Ohio";
		states[2]= "Venice";
		states[3]= "Milan";
		states[4]= "Paris";
		
		//testing do while loop//
		
		int i=0;
		do {
			
			System.out.println("State name:" + states[i]);
			i++;
		}while
			(i<=4);
		
		//testing while loop//
		System.out.println("Testing While Loop...");
		
			int x=0;
			boolean statefound=false;
			while(!statefound) {
				String state= states[x];
				System.out.println("State Name: " + state);
				if(state=="Milan") {
					statefound=true;
					System.out.println("Found the desired State...");
				}
				
				x++;
				
				
			}
			
		}
		

	}


