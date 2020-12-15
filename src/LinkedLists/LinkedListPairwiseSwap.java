package LinkedLists;

import LinkedLists.Utilities.Node;

public class LinkedListPairwiseSwap {

	public static void main(String[] args) {

		Utilities utilities = new Utilities();

		int[] array = { 0, 1, 2, 3, 4 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before swapping");
		Utilities.printList(Utilities.Node.start);

		Node n = Utilities.Node.start;

		while (n != null && n.next != null) {
			swapPiar(n);
			n = n.next;
		}
		
		System.out.println("After swapping");
		Utilities.printList(Utilities.Node.start.previous);

	}

	private static void swapPiar(Node start) {

		Node swapNode1 = start;
		Node swapNode2 = start.next;

		swapNode2.previous = (swapNode1.previous != null) ? swapNode1.previous : null;
		swapNode1.previous = swapNode2;

		if (swapNode2.next != null)
			swapNode2.next.previous = swapNode1;
		
		swapNode1.next = (swapNode2.next != null) ? swapNode2.next : null;
		swapNode2.next = swapNode1;

		if (swapNode2.previous != null)
			swapNode2.previous.next = swapNode2;

	}
}
