package homework.ds.string;

import org.junit.Test;

public class P016LongestUniqueSubString {

	@Test
	public void testData1(){

		String str="abcabcbb";

		System.out.println(solution(str));

	}
	@Test
	public void testData2(){

	String str = "bbbbb";
	System.out.println(solution(str));

	}
	@Test
	public void testData3(){

		String str = "pwwkew";
		System.out.println(solution(str));

	}	

private String solution(String str){
		String substr =str.substring(0,1);
		String output =str.substring(0,1);
		char []ch = str.toCharArray();
		
		for (int i = 1; i < ch.length; i++) {
			if(substr.indexOf(ch[i])== -1) {
				substr = substr + ch[i];
					if(output.length() < substr.length()) {
						output = substr;
					}
			}
			else {
				substr=""+ch[i];
			}		
		}
		return output;
	}
	
	


}
