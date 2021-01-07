package ds.stack;

import java.util.Stack;

import org.junit.Test;

public class P002AdjacentDuplicates {

	/* 




	 */

	private String solution(String input){

		Stack<Character> stack = new Stack<>();
		
		for(char c: input.toCharArray()){
			char prevChar = stack.isEmpty()? ' ' : stack.peek();
			
			if(prevChar == c){
				stack.pop();
			}else
				stack.push(c);
			
		}
		
		

		return stack.toString();
	}

	@Test
	public void testData1(){

		String input= "abbaca";

		System.out.println(solution(input));

	}
	@Test
	public void testData2(){

		String input= "caca";

		System.out.println(solution(input));

	}
	@Test
	public void testData3(){

		String input= "ccc";

		System.out.println(solution(input));

	}
}
