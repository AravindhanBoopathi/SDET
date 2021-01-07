package homework.ds.string;

import org.junit.Test;

public class P020WordsToNumber {
	
/*	

input: one hundred one
output: 101
	
	
*/

	String[] ones={"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	String[] tens= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
	private String solution(String s){

		String[] input = s.split(" ");
		
		int output = 0;
		
		for (int i = 0; i < input.length; i++) {
			for(int j = 0; j < ones.length; j++)
			output = input[i].indexOf(ones[j]);
		}
		
		return "";
	}

	@Test
	public void testData1(){

		String input= "one hundred one";

		System.out.println(solution(input));

	}
	
	
}
