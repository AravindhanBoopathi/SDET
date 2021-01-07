package homework.ds.string;

import org.junit.Test;

public class P019NumberToRomans {
	
/*
input: 4
output: iv

input: 5
output: v

input: 6
output: vi
 	

*/
	
	String[] ones = {"", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix"};
	String[] tens = {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc", "c"};

	
	private String solution(int input){

		int quotient = input/10; // 2
		int remainder = input%10; // 0
		
		return tens[quotient]+ones[remainder];
	}

	@Test
	public void testData1(){

		int input= 44; // xliv

		System.out.println(solution(input));

	}

}
