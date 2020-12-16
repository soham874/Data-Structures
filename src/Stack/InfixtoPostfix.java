package Stack;

import java.util.ArrayList;
import java.util.List;

public class InfixtoPostfix {
	public static List<Character> postfix = new ArrayList<Character>();

	public static void main(String[] args) {

		UtilityS utility = new UtilityS();

		//not working with exponenets currently, following BODMAS
		String infix = "(a+b)*(c+d)";

		for (int i = 0; i < infix.length(); i++) {

			char current = infix.charAt(i);

			if (current != '(' && current != ')')
				if (current >= 97 && current <= 122)
					postfix.add(current);

				else if (utility.isEmpty() || checkPrecedance(current, utility.peek()) || utility.peek() == 40)
					utility.push((int) current);

				else {
					while (!utility.isEmpty() && utility.peek() != '(')
						if (checkPrecedance(utility.peek(), current)) {
							postfix.add((char) utility.peek());
							utility.pop();
						}
					utility.push((int) current);
				}

			if (current == '(')
				utility.push((int) current);

			if (current == ')') {
				while (!utility.isEmpty() && utility.peek() != '(') {
					postfix.add((char) utility.peek());
					utility.pop();
				}
				utility.pop();
			}

		}

		while (!utility.isEmpty()) {
			postfix.add((char) utility.peek());
			utility.pop();
		}

		System.out.println(postfix);
	}

	// returns true if precedence of check is more than checkagainst
	private static boolean checkPrecedance(int check, int checkagainst) {

		if (check != 47 && checkagainst != 47 && check < checkagainst)
			return true;

		else if (check == 47 && checkagainst >= 42)
			return true;

		else if (check <= 41 && checkagainst == 47)
			return true;

		if (check == checkagainst)
			return true;

		return false;
	}
}
