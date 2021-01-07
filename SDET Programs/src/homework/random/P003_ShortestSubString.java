package homework.random;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class P003_ShortestSubString {

	/*
	s1: abdcba
	s2: abc
	
	Pseudo-code:
	
	0. Declare variable i = s2.length();
		add s2 in a list
		left, right = 0;
		shortestString
	1. Find windowString (s1.subString(0,i))
	
	2. While(right < windowString.size())
		
		if(list.isEmpty()){
			left++;
			right = left;
			shortestString = (shortestString.size()<windowString.size())? shortestString : windowString; 
		}
		
		if(list.contains(windowString.charAt(right))){
			list.remove(windowString.charAt(right++));
		}
		
		if(right==window.size()-1 && right < s1.length()){
			windowString = (s1.subString(left,++right);
		}
		
	
	*/
	private String solution(String s1, String s2){

		int left = 0, right = 0;
		String shortestSubString = s1;
		
		List<Character> list = s2.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		String windowString = s1.substring(left, s2.length());
		
		while(right < windowString.length()){
			
			if(right==windowString.length()-1 && right <= s1.length()){
				windowString = s1.substring(left, right+2);
			}
			
			if(list.contains(windowString.charAt(right))){
				
				list.remove(new Character(windowString.charAt(right)));
			}
			
			if(list.isEmpty()){
				left++;
				right = left;
				list = s2.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
				shortestSubString = (shortestSubString.length() < windowString.length())? 
						shortestSubString : windowString;
			}
			
			if(!list.isEmpty()){
				right++;
			}
			
			
		}
		
		
		return shortestSubString;
	}

	@Test
	public void testData1(){

		String s1= "abdcba";
		String s2= "abc";
		System.out.println(solution(s1,s2));

	}
	
	
}
