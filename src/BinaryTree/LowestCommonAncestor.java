package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class LowestCommonAncestor {
	public static void main(String[] args) {

		// works only for trees where left < root < right and leaves searched are
		// present
		BTNode base = new BTNode(32);
		base.left = new BTNode(16);
		base.right = new BTNode(40);
		base.left.left = new BTNode(14);
		base.left.right = new BTNode(24);
		base.right.right = new BTNode(51);
		base.left.right.left = new BTNode(20);
		base.left.right.right = new BTNode(25);
		base.right.left = new BTNode(37);
		base.right.left.left = new BTNode(34);
		base.right.right.left = new BTNode(45);
		base.right.right.right = new BTNode(72);

		lowestAncestor(20, 72, base);

	}

	private static void lowestAncestor(int i, int j, BTNode base) {

		if (base.data == i || base.data == j || (base.data > i && base.data < j)) {
			System.out.println("Lowest ancestor is " + base.data);
			System.exit(0);
		} else if (base.data > i && base.data > j)
			lowestAncestor(i, j, base.left);
		else if (base.data < i && base.data < j)
			lowestAncestor(i, j, base.right);

	}

}
