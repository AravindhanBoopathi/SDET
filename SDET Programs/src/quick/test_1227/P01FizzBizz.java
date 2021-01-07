package quick.test_1227;

import java.util.Arrays;

import org.junit.Test;

public class P01FizzBizz {

	/* 
	 
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
For numbers which are multiples of both three and five output “FizzBuzz”.
n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

pseudo-code:
1. Traverse from 1 to n
	if(n%3 == 0 && n%5 == 0) then output[n-1] = "FizzBuzz"
	if(n%3 == 0 ) then output[n-1] = "Fizz"
	if(n%5 == 0 ) then output[n-1] = "Buzz"


	 */

	private String[] solution(int input){

		String[] output = new String[input];
		
		for (int i = 1; i <= input; i++) {
			if(i%3 == 0 && i%5 == 0) output[i-1] = "FizzBuzz";
			else if(i%3 == 0) output[i-1] = "Fizz";
			else if(i%5 == 0) output[i-1] = "Buzz";
			else output[i-1] = ""+i;
		}
		
		
		return output;
	}

	@Test
	public void testData1(){

		int input= 15;

		System.out.println(Arrays.toString(solution(input)));

	}

	
	
}
