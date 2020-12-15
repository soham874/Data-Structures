package LinkedLists;

import java.util.HashMap;

import LinkedLists.UtilitiesLL.Node;

public class LinkListPalindrome {

	public static HashMap<Integer, Integer> listitems = new HashMap<Integer, Integer>();

	public static void main(String[] args) {

		UtilitiesLL utilities = new UtilitiesLL();

		int[] array = { 1, 2, 3, 2, 1 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);
	
		Node node = UtilitiesLL.Node.start;
		int val = 1;
		while (node != null) {
			listitems.put(++val, node.data);
			node = node.next;
		}
		val--;
		
		for (int i = 1, j = val; i < val / 2 && j > val / 2; i++, j--)
			if (listitems.get(i+1) != listitems.get(j+1)) {
				System.out.println("Not palindrome.");
				System.exit(0);
			}
		
		System.out.println("Palindrome");
		 
	}
}
