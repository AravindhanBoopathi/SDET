package homework.ds.string;

import org.junit.Test;

public class P007Farida {

/*	

Once upon time there was a cute princess called Farida living in a castle with her father, mother and uncle. 
On the way to the castle there lived many monsters. Each one of them had some gold coins. 
Although they are monsters they will not hurt. 
Instead they will give you the gold coins, but if and only if you didn't take any coins from the monster directly before the current one. 
To marry princess Farida you have to pass all the monsters and collect as many coins as possible. 
Given the number of gold coins each monster has, calculate the maximum number of coins you can collect on your way to the castle.

Input
The first line of input contains the number of test cases. 
Each test case starts with a number N, the number of monsters, 0 <= N <= 10^4. 
The next line will have N numbers, number of coins each monster has, 0 <= The number of coins with each monster <= 10^9. 
Monsters described in the order they are encountered on the way to the castle.

Output
For each test case print �Case C: X� without quotes. 
C is the case number, starting with 1. X is the maximum number of coins you can collect.

Input:
20 1 1 10 1
5
1 2 3 4 5 6
1
10

Output:
Case 1: 9
Case 2: 10

---


Pseudo-code:

	- add odd index values
	- add even index values
	
	print Max(odd,even);
	

	
private void solution(int[] input){
		
	int odd = 0, even = 0;
	int odd2 = 0, even2 = 0;
	int odd3 = 0, even3 = 0;
	int index = 0;
	
	
	
		for(int i=0; i<= input.length/2; i++){
			odd += input[index];
			index+=2;
		}
		index=1;
		for(int i=1; i<= input.length/2 + 1; i++){
			even += input[i];
			index+=2;
		}
	
//		20, 1, 1, 20, 1, 1, 20
		if(input.length>3){
		index=0;	
		for(int i=0; i< input.length/3 + 1; i++){
			
			odd2 += input[index];
			index += 3;
			
		}
		
		index =1;
//		1, 20, 1, 1, 20, 1, 1, 20
		for(int i=1; i< input.length/3 + input.length%3; i++){
			even2 += input[index];
			index += 3;
		}
		
		
		
		}
		
		System.out.println( Math.max(even3, Math.max(odd3,  Math.max(even2, Math.max(odd2, Math.max(even, odd)))))  );
		
	}
*/

private static long splitAndTraverse(int[] arr, int currentIndex, boolean lastKollected){
	if(currentIndex == arr.length-1){
		return 0;
	}
	if(lastKollected){
		return splitAndTraverse(arr, currentIndex + 1, false);
	}
	
	long unselectedPath = splitAndTraverse(arr, currentIndex + 1, false);
	long selectedPath = splitAndTraverse(arr, currentIndex + 1, true) + arr[currentIndex];
	return Math.max(selectedPath, unselectedPath);



}





/*
	@Test
	public void testData1(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {20, 1, 20}; 
		
		solution(input);

	}

	@Test
	public void testData2(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {1, 20, 1}; 
		
		solution(input);

	}
	
	@Test
	public void testData3(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {20, 1, 1, 20, 1, 1, 20}; 
		
		solution(input);

	}

	@Test
	public void testData4(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {1, 20, 1, 1, 20, 1, 1, 20}; 
		
		solution(input);

	}
*/	
	@Test
	public void testData5(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {1, 2, 3, 4, 5, 6, 7, -1}; 
		
		System.out.println(splitAndTraverse(input, 0, false));

	}
/*
	@Test
	public void testData6(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {10,10,10}; 
		
		solution(input);

	}
*/	
}
