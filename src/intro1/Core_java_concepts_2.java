package intro1;

import java.util.ArrayList;

public class Core_java_concepts_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array with condition
		int[] block = {1,3,4,5,6,8,10,12,14,17,18};
		// check if the array has multiple of 2
		for (int p=0; p<block.length;p++)
		{
			if (block[p] % 2 ==0)
			{
			//	System.out.println(block[p]);
				break;
				
				}
			else
			{
				//System.out.println(block[p] + " is not a multiple of 2.");
			}
			
		}
		
		//Arraylist
		
		ArrayList<String> a = new ArrayList<String>();
		//Now to add to the ArrayList
		a.add("John");
		a.add("Ian");
		a.add("Jesse");
		a.add("Joshua");
		//To get an array with the index
		System.out.println(a.get(2));
		
		
		// Strings and important strings
		// string is an object, we can create strings using:
		
		//literal strings
		String s = ("Welcome home");
		
		
		//new keyword
		String S1 = new String("Welcome home");
		String S2 = new String("Welcome home");
		
		
		
		
		
		
	}

}
