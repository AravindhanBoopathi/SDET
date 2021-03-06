package revision.arrays.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class P003LargestString {

	/*
	 * Given a string, construct a new string by rearranging the original string
	 * and deleting characters as needed. Return the alphabetically largest
	 * string that can be constructed respecting a limit as to how many
	 * consecutive characters can be the same.
	 * 
	 * 
	 * 
	 */

	private String solution(String input, int k) {

		char[] strInput = input.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : strInput) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}


		List<Entry<Character, Integer>> list = new LinkedList<Entry<Character, Integer>>(map.entrySet());
		// sorting the list elements
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

				return o2.getKey().compareTo(o1.getKey());
			}
		});

		System.out.println(list);

		List<Character> output = new ArrayList<Character>();

		Entry<Character, Integer> currentEntry = list.get(0);

		while(currentEntry.getValue() > 0){			

			if(list.size()==1){
				int printTimes = currentEntry.getValue() > k? k:currentEntry.getValue();

				while (printTimes > 0) {
					output.add(currentEntry.getKey());
					currentEntry.setValue(currentEntry.getValue() - 1);
					printTimes--;
				}

				if(list.get(0).getValue() > 0){
					
					
					char c = currentEntry.getKey();
					
					while(currentEntry.getValue() > 0){	
						try{

							int lastSize = output.size();
							
							int index = findIndex(lastSize, output, c, k);
							System.out.println(index);

							output.add(index , currentEntry.getKey());
							currentEntry.setValue(currentEntry.getValue() - 1);
							
							
//							int count = k;
//							while(count>0){
								
//								index--;
//								count--;
//							}

						}catch(IndexOutOfBoundsException e){
							break;
						}
					}
				}else{
					break;
				}
			}
			if(list.size()>1){

				int printTimes1 = currentEntry.getValue() > k? k:currentEntry.getValue();

				if(printTimes1 < k){
					while (printTimes1 > 0) {
						output.add(currentEntry.getKey());
						currentEntry.setValue(currentEntry.getValue() - 1);
						printTimes1--;
					}

				}
				else{
					while (printTimes1 > 0) {
						output.add(currentEntry.getKey());
						currentEntry.setValue(currentEntry.getValue() - 1);
						printTimes1--;
					}

					if (list.get(1).getValue() > 0) {
						output.add(list.get(1).getKey());
						list.get(1).setValue(list.get(1).getValue() - 1);

					}

					if (list.get(1).getValue() == 0) {
						list.remove(1);

					}
				}

				if (list.get(0).getValue() == 0) {
					list.remove(0);

				}
				if(!list.isEmpty()){
					currentEntry = list.get(0);
				}

			}


		}


		return output.toString();

	}

	public int findIndex(int lastIndex, List<Character> output, char c1, int k){

		//		ccabaa      a-7

		int count = 0;
		
		for(int i=lastIndex-1; i>=0; i--){
			char c2 = output.get(i);
			char c3 = output.get(i-1);
			
			if(c1 == c2){
				count++;
			}
			
			if(c1 == c2 && c1 != c3 && count<=k){
				return i-1 ;
			}
			
			
			if(c1 != c2 && c1 != c3){
				return i-1 ;
			}
			
			
		}
		
		return -1;
		
	}

	@Test
	public void testData1() {

		String input = "baaaaacc";
		//		caacaabaa

		int k = 2;

		System.out.println(solution(input, k));

	}

//	@Test
//	public void testData2() {
//
//		String input = "bbbbbbaccc";
//		//		ccbcbbabb
//		int k = 2;
//
//		System.out.println(solution(input, k));
//
//	}
//
//
//	@Test
//	public void testData3() {
//
//		String input = "aazzzzc";
//		int k = 2;
//		System.out.println(solution(input, k));
//
//	}
//
//	@Test
//	public void testData4() {
//
//		String input = "aazzzzzzc";
//		int k = 3;
//		System.out.println(solution(input, k));
//
//	}


}
