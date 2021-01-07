package homework.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P005bMissingNumberOptimal {

private void printMissingNumbers(int[] array) {
		
		if(array.length<2){
			throw new IllegalArgumentException();
		}
		
		int large = array[0];
		int small = array[0];
		
		Set<Integer> setinput = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			
		   if(array[i]>large)
		   large=array[i];

		   if(array[i]<small)
		   small=array[i];
		   
		   setinput.add(array[i]);
		
		}
	    
	    for(int k = small; k < large ; k++) {
	    	if(!setinput.contains(k)) {
	    		list.add(k);
	    }
	}
	    System.out.println("Missing Integers : "+list);
	}

	@Test
	public void testData1(){
		int input[]= {4,3,2,7,8,2,2,2,3,1};
		printMissingNumbers(input);
	}

	@Test
	public void testData2(){
		int input[]= {-1,-4,-5,1,2,3,3};
		printMissingNumbers(input);
	}
	
	@Test
	public void testData3(){
		int input[]= {-1,-1,1,3,0,2};
		printMissingNumbers(input);
	}

	@Test
	public void testData4(){
		int input[]= {1};
		printMissingNumbers(input);
	}
}
