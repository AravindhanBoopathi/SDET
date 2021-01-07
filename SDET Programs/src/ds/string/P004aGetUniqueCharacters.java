package ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P004aGetUniqueCharacters {

	/*
	 * getFirstIndex and lastindex
	 * 
	 * map - value = 1
	 * 
	 * BF
	 * 
	*/
	@Test
	public void getUnique(){
		
		
		String s = "Aravindhan";
		int k = 2;
		int m = s.length();
		int sm = s.length();
		
		char lastChar= ' ';
		
		int[] asc = new int[256];
		
		 
		for(int i=0; i< s.length(); i++){
			
			asc[s.charAt(i)]++;
			
			if(asc[s.charAt(i)] < m){
				sm = m;
				m = asc[s.charAt(i)];
			}else if(asc[s.charAt(i)] < sm && m != asc[s.charAt(i)]){
				sm = asc[s.charAt(i)];
			}
		}  
		
		for(int i=0; i< s.length(); i++){
			
			if(sm == asc[s.charAt(i)])
				lastChar = s.charAt(i);
			
		}
		
		System.out.println("Second Least Character : "+lastChar);
		
		
	}
	
}
