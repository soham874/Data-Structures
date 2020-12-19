package LinkedLists;

public class UtilitiesCLL {

	public static class cNode {

		public static cNode head;
		public int data;
		public String stringdata;
		public cNode next;
		public cNode previous;

		public cNode(int d, String input) {
			data = d;
			stringdata = input;
			next = null;
			previous = null;

		}
		
		public cNode(int d) {
			data = d;
			next = null;
			previous = null;

		}

	}

	public static void printCircular() {
		cNode start = UtilitiesCLL.cNode.head;
		cNode loop = start;
		System.out.print("Current loop data >> ");
		do {
			System.out.print(start.data + " ");
			start = start.next;
		} while (start != loop);
		System.out.println();
	}

	public static cNode previousNode = null;

	public static void insertNode(int d, String input) {

		if (previousNode == null) {
			UtilitiesCLL.cNode.head = new cNode(d, input);
			previousNode = UtilitiesCLL.cNode.head;
		} else {
			cNode current = new cNode(d, input);
			current.previous = previousNode;
			previousNode.next = current;
			previousNode = previousNode.next;

		}
		previousNode.next = UtilitiesCLL.cNode.head;
		UtilitiesCLL.cNode.head.previous = previousNode;
	}
	
	public static void insertNode(int d) {

		if (previousNode == null) {
			UtilitiesCLL.cNode.head = new cNode(d);
			previousNode = UtilitiesCLL.cNode.head;
		} else {
			cNode current = new cNode(d);
			current.previous = previousNode;
			previousNode.next = current;
			previousNode = previousNode.next;

		}
		previousNode.next = UtilitiesCLL.cNode.head;
		UtilitiesCLL.cNode.head.previous = previousNode;
	}

}