import java.util.*; 

public class week4FollowAlong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String x = new String("Hello");
//		StringBuilder y = new StringBuilder ("it's me");
//		
//		x += "yo!";
//		y.append("Hell)
//			
		// data structures: nodes, vectors, hash sets, hash maps, trees, tris (RESEARCH!!!)
		
		String [] names = {"Mark", "Paul", "Mary", "Peter", "Jennifer", "Sam"};
		
		names = new String[10]; // resize an array but all contained info is wiped 
		
		//array-list: linear data structures that acts like an array
		
		ArrayList<String> names1 = new ArrayList <>();
		names1.add("Mark");
		names1.add("Peter");		
		names1.add("Susan");
		System.out.println(names1.get(0));
		
		//size
		System.out.println(names1.size());
		
		// remove
		names1.remove ("Peter");
		System.out.println(names1.get(1));
		
		//insertions
		names1.add(0, "Peter");
		
		//overwrite
		names1.set(0, "Pete");
		
		//name search
		System.out.println(names1.contains("Shannon"));
		
		//index of peter
		System.out.println(names1.indexOf("Mark"));
		
		ArrayList <Integer> nums = new ArrayList <>();
		for (int j = 0; j<5; j++) {
			nums.add((int)(Math.random() * 100 + 1));
		}
			for (int j = 0; j< nums.size(); j++) {
			System.out.println(nums.get(j) + " ");
		}
			
			//hashsets; are unique, cannot be reused 
			HashSet <String> set = new HashSet <>();
			set.add("One"); 
			set.add("Two"); 
			set.add("Three"); 
			set.add("Four");
			set.add("Five"); 
			
			//creates a repeating cycle: best way to cycle through hash set  
			
			
			Iterator<String> x = set.iterator();
			while(x.hasNext()) {
				System.out.println(x.next());
			}
			
			//will not contain repeats, does not print in order, prints in most efficient way 
			
			// HashMap; you get to decide the index and the values
				//Two parts: hashset, values
				
				HashMap <Character, Integer> letterCount = new HashMap <>();
				Scanner kb = new Scanner(System.in);
				System.out.println("Please enter a word or phrase.");
				String phrase = kb.nextLine();
				
				for (int j = 0; j < phrase.length(); j++) {
					char a = phrase.charAt(j); //store each individual letter
					
					if(!letterCount.containsKey(phrase.a( ) ) {
						letterCount.put(phrase.charAt(j), 1);
					} else {
						letterCount.put(phrase.charAt(j), letterCount.get(a)+1);
				}
				
			}
				// how to cycle through your keySet in a hash map.
				for(Character z: letterCount.keySet() ) 
					System.out.println(z);
		
				
				// to cycle through values
				for (Integer y: letterCount.values()) 
					System.out.println(y+ " ");
				
				}
			}
				
	
	
	
	


