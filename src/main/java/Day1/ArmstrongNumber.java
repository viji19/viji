package Day1;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		//int num=153;
		//int cal = 1,rem = 5,ori = 3;
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
	//for(int i=153;i<0;i--)
	 int org=153;
	 int cal=0;
	 int a=org;
	 while (org>0) {
		 int rem= org%10;
		 cal= cal+(rem*rem*rem);
		 org= org/10;
	 }
		if(a==cal) {
		System.out.println(cal+" Armstrong number");}
		else
		System.out.println("Not a Armstrong number");
		
		//break;
	
		
		// Assign input into variable original 
		
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			
			
		
		// Check whether calculated and original are same
		
			//When it matches print it as Armstrong number
				

	}

}
