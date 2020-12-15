package LinkedLists;

import java.util.HashMap;

import LinkedLists.UtilitiesLL.Node;

//prints the number of occurance of each value in a linked list

public class LinkedListOperations {

	static HashMap<Integer, Integer> alphabets = new HashMap<Integer, Integer>();

	public static void main(String[] args) {

		UtilitiesLL utilities = new UtilitiesLL();

		int[] array = { 1, 2, 2, 3, 5, 6, 6, 7, 8, 8 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		checkOccurance(UtilitiesLL.Node.start);

		System.out.println(alphabets);
	}

	private static void checkOccurance(Node checkFrom) {

		while (checkFrom != null) {

			int val = 0;

			if (alphabets.containsKey(checkFrom.data))
				val = alphabets.get(checkFrom.data);

			alphabets.put(checkFrom.data, ++val);

			checkFrom = checkFrom.next;
		}

	}

}
