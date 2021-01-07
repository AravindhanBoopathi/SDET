package ds.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class P001SolveBrackets {

	
	/* 




	 */

	private Boolean isValid(String input){

		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		
		for(char c: input.toCharArray()){
			
			char currentChar = stack.pop();
			
			
			if(currentChar != map.get(currentChar))
			stack.pop();
			else
			stack.push(c);
			
		}
		
		return false;
	}

	@Test
	public void testData1(){

		String input= "(({}))";

		System.out.println(isValid(input));

	}
	
}
