package ds.string;

import java.util.Arrays;

import org.junit.Test;

/* Reverse a Sting
 * 
  input = "SDET"
  output = "TEDS"
  
  input = "MADAM"
  output = "MADAM"
  
  input = "MMMM"
  output = "MMMM"
  
  BF:
    
  1. tocharArray()
  
  2. Traverse from i = 0 till String.length
  	i. 
  
  toCharArray - aravind
  charAt - vinoth
  StringBuilder - dass
  String.reverse - praveen
  
  StringBuilder.reverse - surrogate
  charArray.length - property faster
  string.length() - method
  
  
  2 pointertechnique

*/
public class P001aStringReverse {

private String solution1(String input){
		
		
		
		
		return input;
	}

private String solution2(String str){
	
	
    String output ="";
    for (int i = str.length()-1; i >=0; i--) {
        output +=str.charAt(i);
    }
    System.out.println(output);

	
	return output;
}


	@Test
	public void testData1(){

		String input= "SDET";

		System.out.println(solution1(input));
		System.out.println(solution2(input));
		
	}
	
	
}
