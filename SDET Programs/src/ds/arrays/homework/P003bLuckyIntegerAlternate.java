package ds.arrays.homework;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P003bLuckyIntegerAlternate {

	/*
	 2) Given an array of integers, a lucky integer is an integer 
	 	which has a frequency in the array equal to its value.

		Return a lucky integer in the array. 
		If there are multiple lucky integers return the largest of them. 
		If there is no lucky integer return -1.

		Input: [1,2,3,3,4,4,4,4,5]
		Output: 4
		Explanation: 1, 2 and 4 are all lucky numbers, but 4 is the largest
	
		-----
	
		Input: [1,2,3,3,4,4,4,4,5]
		Output: 4
				
		Input: [5]
		Output: -1
		
		Input: [1,1,1]
		Output: -1
		
		Input: [0,-5,-5,-5,-5,-5]
		Output: illegal argument
		-----
		
		Pseudo-code:
		
		1. int luckyNumber = -1;
		
		2. Traverse input array till its length - current element 
			i. if(input[i] <= 0), throw illegal argument exception
				int count = 0;
				
			ii. Traverse input array from i+1 till its length - next element
		 		a. if(input[i] == input[j]){
		 				count++;
		 			}
		 		b. Lucky Number? - if(input[i] == count){
		 				luckyNumber = Math.max(luckyNumber,input[i]);
		 			}
		 3.	return lucky number
	
	*/
	
	private int solution(int[] input){
		
		int luckyNumber = -1;
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i:input){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else
			map.put(i, 1);
						
		}
		
		System.out.println(map);
		
		 for (Map.Entry<Integer,Integer> entry : map.entrySet()){
		
			 
			 if(Math.abs(entry.getKey()) == entry.getValue()){
				 
				 if(entry.getKey() < 0 ){
					 luckyNumber = Math.min(luckyNumber, entry.getKey());
				 }
				 else
					 luckyNumber = Math.max(luckyNumber, entry.getKey());
			 }
			 
			 
	            	      	
	    } 
		
		return luckyNumber;
	}
	
	@Test
	public void testData1(){

		int input[]= {1,2,3,3,4,4,4,4,5};

		System.out.println(solution(input));

	}

	@Test
	public void testData2(){

		int input[]= {1,1,1};

		System.out.println(solution(input));

	}
	@Test
	public void testData3(){

		int input[]= {5};

		System.out.println(solution(input));

	}
	@Test
	public void testData4(){

		int input[]= {0,-5,-5,-5,-5,-5,-3,-3,-3};

		System.out.println(solution(input));

	}
	
	
	
}
