package LinkedLists;

import LinkedLists.UtilitiesLL.Node;

public class LinkedListLastToFront {

	public static Node n;

	public static void main(String[] args) {
		UtilitiesLL utilities = new UtilitiesLL();

		int[] array = { 0, 1, 2, 3, 4 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before swapping");
		UtilitiesLL.printList(UtilitiesLL.Node.start);

		n = UtilitiesLL.Node.start;

		while (n.next != null)
			n = n.next;

		movetofirst();

		System.out.println("After swapping");
		UtilitiesLL.printList(UtilitiesLL.Node.start.previous);
	}

	private static void movetofirst() {

		n.next = UtilitiesLL.Node.start;
		UtilitiesLL.Node.start.previous = n;

		n.previous.next = null;
		n.previous = null;

	}
}
