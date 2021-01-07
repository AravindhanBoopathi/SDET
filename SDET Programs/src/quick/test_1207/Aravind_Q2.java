package quick.test_1207;

import java.util.Arrays;

import org.junit.Test;

public class Aravind_Q2 {

//Most repeating number in an array	
	
	private void solution(int[] input){

		 
		int[] asc = new int[10];
		int max = 0;
		
		for(int i:input){
			asc[i]++;
			max = Math.max(asc[i], max);
		}
		System.out.println(Arrays.toString(asc));
		for(int i: input){
			if(asc[i] == max)	System.out.println(i);
		}
		
	}

	@Test
	public void testData1(){

		int input[]= {1,1,1,2,2,3};

		solution(input);

	}
	
	@Test
	public void testData2(){

		int input[]= {1,1,2,2,3};

		solution(input);

	}

	
}
