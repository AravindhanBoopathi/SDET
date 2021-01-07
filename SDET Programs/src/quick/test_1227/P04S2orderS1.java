package quick.test_1227;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P04S2orderS1 {

	/* 
Sort based on another String
Given one string ('abbceeeg') sort it based on another string ('egbca')
Result will be: 'eeegbbca'
Do it less O[N2] => O[nlogn] => O[N]
String s1 ="abbceeeg";
String s2 = "egbca";
Lowercase Alphabets
No built sort functions !!

pseudo-code:
	- use map and find occurence of each char
	- loop through s2,
		find int ttemp =  map.get(s2.charAt(i)), print output.append(s2.charAt * temp time)

	 */

	private String solution(String s1, String s2){

		StringBuffer output = new StringBuffer();
		Map<Character, Integer> map = new HashMap<>();

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();


		for(Character c :c1)	map.put(c, map.getOrDefault(c, 0)+1);

		for(Character c : c2){

			int count = 0;

			try {  
				count = map.get(c);
			}catch (Exception e) {
				System.out.println("Invalid s2 input");
			}

			while(count-- > 0)	output.append(c);
			
		}
		return output.toString();
	}

	@Test
	public void testData1(){

		String s1= "abbceeeg"; 
		String s2= "egbca";

		System.out.println(solution(s1, s2));

	}

}
