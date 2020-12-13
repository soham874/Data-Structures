package LinkedLists;

import java.io.IOException;
import java.util.HashMap;

import LinkedLists.Utilities.Node;

public class LinkedListDuplicate {

	public static HashMap<Integer, Integer> listitems = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws IOException {

		Utilities utilities = new Utilities();

		int[] array = { 1, 2, 3, 5, 3, 2, 4, 1 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before deleting");
		Utilities.printList(Utilities.Node.start);
		Node previous = null;

		Node node = Utilities.Node.start;
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
		Utilities.printList(Utilities.Node.start);

	}

}
