package telran.text;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBrackets {

	// Check that 3 types of brackets: (), [], {} are used properly in text
	// represented by String.
	private final static String brOpen = "({[";
	private final static String brClose = ")}]";

	public static boolean hasValidBrackets(String text) {

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < text.length(); i++) {
			char charText = text.charAt(i);
			if (brOpen.indexOf(charText) >= 0) {
				stack.push(charText);
			} else if (brClose.indexOf(charText) >= 0) {
				if (!stack.isEmpty()) {
					if (charText == ')' && stack.peek() == '(' || (charText == '}' && stack.peek() == '{')
							|| (charText == ']' && stack.peek() == '[')) {
						stack.pop();
					} else
						return false;
				} else
					return false;
			}
		}
		return (stack.isEmpty());
	}
}