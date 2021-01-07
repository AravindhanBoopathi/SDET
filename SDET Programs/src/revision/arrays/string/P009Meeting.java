package revision.arrays.string;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class P009Meeting {

	/* 




	 */

	private int solution(int[] startTime, int[] endTime){

		int max = 1;
		
		int sortedEndTime[] = Arrays.copyOf(endTime, endTime.length);
		int sortedIndex[] = new int[endTime.length];
		int sortedStartTime[] = new int[startTime.length];
		
		for(int i=0; i< endTime.length; i++){
			for(int j=i; j< endTime.length; j++){
			
				if(sortedEndTime[i]>sortedEndTime[j]){
					int temp = sortedEndTime[i];
					sortedEndTime[i] = sortedEndTime[j];
					sortedEndTime[j] = temp;
				}
			}
		}
		
		for(int i=0; i < sortedEndTime.length; i++){
			for(int j=0; j< endTime.length; j++){
				if(sortedEndTime[i] == endTime[j]){
					sortedIndex[i]= j;
					endTime[j]=-1;
				}
			}
		}
		
		
		for(int index = 0; index<startTime.length; index++){
			sortedStartTime[index] = startTime[sortedIndex[index]];
			
		}
		
		System.out.println("End Time Sorted Index: "+Arrays.toString(sortedIndex));
		System.out.println(Arrays.toString(sortedStartTime));
		System.out.println(Arrays.toString(sortedEndTime));
		
		for(int i=1 ,j=0; i<sortedStartTime.length; i++){
			if(sortedStartTime[i] >= sortedEndTime[j]){
				max++;
				j=i;
			}
		}
		
		return max;
	}

	private int solution1(int[] startTime, int[] endTime){

		int max = 1;
		
		List<Entry<Integer, Integer>> list = new ArrayList<>();
		
		for(int i=0; i< startTime.length; i++ ){
			list.add(new AbstractMap.SimpleEntry(startTime[i],endTime[i]));
		}
		
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>(){
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2){
					return o1.getValue().compareTo(o2.getValue());
				}
		});
		
		System.out.println(list);
		
		for(int i=1 ,j=0; i<startTime.length; i++){
			if(list.get(i).getKey() >= list.get(j).getValue()){
				max++;
				j=i;
			}
		}
		
		return max;
	}
	
	
	@Test
	public void testData1(){

		int startTime[]= {1, 2, 3};
		int endTime[]= {4, 3, 4};
		System.out.println(Arrays.toString(startTime));
		System.out.println(Arrays.toString(endTime));
		System.out.println(solution1(startTime, endTime));

	}
	
}
