package day2.classroom.arrays;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 't';
		int totalCount = 0;
		
		// Build the logic to find the count of each
		//Pseudo Code:
			//a) Convert the String to character array
		char[] array = test.toCharArray();
		
			//b) Traverse through each character (using loop)
		for (int i =0; i <array.length-1; i++)
		{
			if(array[i]== ch) {System.out.println(array[i]);
			totalCount= totalCount+1;
		}}
			//c) If the given character matches the expected character (ch),
			  // Then, increment totalCount
		

	System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}
