package Stack;

public class NextGreatestElement {
	public static void main(String[] args) {
		UtilityS utility = new UtilityS();

		int[] input = {11, 13, 21, 3 };

		int[] output = new int[input.length];

		output[input.length - 1] = -1;
		utility.push(input[input.length - 1]);

		for (int i = input.length - 2; i >= 0; i--) {

			if (input[i] > utility.peek()) {
				utility.pop();
				output[i] = -1;
				utility.push(input[i]);
			}

			else if (input[i] < input[i + 1]) {
				output[i] = input[i + 1];
				utility.push(input[i + 1]);
			} else
				output[i] = utility.peek();

		}

		for (int i = 0; i < input.length; i++)
			System.out.print(output[i] + " ");

	}
}
