package 문자열;

import java.util.*;

//https://www.acmicpc.net/problem/4949
//괄호 문제와 유사
public class 균형잡힌세상 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputData;

		while (true) {
			inputData = sc.nextLine();

			if (inputData.equals(".")) {
				break;
			}
			System.out.println(discriminate(inputData));
		}

	}

	public static String discriminate(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.peek() != '(')
					return "no";
				else
					stack.pop();
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}

		if(stack.empty())
		return "yes";
		else return "no";
	}

}
