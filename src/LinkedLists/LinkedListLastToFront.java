package LinkedLists;

import LinkedLists.Utilities.Node;

public class LinkedListLastToFront {

	public static Node n;

	public static void main(String[] args) {
		Utilities utilities = new Utilities();

		int[] array = { 0, 1, 2, 3, 4 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before swapping");
		Utilities.printList(Utilities.Node.start);

		n = Utilities.Node.start;

		while (n.next != null)
			n = n.next;

		movetofirst();

		System.out.println("After swapping");
		Utilities.printList(Utilities.Node.start.previous);
	}

	private static void movetofirst() {

		n.next = Utilities.Node.start;
		Utilities.Node.start.previous = n;

		n.previous.next = null;
		n.previous = null;

	}
}
