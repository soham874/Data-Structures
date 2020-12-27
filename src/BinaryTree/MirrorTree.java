package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class MirrorTree {

	public static void main(String[] args) {
		
		BTNode base = new BTNode(1);
		base.left = new BTNode(2);
		base.right = new BTNode(3);
		base.left.left = new BTNode(4);
		base.left.right = new BTNode(5);
		base.right.right = new BTNode(6);
		
		UtilitiesBT.printTree(base);
		
		mirrorTree(base);
		
		UtilitiesBT.printTree(base);
	}

	private static void mirrorTree(BTNode base) {
		
		if(base == null)
			return;
		
		mirrorTree(base.left);
		mirrorTree(base.right);
		
		BTNode temp = base.left;
		base.left = base.right;
		base.right = temp;
	}
}
