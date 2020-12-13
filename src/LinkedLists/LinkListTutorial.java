package LinkedLists;

import LinkedLists.Utilities.Node;

//Simple code to illustrate generation of a 3 cell linked list

public class LinkListTutorial {

	public static void main(String[] args) {

		// creating 3 cells with the data in paranthesis
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		// equating the next cell to the Node variable 'next' of the previous cell to
		// create the link
		first.next = second;
		second.next = third;
		third.next = fourth;
		// third.next = first; //Activating this will make it a 'circular' link list

		Utilities.printList(first);

	}

}