package Stack;

import LinkedLists.UtilitiesLL;
import LinkedLists.UtilitiesLL.Node;

public class UtilityS {

	private int max = 100;
	private int top = 0;

	// this method returns if the stack is empty or not
	public boolean isEmpty() {
		return (top < 1);
	}

	// pushes a new data into the stack, at the last
	public void push(int data) {
		if (top <= max) {
			UtilitiesLL.nodepush(data);
			System.out.println(data + " pushed into stack.");
			top++;
		} else
			System.out.println("Stack overflow");
	}

	// Removes the last element to enter the stack
	public void pop() {
		if (top == 0)
			System.out.println("Stack Underflow");
		else {
			Node n = UtilitiesLL.Node.start;

			while (n.next != null)
				n = n.next;

			System.out.println(n.data + " popped from stack.");
			if (n.previous != null)
				n.previous.next = null;
			else
				n = null;

			top--;
		}
	}

	// returns the last element entered into the queue
	public int peek() {

		int val = -1;

		if (top != 0) {
			Node n = UtilitiesLL.Node.start;

			while (n.next != null)
				n = n.next;

			val = n.data;
		}

		return val;
	}

}
