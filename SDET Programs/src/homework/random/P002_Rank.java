package homework.random;

import org.junit.Test;

public class P002_Rank {

/*
 * 
 * Problem 1 as of 12/10:
 	
Shortest form of array with rank

Sample input#1: 

input : [10,2,1,4,10,2,5,13,5]

output : 
1) you should get all the duplicates form of array first 
	[10,2,1,4,10]
	[2,1,4,10,2]
	[5,13,5]

2) then you should cut down to [5,13,5] (here all have same repetitions in the array thats why we are going with less count)

3) final output should be: 
[5,13,5] with rank 2 (rank is repeation of digits in the shortest array)

Sample input #2: 

input : [2,1,2,3,5,3,3]

here output should be [3,5,3,3] with rank 3 

the most preference is rank than array size.
	
	
*/	
	
	@Test
	public void testData1(){

		int[] input= {10,2,1,4,10,2,5,13,5};

		System.out.println(findRank(input));

	}
	
	@Test
	public void testData2(){

		int[] input= {2,1,2,3,5,3,3};
		
		System.out.println(findRank(input));

	}

	@Test
	public void testData3(){

		int[] input= {2,1,2,3,5,3,3};
		
		System.out.println(findRank(input));

	}
	
	@Test
	public void testData4(){


		int[] input= {2,1,2,3,5,3,3};
		
		System.out.println(findRank(input));

	}
	
	@Test
	public void testData5(){


		int[] input= {2,1,2,3,5,3,3};
		
		System.out.println(findRank(input));
	}
	
	@Test
	public void testData6(){


		int[] input= {2,1,2,3,5,3,3};
		
		System.out.println(findRank(input));

	}
	
	/* Pseudo-code:
Traverse from left to right
if(ascii[input[i]] > dupMax)
	dupMax = ascii[input[i]]
  


	dupMax
	subArrLengthMax
	
	*/
	public int findRank(int[] arr){
		
		return 0;
	}
	
}
