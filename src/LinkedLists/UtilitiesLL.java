package LinkedLists;

public class UtilitiesLL {

	// Node class is used to generate each Cell. In this case each cell consists of
	// 2 part; the data part and the 'node' part, which stores info about the new
	// node to which it links
	public static class Node {

		public static Node start;
		
		public int data;
		public Node next;
		public Node previous;

		// paramterized constructor, which denotes each cell
		public Node(int d) {
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
	public static Node previousNode = null;
	public static void nodepush(int data) {

		if (previousNode == null) {
			UtilitiesLL.Node.start = new Node(data);
			previousNode = UtilitiesLL.Node.start;
		} else {
			Node currentNode = new Node(data);

			currentNode.previous = previousNode;

			previousNode.next = currentNode;
			previousNode = currentNode;
		}
	}
}