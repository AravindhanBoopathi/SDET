package quick.test_1129;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class Aravind_Q2 {

	/*
	 *  
	2) Find the second least character in a given string
	  Example:
	  Input: "tesla-service" 
	  Output: s 

	     a) If there are more than one match, return the last match "aabbccc" -> 'b'
	     b) If there are no second match, return ''


pseudo-code:
	1. map the charcter with its occurence as value.
	
	2. find second min value using value 
	
	3. match the seoncd min value to find the key

	 */

	private char solution(String input1){

		char[] input = input1.toCharArray();
		char output=' ';
		int m = input.length,sm = input.length;
		Map<Character, Integer> map = new TreeMap<>();

		for(char c:input)
		map.put(c, map.getOrDefault(c, 0)+1);
		
		System.out.println(map);

		for(Entry<Character, Integer> e: map.entrySet()){
			
			int currentVal = (int) e.getValue();
			if (currentVal < m) 
            { 
                sm = m; 
                m = currentVal; 
            } 
  
            else if (currentVal < sm && currentVal != m) 
                sm = currentVal; 
			
		}
		
		if(sm == input.length ){
			return output;
		}
		
		for(Entry<Character, Integer> e: map.entrySet()){
			
			if(e.getValue() == sm){
				output = e.getKey();
			}
		}
		
		return output;
	}

	@Test
	public void testData1(){

		String input= "tesla-service";

		System.out.println(solution(input));

	}





}
