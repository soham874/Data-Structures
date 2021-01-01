package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class ToDoubleLinkedList {

	public static void main(String[] args) {

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


		TreeTraversal.inorder(base);
		System.out.println();
		BTNode temp = converto(base,'l');

		while (temp.left != null)
			temp = temp.left;

		System.out.print("Printing double LL => ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}

	private static BTNode converto(BTNode base, char side) {

		BTNode right = null;
		BTNode left = null;

		if (base.left == null && base.right == null)
			return base;

		if (base.left != null) {
			left = converto(base.left,'l');
		}
			

		if (base.right != null)
			right = converto(base.right,'r');

		if(left != null) {
			left.right = base;
			base.left = left;
		}
		
		if(right != null) {
			right.left = base;
			base.right = right;
		}
		
		if(side == 'l')
			while(base.right != null)
				base = base.right;
		if(side == 'r')
			while(base.left != null)
				base = base.left;
		return base;
	}
}
