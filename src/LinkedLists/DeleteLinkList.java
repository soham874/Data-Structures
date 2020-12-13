package LinkedLists;

import LinkedLists.Utilities.Node;

public class DeleteLinkList {

	public static void main(String[] args) {
		// creating 3 cells with the data in paranthesis
		Utilities.Node.start = new Node(0);
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		// equating the next cell to the Node variable 'next' of the previous cell to
		// create the link
		Utilities.Node.start.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Before delete");
		Utilities.printList(Utilities.Node.start);
		
		Utilities.Node.start = null;
		
		System.out.println("After delete");
		Utilities.printList(Utilities.Node.start);
	}
}
