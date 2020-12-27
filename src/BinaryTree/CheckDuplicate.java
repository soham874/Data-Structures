package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class CheckDuplicate {

	public static void main(String[] args) {

		BTNode p1 = new BTNode(1);
		p1.left = new BTNode(2);
		p1.right = new BTNode(3);
		p1.left.left = new BTNode(4);
		p1.left.right = new BTNode(5);

		BTNode p2 = new BTNode(1);
		p2.left = new BTNode(2);
		p2.right = new BTNode(3);
		p2.left.left = new BTNode(4);
		p2.left.right = new BTNode(5);

		try {
			isDuplicate(p1, p2);
		} catch (Exception e) {
			System.out.println("Not duplicate");
			System.exit(0);
		}

		System.out.println("Duplicate");

	}

	private static void isDuplicate(BTNode p1, BTNode p2) {

		if (p1.left == null && p1.data == p2.data)
			return;

		if (p1.data != p2.data) {
			System.out.println("Not duplicate");
			System.exit(0);
		}

		isDuplicate(p1.left, p2.left);
		isDuplicate(p2.right, p2.right);

	}

}
