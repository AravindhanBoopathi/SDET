package ds.arrays.string.assessment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P008ShortestSubString {

	/*
	 * Complete the 'shortestSubstring' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts STRING givenString as parameter.
	 */

	public static int shortestSubstring(String givenString) {
		// Write your code here
		int min = givenString.length();
		char []input = givenString.toCharArray();

		// Character[] ch = Character.valueOf(input);

		Set<Character> set = givenString.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
		// String.stream(givenString).collect;

		System.out.println(set);



		for(int i=0; i<givenString.length() - (set.size() - 1); i++){
			int count=0;
			Set<Character> set1 = new HashSet<Character>();

			for(int j=i; j<givenString.length(); j++){
				set1.add(input[j]);
				count++;

				if(set1.size() == set.size()){
					min = Math.min(count, min);
					break;
				}

			}     

		}

		return min;
	}




	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String givenString = bufferedReader.readLine();

		int result = P008ShortestSubString.shortestSubstring(givenString);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}



