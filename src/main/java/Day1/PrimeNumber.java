package Day1;



public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
int prime=6,flag=0;
int a= prime/2;

	for(int n=2;a>=n;n++) {
		
		if(prime%n == 0) {
			 System.out.println("not a prime number");
			 flag=1;
			 break;
			 }
		
			else {System.out.println(prime+" prime number");}
				
	}
}}
	// Declare an int Input and assign a value
		
		// Declare a boolean input as flag

		// Iterate from 1 to half of the input
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
			
		

	


