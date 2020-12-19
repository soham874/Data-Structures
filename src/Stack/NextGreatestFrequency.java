package Stack;

import java.util.Arrays;
import java.util.HashMap;

public class NextGreatestFrequency {
	static HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
	UtilityS utility = new UtilityS();

	public static void main(String[] args) {

		int[] input = { 1, 1, 2, 3, 4, 2, 1 };
		int[] inputfreq = new int[input.length];

		for (int i = 0; i < input.length; i++)

			if (!frequencies.containsKey(input[i]))
				frequencies.put(input[i], 1);
			else {
				int val = frequencies.get(input[i]);
				frequencies.put(input[i], ++val);
			}
		
		for (int i = 0; i < input.length; i++)
			inputfreq[i] = frequencies.get(input[i]);
		
		System.out.println(Arrays.toString(inputfreq));
		NextGreatestElement.nextGreatestElement(inputfreq);

	}
}