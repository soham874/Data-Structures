package Stack;

public class NextGreatestElement {

	static UtilityS utility = new UtilityS();

	public static void main(String[] args) {

		int[] input = { 3, 3, 2, 1, 1, 2, 3 };

		nextGreatestElement(input);

	}

	public static void nextGreatestElement(int[] input) {
		int[] output = new int[input.length];
		int max = input[input.length - 1];

		output[input.length - 1] = -1;
		utility.push(input[input.length - 1]);

		for (int i = input.length - 2; i >= 0; i--) {

			if (input[i] >= utility.peek()) {
				if (input[i] > max)
					max = input[i];

				if (input[i] == max)
					output[i] = -1;
				else
					output[i] = utility.peek();
				utility.pop();
				utility.push(input[i]);
			}

			else if (input[i] < input[i + 1]) {
				utility.pop();
				output[i] = input[i + 1];
				utility.push(input[i + 1]);
			} else
				output[i] = utility.peek();

		}

		for (int i = 0; i < input.length; i++)
			System.out.print(output[i] + " ");

	}
}
