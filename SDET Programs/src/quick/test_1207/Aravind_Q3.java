package quick.test_1207;

import org.junit.Test;

public class Aravind_Q3 {

	//	Reverse the sentence

	/* pseudo-code:
	1. split the string
	2. loop each sub-string and print the reverse string 

	 */	
	private String solution(String input){

		StringBuffer output = new StringBuffer();
		String[] subInput = input.split(" ");

		for(int i=1; i<subInput.length; i+=2){

			StringBuffer reverse = new StringBuffer(subInput[i]);
			subInput[i] = reverse.reverse().toString();

		}
		for(int i=subInput.length-1; i>=0; i--){
			if(i==0){	
				output.append(subInput[i]);
				break;
			}
			output.append(subInput[i]+" ");

		}
	
		return output.toString();
	}

	@Test
	public void testData1(){

		String input= "There is no test";

		System.out.println(solution(input));

	}


}
