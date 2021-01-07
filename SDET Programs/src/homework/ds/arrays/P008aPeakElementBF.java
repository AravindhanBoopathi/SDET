package homework.ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P008aPeakElementBF {

	/* 
	 8) Find the peak index in a mountain array

Input: arr = [0,1,0]
Output: 1

Input: arr = [0,10,5,2]
Output: 1

Input: arr = [10,-5,8,0]
Output: 1

Input: arr = [1,2,8,10]
Output: 3
 
Input: arr = [11,2,8,10]
Output: 0	
	  
	  1. Max = 0, Min = 0;
	  
	  2. Traverse input from i=0 to input.length
	  		if(input[i]<0) { 
	  		getMin(); 
	  		}
	  		Max = Math.max(input[i],max);
	  	
	  3. Traverse input from i=0 to input.length
	  		Min = Math.min(input[i],min);
	  	  
	*/
	
	
	private int findPeakUtil(int arr[], int low, int high, int n) 
    { 
        
        int mid = low + (high - low) / 2; 
        
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) 
            && (mid == n - 1 || arr[mid + 1] <= arr[mid])) 
            return mid; 
  

        else if (mid > 0 && arr[mid - 1] > arr[mid]) 
            return findPeakUtil(arr, low, (mid - 1), n); 
  
        else
            return findPeakUtil(arr, (mid + 1), high, n); 
    } 
   
    private int findPeak(int arr[]) 
    { 
    	System.out.println(Arrays.toString(arr));
        return findPeakUtil(arr, 0, arr.length - 1, arr.length); 
    } 
    
    @Test
	public void testData1(){
		int input[]= {0,1,0};
		System.out.println(findPeak(input));
	}
	@Test
	public void testData2(){
		int input[]= {-10,-5,-15,0};
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
