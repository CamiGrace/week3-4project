import java.util.*; 

public class codingproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// #1
		// Create an array of int. 
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 20};
		
		// Programmatically subtract the value of the first element in the array from the value in the last element
		
	
			
		System.out.println("Answer 1a: " + (ages[ages.length - 1]- ages[0] ));
		
		int result = 0;
		for (int a = 0; a < ages.length; a++) {
			
			result += ages[a];
			}
		
		double average = result/ ages.length;
		
		// not adding the first number of the array
		
		System.out.println("Answer 1c: " + average);
		
		//#2
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//a.
		int n = 0;
		int nameSize =0;
		int divisor = ((names.length));
		
		for( n =0; n< ((names.length)); n++) {
		 nameSize += (names[n].length());
		
		}
		double answer = (nameSize/divisor);
		System.out.println("Answer 2a: " + answer);
		
		//b.
		for(String allNames : names) {
			System.out.print(allNames + " ");
		}
		System.out.println(" ");
		
		//3. the name of the array plus the [0] position. For example:
		System.out.println(names[0]);
		
		//4. the name of the array plus the number of variables in the array (length) minus one. For example:
		System.out.println(names[5]);
		
		//5. Help 0 is out of bounds 
		//int [] nameLengths = {};
		int [] nameLengths = new int [names.length];
		
		
		for (int z =0; z < names.length; z++) {
			nameLengths [z] = names[z].length();
		}
				
		//6.
		
		int sumOfNames =0;
		for(int i =0; i< nameLengths.length; i++) {
			sumOfNames += nameLengths [i];
		}
		System.out.println("Total Letters: " + sumOfNames);
			
		
		System.out.println("Answer 7: " + repeatWord("hello", 3));
		System.out.println("Answer 8: " + fullNameMethod("Sally", "Thompson"));
		
		int [] exampleArray = {5,4,25,63,4};
		double [] exampleDoubleArray = {5.2, 6.3, 27.2, 9.5};
		double [] secondDoubleArray = {3.2, 8.4, 9.2, 7.2, 6.8};
		System.out.println("Answer 9: " + arrSumBoolean(exampleArray));
		System.out.println("Answer 10: " + average(exampleDoubleArray));
		System.out.println("Answer 11: " + firstOrSecond(exampleDoubleArray, secondDoubleArray));
		boolean isHotOutside  = true;
		System.out.println("Answer 12: " + willBuyDrink(isHotOutside, 12.05));
		System.out.println("Answer 13: " + remodelOptions( 40, 4.29, 7.81, 13.06, 150 ));
	}
	
	
		
		// end of main method 
	
	public static String repeatWord (String word, int n) {
		String result = "";
		for (int i =1; i<= n; i++) {
			result += word;
		}
		return result;
	}
	
	//8.
	public static String fullNameMethod (String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);
		return fullName;
		
	} //9
	public static boolean arrSumBoolean (int [] array ) {
		int answer = 0;
		for(int num: array) {
			 answer += num;	
			
		}
		return answer> 100;
	
}	//10
	public static double average (double [] newArr) {
		double newAnswer = 0.0;
		for (int z =0; z < newArr.length; z++) {
			newAnswer += newArr [z];
			
	}
	double doubleAverage = (newAnswer/ (newArr.length));
	return doubleAverage;
	
	}
	
	//11.	
	public static boolean firstOrSecond ( double [] firstArr, double [] secondArr) {
		double sumOfOne = 0.0;
		double sumOfTwo = 0.0;
		for (int z =0; z < firstArr.length; z++) {
			sumOfOne += firstArr [z];
	}
		double firstElementAverage = sumOfOne/ firstArr.length;
		for (int y =0; y < secondArr.length; y++) {
			sumOfTwo += secondArr [y];
	}
		double secondElementAverage = sumOfTwo/ secondArr.length;
		
		return firstElementAverage>secondElementAverage;
	}
	
	//12.	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket ) {
			if ((isHotOutside) && (moneyInPocket> 10.50)){
		 return true;
			} else {
				return false;
			}
	}
	
	

	//13.	Create a method of your own that solves a problem. I created a method to help compare options when planning a remodel. 
	// The user can input how much space they have to cover as well their budget for this particular feature and three options of varying price. 
	//The method will output the highest tier, or most expensive options they can afford on their budget. 
	//Using this method for multiple features such as flooring, fixtures, and walls can allow the user to tweak different parts of their budget, 
	// divide is differently and decide what options are the most important to them. 
			
			public static String remodelOptions(double areaCovered, double cheapest, double midTier, double mostExpensive, double budget) {
				if ( areaCovered * mostExpensive<= budget ) {
					return "mostExpensive";
				}else if (areaCovered * midTier<= budget) {
				return "midTier"; 
				} else if (areaCovered * cheapest<= budget) {
					return "cheapest";
				} else {
					return "you cannot afford this remodel";
				}
			

} 
}
	

		
		
		


		
	


