package BinaryTree;

import java.util.Arrays;

public class ObtainPreorder {

	static void obtainRootAndBranches(int[] post, int[] ino) {

		int root = post[post.length - 1];
		int pos = 0;
		System.out.println("Root = " + root);
		for (int i = 0; i < ino.length; i++)
			if (ino[i] == root) {
				pos = i;
				break;
			}

		int[] leftpost = Arrays.copyOfRange(post, 0, pos);
		int[] leftino = Arrays.copyOfRange(ino, 0, pos);

		int[] rightpost = Arrays.copyOfRange(post, pos, ino.length - 1);
		int[] rightino = Arrays.copyOfRange(ino, pos + 1, ino.length);

		if(leftpost.length > 1) {
			System.out.println("\nleft Branch");
			obtainRootAndBranches(leftpost, leftino);
		}

		if(rightpost.length > 1) {
			System.out.println("\nRight Branch");
			obtainRootAndBranches(rightpost, rightino);
		}
		
		if(leftpost.length == 1)
			System.out.println("\nLeft leaf \nRoot = " + leftpost[0]);
		if(rightpost.length == 1)
			System.out.println("\nRight leaf \nRoot = " + rightpost[0]);
		
		return;

	}

	public static void main(String[] args) {

		int[] inorder = { 4,2,5,1,3 }; // Left Root right
		int[] postorder = { 4,5,2,3,1}; // Left right Root

		System.out.println("Printing preorder :-= ");
		obtainRootAndBranches(postorder, inorder);
	}
}
