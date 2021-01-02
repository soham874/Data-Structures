package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class FixedDistance {
	
	public static int level = 0;
	public static int distance;
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
		
		distance = 4;
		findNodes(base);

	}
	private static void findNodes(BTNode base) {
		
		level++;
		
		if(base == null) {
			level --;
			return;
		}
		
		findNodes(base.left);
		findNodes(base.right);
		
		if(level == distance) 
			System.out.print(base.data + " ");
					
		level --;
		return;
		
	}
}
