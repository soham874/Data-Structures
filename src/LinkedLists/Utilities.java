package LinkedLists;

public class Utilities {

	// Node class is used to generate each Cell. In this case each cell consists of
	// 2 part; the data part and the 'node' part, which stores info about the new
	// node to which it links
	public static class Node {
		int data;
		Node next;

		// paramterized constructor, which denotes each cell
		Node(int d) {
			data = d; // storing the data
			next = null; // storing the 'link' to the next cell
		}
	}

	// takes in the input from which cell to print
	public static void printList(Node printFrom) {
		while (printFrom != null) { // continuing until the current node exists
			System.out.println(printFrom.data + " "); // printing the info stored in 'data' variable
			printFrom = printFrom.next; // making the next node as the current one
		}
	}
}