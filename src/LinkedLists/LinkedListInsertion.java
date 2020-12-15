package LinkedLists;

import LinkedLists.UtilitiesLL.Node;

public class LinkedListInsertion {

	public static void main(String[] args) {

		// creating 3 cells with the data in paranthesis
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		// equating the next cell to the Node variable 'next' of the previous cell to
		// create the link
		first.next = second;
		second.next = third;

		// creating the 4th cell to be linked
		Node fourth = new Node(4);
		
		System.out.println("Before insertion");
		UtilitiesLL.printList(first);
		
		//doesnot work to insert at front
		insertBetween(fourth, second, third);
		
		System.out.println("After insertion");
		UtilitiesLL.printList(first);
	}

	// inserts parameter 1st between 2nd and 3rd
	private static void insertBetween(Node toBeInserted, Node insertAfter, Node insertBefore) {

		insertAfter.next = toBeInserted;
		toBeInserted.next = insertBefore;
	}
	
	//inserts at front
	private static void insertBetween(Node toBeInserted, Node first) {

		toBeInserted.next = first;
	}
}
