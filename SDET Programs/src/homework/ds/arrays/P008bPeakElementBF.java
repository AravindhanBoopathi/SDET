package homework.ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P008bPeakElementBF {
	
	
	private int findPeak(int arr[]) {
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		 if (n == 1)  
		      return arr[0]; 
		    if (arr[0] >= arr[1]) 
		        return 0; 
		    if (arr[n - 1] >= arr[n - 2]) 
		        return n - 1; 
		  
		    for (int i = 1; i < n - 1; i++) { 
		   
		        if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) 
		            return i; 
		    }
			return 0;
	}
	
	@Test
	public void testData1(){
		int input[]= {0,1,0};
		System.out.println(findPeak(input));
	}
	@Test
	public void testData2(){
		int input[]= {10,5,1,0};
		System.out.println(findPeak(input));
	}
	@Test
	public void testData3(){
		int input[]= {2,8,13,10};
		System.out.println(findPeak(input));
	}
	@Test
	public void testData4(){
		int input[]= {1,16,5,15,3,20};
		System.out.println(findPeak(input));
	}

}
