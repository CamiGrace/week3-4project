import java.util.*;

public class challengeWeek4Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = (int)(Math.random() * 100 + 1);
		int [] num = new int [5];
		for (int j = 0; j<=5; j++) {
			num [j] = num = (int)(Math.random() * 100 + 1);
		}
			for (int j = 0; j< num.length; j++) {
				System.out.println(num[j] + " ");
			}
			
			//ArrayList
			ArrayList <Integer> nums = new ArrayList <>();
			for (int j = 0; j<5; j++) {
				nums.add((int)(Math.random() * 100 + 1));
			}
				for (int j = 0; j< nums.size(); j++) {
				System.out.println(nums.get(j) + " ");
			}
			}
		
		
	}
	 


