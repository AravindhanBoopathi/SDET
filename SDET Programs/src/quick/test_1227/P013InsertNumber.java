package quick.test_1227;

import org.junit.Test;

public class P013InsertNumber {

/*	
3) Find the maximum possible value by inserting '5'
Examples:
input: 1234 -> output: 51234
input: 7643 -> output 76543
input: 0 -> output 50
input: -661 -> output -5661	
	
*/
	
	private int solution(int input, int k){

		int numDigits = String.valueOf(input).length();
		
		int ten = (int)Math.pow(10, numDigits--);
		int temp =0;
		if(input > 0){
			while(ten > 1){
				temp = input%ten;
				if(input/ten < k) return k*ten + input;
				
				
			}
		}
			
		
		return input/ten;
	}

	@Test
	public void testData1(){

		int input= 1234;
		int k=5;

		System.out.println(solution(input,k));

	}

}
