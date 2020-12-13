package LinkedLists;

import LinkedLists.Utilities.Node;

public class LinkListSwap {

	public static void main(String[] args) {

		Utilities utilities = new Utilities();

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before swapping");
		Utilities.printList(Utilities.Node.start);

		int swapPos1 = 3;
		int swapPos2 = 6;

		swapNodes(Utilities.Node.start, swapPos1, swapPos2);

		System.out.println("After swapping");
		Utilities.printList(Utilities.Node.start);
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
		
		Node temp = null;
		
		temp = swapNode1.previous;
		swapNode1.previous = swapNode2.previous;
		swapNode2.previous = temp;
		//temp.previous.next = swapNode2;
		
		temp = swapNode1.next;
		swapNode1.next = swapNode2.next;
		swapNode2.next = temp;
			
	}
}
