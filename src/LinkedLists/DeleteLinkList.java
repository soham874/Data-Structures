package LinkedLists;

import LinkedLists.UtilitiesLL.Node;

public class DeleteLinkList {

	public static void main(String[] args) {
		// creating 3 cells with the data in paranthesis
		UtilitiesLL.Node.start = new Node(0);
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		// equating the next cell to the Node variable 'next' of the previous cell to
		// create the link
		UtilitiesLL.Node.start.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Before delete");
		UtilitiesLL.printList(UtilitiesLL.Node.start);
		
		UtilitiesLL.Node.start = null;
		
		System.out.println("After delete");
		UtilitiesLL.printList(UtilitiesLL.Node.start);
	}
}
