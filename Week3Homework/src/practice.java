import java.util.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void factors(int userNumber) {
		// Write the list and loop here
		    
		    int i = 0;
		    ArrayList <Integer> factorList = new ArrayList <>();
		    for ( i = 1; i<=userNumber; i++) {
		    if (userNumber % i = 0) {
		        factorList.add(i);    
		    }
		}
		
		System.out.print(factorList);
		
		//Print the factored list here
		
		
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber = in.nextInt();
		factors(userNumber);
	}
}
	
	
	
	
	
	
}
