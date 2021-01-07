package revision.arrays.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P004SubsequenceRemoval {

	/*

Given an array of positive integers, find the minimum length ascending subsequence such that after removing this subsequence from the array, 
the remaining array contains only unique integers. Only one subsequence will have the minimum length (no ties). 
If there is no such subsequence, return [-1].
   
Example 
n = 7 
arr =  [2, 1, 3, 1, 4, 1, 3] 


	 */	


	private void solution(int[] input){

		List<Integer> list = new ArrayList<Integer>();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i: input){

			map.put(i, map.getOrDefault(i, 0)+1);
			
			if(map.get(i)>1){
				 list.add(i);
				}
			
			

		}
		
		
		if(list.isEmpty()){
			System.out.println(-1);
		}

		int low=0, high =1;
		for(int i=0; i< list.size()-1; i++){
			if(list.get(i)<=list.get(i+1)){
				high++;
			}
			if(list.get(i)>list.get(i+1)){
				low = i+1;
			}
		}

		for(int i=low; i < high; i++){
			System.out.println(list.get(i));
		}



		
	}

	@Test
	public void testData1(){

		int input[]= {2, 1, 3, 1, 4, 1, 3};

		solution(input);

	}



}
