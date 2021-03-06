package homework.ds.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class P014SecondLeastRepeatingChar {

	/* 
Find the second least repeating character in a given String

input: paypal (p-2,
 				a-2, 
 				 y-1,
 				  l-1)
output: a and p

aalppy

input: aravindhan
 		a - 3
		r - 1
		v - 1
		i - 1
		n - 2
		d - 1
		h - 1

output: n

input: aaa
output: []

input: aab
output: a

input: aanbu
output: a

1 - min
if(count>min)
2 - Smin= min(count, Smin)



Questions:

1. Second repeating Character in the least count

2. More than one characters having same second least count
 	- we assumed to print the first matching character sorted in ascending order

3. case-sensitive
	- no

Pseudo-code:

 BF : 

 paypal
	 */

	private void solution(String input){

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i<input.length(); i++)	
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);

		


		List<Entry<Character, Integer>> list = new LinkedList<Entry<Character, Integer>>(map.entrySet());
		// sorting the list elements
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println(list);
		
		int min = list.get(0).getValue(), smin = Integer.MAX_VALUE;

		for(int i=1; i<list.size(); i++){

			if(list.get(i).getValue() > min){
				smin = Math.min(list.get(i).getValue() , smin);
			}

		}

		if(smin==Integer.MAX_VALUE){
			System.err.println("Invalid input");
		}

		for(Entry<Character, Integer> e: map.entrySet()){

			if(e.getValue() == smin){
				System.out.println(e.getKey());
			}

		}	




	}

	@Test
	public void testData1(){

		String input = "paypal";

		solution(input);

	}

	@Test
	public void testData2(){

		String input = "ppp";

		solution(input);

	}

	@Test
	public void testData3(){

		String input = "aaa";

		solution(input);

	}



}
