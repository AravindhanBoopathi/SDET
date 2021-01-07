package revision.arrays.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class P018ArrayIntersection {

	/* 




	 */

	private Set<Integer> solution(int[] a, int[] b){

		Set<Integer> output = new HashSet<>();
		
		String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));
		
//		Set<Integer> set1 = Arrays.stream(a).collect(Collectors.toSet());
//		Set<Integer> set2 = new HashSet<>(Arrays.asList(b));

		
		
		return output;
	}

	@Test
	public void testData1(){

		int[] a = {1,1,2,3,4};
		int[] b = {1,2};


		System.out.println(solution(a,b));

	}

	
}
