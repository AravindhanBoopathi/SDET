package ds.string.homework;

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
2
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
	
*/
	
private void solution(int[] input){
		
	int odd = 0, even = 0;
	
		for(int i=0; i< input.length+1/2; i++){
			odd += input[i];
			i++;
		}
		for(int i=1; i< input.length/2; i++){
			even += input[i];
			i++;
		}
	
		System.out.println(Math.max(odd, even));
		
	}
	
	@Test
	public void testData1(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {1, 2, 3, 4, 5}; 
		
		solution(input);

	}

	@Test
	public void testData2(){

//		int numberOfTestCase = 2;
//		int numberOfMonsters = 5;
		int input[] = {10}; 
		
		solution(input);

	}
	
	
}
