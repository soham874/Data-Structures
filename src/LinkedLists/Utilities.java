package LinkedLists;

public class Utilities {

	// Node class is used to generate each Cell. In this case each cell consists of
	// 2 part; the data part and the 'node' part, which stores info about the new
	// node to which it links
	public static class Node {
		static Node start;

		int data;
		Node next;
		Node previous;

		// paramterized constructor, which denotes each cell
		Node(int d) {
			data = d; // storing the data
			next = null; // storing the 'link' to the next cell
			previous = null;
		}
	}

	// takes in the input from which cell to print
	public static void printList(Node printFrom) {
		while (printFrom != null) { // continuing until the current node exists
			System.out.print(printFrom.data + " "); // printing the info stored in 'data' variable
			printFrom = printFrom.next; // making the next node as the current one
		}
		System.out.println();
	}

	// creates a node and pushes in the data at the end
	static Node previousNode = null;

	public void nodepush(int data) {

		if (previousNode == null) {
			Utilities.Node.start = new Node(data);
			previousNode = Utilities.Node.start;
		} else {
			Node currentNode = new Node(data);
			previousNode.next = currentNode;
			previousNode = currentNode;
		}
	}
}