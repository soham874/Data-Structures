package Stack;

public class UtilityS {

	private int max = 100;
	private int top = -1;

	private int[] stack = new int[max];

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

	public void printstack() {
		
		System.out.print("Current stack data >> ");
		for(int i = 0;i<=top;i++)
			System.out.print(stack[i] + " ");
		
		System.out.println();
	}

}
