package LinkedLists;

import LinkedLists.Utilities.Node;

public class LinkedListDelete {

	public static void main(String[] args) {

		// creating 3 cells with the data in paranthesis
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		// equating the next cell to the Node variable 'next' of the previous cell to
		// create the link. Also linking previous cells
		first.next = second;
		
		second.next = third;
		second.previous = first;
		
		third.next = fourth;
		third.previous = second;
		
		fourth.previous = third;
		
		System.out.println("Before deleting");
		Utilities.printList(first);
		
		deleteCell(third);
		
		System.out.println("After deleting");
		Utilities.printList(first);
	}

	private static void deleteCell(Node cellToBeDeleted) {
		
		cellToBeDeleted.previous.next = cellToBeDeleted.next;
		
	}
}
