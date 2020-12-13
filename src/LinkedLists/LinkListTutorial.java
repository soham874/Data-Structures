package LinkedLists;

//Simple code to illustrate generation of a 3 cell linked list

public class LinkListTutorial {

	// Node class is used to generate each Cell. In this case each cell consists of
	// 2 part; the data part and the 'node' part, which stores info about the new
	// node to which it links
	public static class Node {
		int data;
		Node next;
		
		//paramterized constructor, which denotes each cell
		Node(int d) {
			data = d;		//storing the data
			next = null;	//storing the 'link' to the next cell
		}
	}

	public static void main(String[] args) {
		
		//creating 3 cells with the data in paranthesis
		Node first = new Node(1);		
		Node second = new Node(2);
		Node third = new Node(3);
		
		//equating the next cell to the Node variable 'next' of the previous cell to create the link 
		first.next = second;
		second.next = third;
		// third.next = first;	//Activating this will make it a 'circular' link list

		printList(first);

	}
	
	//takes in the input from which cell to print
	public static void printList(Node printFrom) {
		while (printFrom != null) {		//continuing until the current node exists
			System.out.println(printFrom.data + " ");		//printing the info stored in 'data' variable
			printFrom = printFrom.next;		//making the next node as the current one
		}

	}
}