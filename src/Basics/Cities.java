package Basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dalas" };
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Random line to separate things out
		System.out.println("**********");
		
		// Declare and define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		// the while does go after the close }
		// do loop enters the condition and then evaluates the condition.
		do{
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		}while (1 < 5);
		
		// while loops test condition first and then enter the loop
		/*int n = 0;
		while (n <= 4) {
			System.out.println("State at " + n + ": " + states[n]);
			n++;
		}

		// for loops best structure for iterating an array
		for (int x = 0; x < 5; x++){
			System.out.println(states[x]);
		}
		*/
	}
	
}
	



