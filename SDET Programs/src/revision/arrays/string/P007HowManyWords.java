package revision.arrays.string;

import org.junit.Test;

public class P007HowManyWords {


	private int solution(String sentence) {
		int many =0;
		String str[]= sentence.split(" ");
		for (String string : str) {
			if(string.matches("[a-zA-Z,?!:.-]+")){
				many++;
			} 
		}
		return many;
	}
	@Test 
	public void testData1(){

		String input = "abc";

		System.out.println(solution(input));

	}

}
