package LinkedLists;

import LinkedLists.UtilitiesCLL.cNode;

public class JosephusCircle {

	UtilitiesCLL circular = new UtilitiesCLL();
	Utility utility = new Utility();

	public static void main(String[] args) {
		int n = Utility.getInteger("Enter n");
		int m = Utility.getInteger("Enter m");

		for (int i = 1; i <= n; i++)
			UtilitiesCLL.insertNode(i);

		cNode node = UtilitiesCLL.cNode.head;

		while (node != node.next) {

			for (int i = 1; i < m - 1; i++)
				node = node.next;

			node = node.next.next;
			deleteNode(node.previous);
		
		}

		System.out.println("Safest position is position " + node.data);
	}

	private static void deleteNode(cNode deleteNode) {
		
		deleteNode.previous.next = deleteNode.next;
		deleteNode.next.previous = deleteNode.previous;
		deleteNode.next = null;
		deleteNode.previous = null;
		
	}

}