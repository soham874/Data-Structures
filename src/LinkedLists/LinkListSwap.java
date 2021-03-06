package LinkedLists;

import LinkedLists.UtilitiesLL.Node;

public class LinkListSwap {

	public static void main(String[] args) {

		UtilitiesLL utilities = new UtilitiesLL();

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before swapping");
		UtilitiesLL.printList(UtilitiesLL.Node.start);

		int swapPos1 = 2;
		int swapPos2 = 7;
		
		//only for in between
		swapNodes(UtilitiesLL.Node.start, swapPos1, swapPos2);

		System.out.println("After swapping");
		UtilitiesLL.printList(UtilitiesLL.Node.start);
	}

	private static void swapNodes(Node n, int swapPos1, int swapPos2) {

		int currentPos = 1;
		Node swapNode1 = null;
		Node swapNode2 = null;
		while (n != null) {

			if (currentPos == swapPos1)
				swapNode1 = n;
			else if (currentPos == swapPos2)
				swapNode2 = n;

			currentPos++;
			n = n.next;
		}

		swapNode1.previous.next = swapNode2;
		swapNode1.next.previous = swapNode2;

		swapNode2.previous.next = swapNode1;
		swapNode2.next.previous = swapNode1;
		
		Node temp = null;
		
		temp = swapNode1.previous;
		swapNode1.previous = swapNode2.previous;
		swapNode2.previous = temp;
		
		temp = swapNode1.next;
		swapNode1.next = swapNode2.next;
		swapNode2.next = temp;

	}

}
