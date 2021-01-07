package revision.arrays.string;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P015Combinations {

/*	

Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
        The same repeated number may be chosen from C unlimited number of times.
        Example,
        Given candidate set 2,3,6,7,1 and target 7, 
        A solution set is:
        [2, 2, 3]
        [3,3,7]
        [2,2,2,1]
        [7]
        	
pseudo-code

2,3,6,7,1

)  

*/

	private List<List<Integer>> solution(int[] input, int target){
		
		List<List<Integer>> result = new ArrayList<>();
		
		List<Integer> comb = new ArrayList<>();

		int start = 0;int sum =0;
		combination(input, target,  result,  comb, start, sum);
		
		return result;
	}
	
	private void combination(int[] input, int target, List<List<Integer>> result, List<Integer> comb, int start, int sum){
		
		if((target - sum) == 0){
			result.add(comb);
			
		}
		if((target - sum) < 0){
			comb.remove(input[start]);
			start++;
			combination(input, target,  result,  comb, start, sum);
		}
		
		if((target - sum) > 0){
		sum += input[start];
		comb.add(input[start]);
		combination(input, target,  result,  comb, start, sum);
		
		}
		
	}
	
	

	@Test
	public void testData1(){

		int input[]= {2,3,6,7,1};
		int target=7;

		System.out.println(solution(input, target));

	}



}
