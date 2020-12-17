package Stack;

public class BalancedParanthesis {
	
	static UtilityS utility = new UtilityS();
	public static void main(String[] args) {

		String input = "([])";

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);

			checkBracket(c);

		}

		System.out.println("Brackets are balanced.");
	}

	public static boolean checkBracket(char c) {

		if (c == '(' || c == '{' || c == '[') {
			utility.push((int) c);
			return true;
		}

		else if ((c == ')' && utility.peek() == 40) || (c == ']' && utility.peek() == 91)
				|| (c == '}' && utility.peek() == 123)) {
			utility.pop();
			return true;

		}

		System.out.println("Brackets are not balanced.");
		System.exit(0);
		return false;
	}
}
