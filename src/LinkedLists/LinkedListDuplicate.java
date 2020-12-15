package LinkedLists;

import java.io.IOException;
import java.util.HashMap;

import LinkedLists.UtilitiesLL.Node;

public class LinkedListDuplicate {

	public static HashMap<Integer, Integer> listitems = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws IOException {

		UtilitiesLL utilities = new UtilitiesLL();

		int[] array = { 1, 2, 3, 5, 3, 2, 4, 1 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before deleting");
		UtilitiesLL.printList(UtilitiesLL.Node.start);
		Node previous = null;

		Node node = UtilitiesLL.Node.start;
		while (node != null) {

			if (listitems.containsKey(node.data)) {
				previous.next = node.next;
			} else {
				listitems.put(node.data, 1);
				previous = node;
			}
			node = node.next;

		}

		System.out.println("After deleting");
		UtilitiesLL.printList(UtilitiesLL.Node.start);

	}

}
