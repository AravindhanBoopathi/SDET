package homework.ds.string;

import java.math.BigInteger;

import org.junit.Test;

public class P013PrimeCombination {

	/*	

Given a number, find all the combination of the prime number 
[without changing the sequence]

input:  38
output:  3	

input:  403198305
output:  	

input: 44
output: 

---

pseudo-code:	



	 */	


	private void solution(String input){
		for(int i=0; i<input.length(); i++){
			if((Integer.parseInt(input.substring(i,i+1)))!=0){
				for(int j=i+1; j<input.length(); j++){


					// Converting long to BigInteger 
					BigInteger b = new BigInteger(input.substring(i, j));  // O(N)

					if( b.isProbablePrime(1))
						System.out.println(input.substring(i, j)); 
				} 
			}
		}



	}

	private void solution1(String inputstring){

		int start = 0;
		combine(start);

	} 

	public void combine(int start){

		StringBuilder output = new StringBuilder();
		String inputstring = "wxyz";
		
		for( int i = start; i < inputstring.length(); ++i ){
			output.append( inputstring.charAt(i) );
			System.out.println( output );
			if ( i < inputstring.length() )
				combine( i + 1);
			output.setLength( output.length() - 1 );
		}
	}


	//  wxyz - 


	//	@Test
	//	public void testData1(){
	//
	//		String input= "38";
	//
	//		solution(input);
	//
	//	}

	@Test
	public void testData2(){

		String input= "403198305";

		solution1(input);

	}
}
