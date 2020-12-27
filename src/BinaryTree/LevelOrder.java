package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class LevelOrder {

	public static void main(String[] args) {

		BTNode base = new BTNode(1);
		base.left = new BTNode(2);
		base.right = new BTNode(3);
		base.left.left = new BTNode(4);
		base.left.right = new BTNode(5);
		base.right.right = new BTNode(6);

		UtilityQ.pushQueue(base.data);

		// UtilitiesBT.printTree(base);

		levelOrder(base);
	}

	private static void levelOrder(BTNode base) {

		if (base == null)
			return;

		int root = UtilityQ.popQueue();
		System.out.println(root + " ");
		if (base.left != null)
			UtilityQ.pushQueue(base.left.data);
		if (base.right != null)
			UtilityQ.pushQueue(base.right.data);

		// UtilityQ.printQueue();

		levelOrder(base.left);
		levelOrder(base.right);

	}
}
