package quick.test_1227;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P02UpperLowerCase {
/*
2) Given a string S with both lowercase and uppercase letters, 
return the biggest ASCII letter that appears both in lowercase and uppercase. 
The returned letter must be in uppercase. If there is no such letter, return 'NO'.

Examples:
'aaabcAbCdD', return 'D'
'aA', return 'A'
'abcdE', return 'NO'
'a', return 'NO'

Pseudo-code:

- return Sting or 'No'

- initialize an ascii array[0 to 256] 


- loop the string and count it's occurence



- Check lowercase and UpperCase ascii value has occurence value  > 0 and return the char

	
*/	
	private String solution(String input){


		int[] ascii = new int[256];
		int lowerASCII = 90;
		int upperASCII = 122;
		String output = "NO";
	
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i < 26; i++){
			map.put(lowerASCII--, upperASCII--);
		}
		
		List<Map.Entry<Integer, Integer> > list = 
				new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet()); 
		
		for(int i=0; i<input.length(); i++){
			ascii[input.charAt(i)]++;
			
			if(input.charAt(i) < 91)
				if( ascii[map.get(input.charAt(i))] > 0 ) output = ""+input.charAt(i);
			
			if(input.charAt(i) > 91)
				if( ascii[0] > 0 ) output = ""+input.charAt(i);
					
		}
		
		
		
	
		
		
		
		return "";
	}

	@Test
	public void testData1(){

		String S= "aaabcAbCdD";

		System.out.println(solution(S));

	}
	
}
