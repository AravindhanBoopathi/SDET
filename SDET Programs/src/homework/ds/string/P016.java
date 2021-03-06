package homework.ds.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class P016 {

	/*
	 * 
	 * aazzzzc k = 2
	 * 
	 * zzczzaa
	 * 
	 * aazzzz k = 2
	 * 
	 * zzazza
	 * 
	 */

	private String solution(String input, int k) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// ArrayList<Character> sortedKeys = new
		// ArrayList<Character>(map.keySet());
		//
		// Collections.sort(sortedKeys);

		List<Entry<Character, Integer>> sortedEntries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

		Collections.sort(sortedEntries, new Comparator<Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> a, Entry<Character, Integer> b) {
				return b.getKey().compareTo(a.getKey());
			}
		});

		System.out.println(sortedEntries);

		Boolean flag = true;
		while (flag) {
			int p = 0, i = 0;
			boolean next = false;
			while (p < k || next) {
				int c = next ? 1 : k;
				if(i== sortedEntries.size()){
					flag = false;
					break;
				}
				char khar = sortedEntries.get(i).getKey();
				int val = sortedEntries.get(i).getValue();
			    
				if (val > 0) {
					int times = val > c ? c : val;

					for (int j = 0; j < times; j++) {
						System.out.print(khar);
					}
					map.put(khar, val - times);

					if(times == k && next == false) {
					 next = true;	
					} else {
						next = false;
					} 
					p = p + times;
				}
				i++;
			}
		}

		return " ";
	}

	@Test
	public void testData1() {

		String input = "aazzzzc";
		int k = 2;
		System.out.println(solution(input, k));

	}

	@Test
	public void testData2() {

		String input = "aazzzzzzc";
		int k = 3;
		System.out.println(solution(input, k));

	}
	 
	@Test
	public void testData3() {

		String input = "aaaaaaaaaaaabcc";

//		ccbaaa
		
//		aaacaaacaaabaaa
		int k = 3;
		System.out.println(solution(input, k));

	}
	
}

/*
public static int howMany(String sentence) {
        int many =0;
    String str[]= sentence.split(" ");
    for (String string : str) {
        if(string.matches("[a-zA-Z,?!:.-]+")){
          many++;
        } 
    }
    return many;
}

// Arrays.sort(input1);
    
    
    
    // char[] input = new char[input1.length];
    // int j=0;
    // for(int i = input.length - 1; i >= 0; i--) {
    //     input[j] = input1[i];
    //     j++;
    // }
    
    // List<Character> output = new ArrayList<>(input.length);
    // List<Character> extra = new ArrayList<>();
    
    // int count =1;
    // for(char c: input){
    //     if(output.contains(c)){
    //         count++;   
    //     }else{
    //         count = 1;
    //     }
    //     if(count <= k){
    //         output.add(c); 
    //     }else{
    //         extra.add(c); 
    //     }
    // }
    
    // zzzzza
    // zza
    // zzz
    // zzazz
    // baccc
    // ccba
    // c



*/