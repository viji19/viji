package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
	 test.split(" ");
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		//System.out.println(test);
		char[] data = test.toCharArray();
	 for(int i=0;i<data.length;i++) {
		 if(data.length%2 ==1) {
			// data.charAt(i);
				char[] data1 = test.toCharArray();
			// char[] array={test.charAt(i)};
			System.out.println(data1 [i]);
		 }
		 else
			 System.out.println("break");
	 }
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		
		

	}

}
