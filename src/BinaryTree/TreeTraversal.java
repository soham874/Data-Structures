package BinaryTree;

import BinaryTree.UtilitiesBT.BTNode;

public class TreeTraversal {

	public static void main(String[] args) {

		UtilitiesBT.BTNode.root = new BTNode(1);

		UtilitiesBT.BTNode.root.left = new BTNode(2);
		UtilitiesBT.BTNode.root.right = new BTNode(3);
		UtilitiesBT.BTNode.root.left.left = new BTNode(4);
		UtilitiesBT.BTNode.root.left.right = new BTNode(5);

		UtilitiesBT.printTree();

		System.out.print("Inorder tree data => ");
		inorder(UtilitiesBT.BTNode.root);
		System.out.print("\nPreorder tree data => ");
		preorder(UtilitiesBT.BTNode.root);
		System.out.print("\nPostorder tree data => ");
		postorder(UtilitiesBT.BTNode.root);
	}

	// left root right
	public static void inorder(BTNode root) {

		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

	// root left right
	public static void preorder(BTNode root) {

		if (root == null)
			return;

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

	// left right root
	public static void postorder(BTNode root) {

		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");

	}
}