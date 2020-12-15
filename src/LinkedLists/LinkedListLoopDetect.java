package LinkedLists;

import java.util.HashMap;

import LinkedLists.UtilitiesLL.Node;

public class LinkedListLoopDetect {

	public static HashMap<Node,Integer> visited = new HashMap<Node,Integer>();

	public static void main(String[] args) {

		UtilitiesLL utilities = new UtilitiesLL();

		int[] array = { 1, 2, 3, 4, 5};

		for (int i = 0; i < array.length; i++)
			utilities.nodepush(array[i]);

		UtilitiesLL.Node.start.next.next.next.next = UtilitiesLL.Node.start.next;

		System.out.println(checkLoop(UtilitiesLL.Node.start));
	}

	private static String checkLoop(Node start) {
		
		int val = 1;
		while (start != null) {

			if (visited.containsKey(start)) {
				
				int keypos = visited.get(start);
				System.out.println("Loop length is " + (val - keypos + 1) );
				return "Loop detected";
			}
				

			visited.put(start,val);
			val++;

			start = start.next;
		}

		return "Loop not detected";

	}
}
