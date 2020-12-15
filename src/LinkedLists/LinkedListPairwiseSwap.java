package LinkedLists;

public class LinkedListPairwiseSwap {

	public static void main(String[] args) {
		
		Utilities utilities = new Utilities();

		int[] array = { 1, 2, 3, 5, 3, 2, 4, 1 };

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		System.out.println("Before swapping");
		Utilities.printList(Utilities.Node.start);
		
		
		
	}
}
