package BinaryTree;

import java.util.Scanner;

public class UtilitiesBT {

	static Scanner sc = new Scanner(System.in);
	static BTNode previousNode;

	//each node of the tree
	static class BTNode {

		public static BTNode root;

		public BTNode left;
		public BTNode right;
		public int data;

		public BTNode(int d) {
			data = d;
			left = null;
			right = null;
		}

	}
	
	//pushes a new node onto the tree
	static void pushNode(int d) {

		System.out.println("~~~~~~~~Currently pushing " + d + "~~~~~~~~~~~~~~~");

		if (UtilitiesBT.BTNode.root == null) {
			UtilitiesBT.BTNode.root = new BTNode(d);

		} else {

			previousNode = UtilitiesBT.BTNode.root;
			BTNode newNode = new BTNode(d);

			while (previousNode.left != null || previousNode.right != null) {
				System.out.println("Current node data >> " + previousNode.data);

				System.out.println("<a> Left Branch <b> Right Branch");
				char branch = sc.nextLine().charAt(0);

				if ((branch == 'a' && previousNode.left != null) || (branch == 'b' && previousNode.right != null))
					previousNode = (branch == 'a') ? previousNode.left : previousNode.right;
				
				else
					break;
			}
			System.out.println("Current node data >> " + previousNode.data);
			System.out.println("Chose branch to input from available free nodes ==>");
			
			if(previousNode.left == null)
				System.out.print("<a> left node ");
			if(previousNode.right == null)
				System.out.print("<b> right node");
			
			System.out.println();
			char branch = sc.nextLine().charAt(0);

			if (branch == 'a')
				previousNode.left = newNode;
			else
				previousNode.right = newNode;
		}

		System.out.println(d + " pushed to tree successfully");

	}

	private static void print2DUtil(BTNode root, int space) {
		// Base case
		if (root == null)
			return;

		// Increase distance between levels
		space += 10;

		// Process right child first
		print2DUtil(root.right, space);

		// Print current node after space
		// count
		System.out.print("\n");
		for (int i = 10; i < space; i++)
			System.out.print(" ");
		System.out.print(root.data + "\n");

		// Process left child
		print2DUtil(root.left, space);
		
		System.out.println("\n");
	}
	
	//prints the tree rotated 90 degree CCW
	static void printTree() {
		System.out.println("~~~~~~~~~~~~~~~~Tree Data~~~~~~~~~~~~~~~~~~");
		BTNode root = UtilitiesBT.BTNode.root;
		print2DUtil(root, 10);
	}
	
	//prints the tree rotated 90 degree CCW
	static void printTree(BTNode root) {
		System.out.println("~~~~~~~~~~~~~~~~Tree Data~~~~~~~~~~~~~~~~~~");
		print2DUtil(root, 10);
	}
}
