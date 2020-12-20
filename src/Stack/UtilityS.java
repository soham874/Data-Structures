package Stack;

import java.util.HashMap;

public class UtilityS {

	public static int max = 100;
	private static int top;

	private static HashMap<int[], Integer> stackData = new HashMap<int[], Integer>();

	private static int[] stack;

	// this method returns if the stack is empty or not
	public boolean isEmpty() {
		return (top < 0);
	}

	// pushes a new data into the stack, at the last
	public void push(int data) {
		if (top < max) {

			stack[++top] = data;
			System.out.println(data + " pushed into stack.");

		} else
			System.out.println("Stack overflow");
	}

	// Removes the last element to enter the stack
	public void pop() {
		if (top == -1)
			System.out.println("Stack Underflow");
		else {
			System.out.println(stack[top] + " popped from stack.");
			stack[top] = '\0';
			top--;
		}
	}

	// returns the last element entered into the queue
	public int peek() {

		int val = -1;

		if (top != -1)
			val = stack[top];

		return val;
	}

	// outputs stack data
	public void printstack() {

		System.out.print("Current stack data >> ");
		for (int i = 0; i <= top; i++)
			System.out.print(stack[i] + " ");

		System.out.println();
	}

	// checks if a value exists in a stack
	public static boolean exists(int val) {
		int i = 0;
		while (i < top) {
			if (stack[i] == val)
				return true;
			i++;
		}

		return false;
	}

	// initializes a stack
	public void selectStaack(int[] stackName) {

		if (!stackData.isEmpty())
			stackData.put(stack, top);

		if (!stackData.containsKey(stackName))
			stackData.put(stackName, -1);

		stack = stackName;
		top = stackData.get(stack);
	}
}
