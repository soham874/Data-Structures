package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class Diameter {
	
	public static int length = 0;
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

		diameter(base);
		UtilitiesBT.printTree(base);
		System.out.println("Diamter is "+length);
	}

	
	private static int diameter(BTNode base) {
		
		if(base == null)
			return 0;
		
		
		int left = diameter(base.left);
		int right = diameter(base.right);
		
		if(left + right +1> length)
			length = (left + right+1);
		
		int res = left > right ? left : right;
		return res+1;
		
	}
}
