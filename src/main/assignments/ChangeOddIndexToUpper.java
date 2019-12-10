package week1.assignments;

import java.util.Locale;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		
	
				String test = "changeme";
				
				//
				
				for(int i=0;i<test.length();i++) {
					char[] data = test.toCharArray(i);
					
					if(i%2 == 0) {
					
					System.out.println(Character.toUpperCase(test.toCharArray()));
						
							System.out.println(s1);
			
					}
					
					
				}
			
				
			}

			//	{
			//	System.out.println(test.toUpperCase());
			//	i++;}
			//	char[] data = test.toCharArray();
		//Build a logic  to change the odd index to uppercase (output:cHaNgEmE)
				//Pseudo Code: 
			//	a) Convert the String to character array
			//	b) Traverse through each character (using loop)
				//c) find the odd index within the loop (use mod operator)
				//d) within the loop, change the character to uppercase if the index is odd else don't change
				//   (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);
			
				

	}


