package day6.classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;

public class mapName {

	public static void main(String[] args) {
		
		String name="vijayalakshmi";
		char[] charArray = name.toCharArray();
		
		Map<Character, Integer> mapName1=new HashMap<>(); 
		//for(Entry <Character><Interger> Object = Map.entrySet()) {
		

		// TODO Auto-generated method stub
		for (int i = 0; i < charArray.length; i++) {
			if(mapName1.containsValue(i)) {
			
		}
					else {
						mapName1.put(null, i);}
		}}

	//System.out.println(mapNmae.get());
}