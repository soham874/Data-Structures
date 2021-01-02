package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class Level {
	
	public static int level = 0;
	public static int search;
	
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

		search = 9;
		getLevel(base);
				
		if(level == 0)
			System.out.println("Sorry not found");
	}

	private static void getLevel(BTNode base) {
		
		level++;
		
		if(base == null) {
			level --;
			return;
		}
		
		getLevel(base.left);
		getLevel(base.right);
		
		if(base.data == search) {
			System.out.println("Level of the data = " + level);
			System.exit(0);
		}
		
		level --;
		return;
			
	}
}
