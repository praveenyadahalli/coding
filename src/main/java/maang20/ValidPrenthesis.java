package maang20;
import java.util.*;

// leetcode: 20
public class ValidPrenthesis {
	public static void main(String[] args) {
		String s="{}[]{";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (stack.isEmpty()) {
				stack.push(c);
				continue;
			}

			Character c2 = stack.peek();
			if ((c2 == '(' && c == ')') || (c2 == '{' && c == '}') || (c2 == '[' && c == ']')) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty();
	}
}
