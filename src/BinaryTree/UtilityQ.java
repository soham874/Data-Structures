package BinaryTree;

public class UtilityQ {

	public static class QNode {

		public static QNode start;

		QNode next;
		int data;

		QNode(int d) {
			data = d;
			next = null;
		}
	}

	public static QNode previous = null;

	public static void pushQueue(int d) {

		if (previous == null) {
			UtilityQ.QNode.start = new QNode(d);
			previous = UtilityQ.QNode.start;
		} else {
			QNode current = new QNode(d);
			previous.next = current;
			previous = current;
		}
		System.out.println(d + " pushed into queue");
	}

	public static int popQueue() {
		if (UtilityQ.QNode.start == null) {
			System.out.println("Queue underflow");
			return '\0';
		}

		else {
			int out = UtilityQ.QNode.start.data;
			System.out.println(UtilityQ.QNode.start.data + " popped from queue.");
			UtilityQ.QNode.start = UtilityQ.QNode.start.next;
			if(UtilityQ.QNode.start == null)
				previous = null;
			return out;
		}

	}

	public static void printQueue() {
		QNode n = UtilityQ.QNode.start;
		System.out.print("Current queue data => ");
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
}