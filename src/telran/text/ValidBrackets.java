package telran.text;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBrackets {

	// Check that 3 types of brackets: (), [], {} are used properly in text
	// represented by String.
	
	public static boolean hasaValidBrackets(String text) {

		Deque<Character> stack = new ArrayDeque<Character>();
		int lenghtString = text.length();

		for (int i = 0; i < lenghtString; i++) {
			char charStr = text.charAt(i);
			if (charStr == '(' || charStr == '[' || charStr == '{') {
				stack.push(charStr);
			}
			else {
				if (charStr == '}' || charStr == ']' || charStr == ')') {
					if (!stack.isEmpty()) {
						if (charStr == ')' && stack.peek() == '(' || (charStr == '}' && stack.peek() == '{')
								|| (charStr == ']' && stack.peek() == '[')) {
							stack.pop();
						} else return false;
						
					} else return false;
				}
			}
		}
		return (stack.isEmpty());
	}
}