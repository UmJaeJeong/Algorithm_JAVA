package 완전탐색;

import java.util.*;

class Solution {
	public int solution(int[][] baseball) {
		Stack<String> stack = new Stack<>();

		// 모든 경우의 수의 값 입력
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10; k++) {
					if (i != j && j != k && i != k) {
						stack.add(String.valueOf(i * 100 + j * 10 + k));
					}
				}
			}
		}

		Stack<String> answer = new Stack<>();
		while (!stack.empty()) {
			String tmp = stack.pop();
			boolean flag = true;

			for (int i = 0; i < baseball.length && flag; i++) {
				int strike = Strike(tmp, String.valueOf(baseball[i][0]));
				int ball = Ball(tmp, String.valueOf(baseball[i][0])) - strike;

				if (strike != baseball[i][1] || ball != baseball[i][2])
					flag = false;
			}
			if (flag)
				answer.add(tmp);
		}
		return answer.size();
	}

	public static int Strike(String tmp, String target) {
		int cnt = 0;
		for (int i = 0; i < target.length(); i++) {
			cnt = tmp.charAt(i) == target.charAt(i) ? cnt + 1 : cnt;
		}
		return cnt;
	}

	public static int Ball(String tmp, String target) {
		int cnt = 0;
		for (int i = 0; i < target.length(); i++) {
			cnt = tmp.contains(String.valueOf(target.charAt(i))) ? cnt + 1 : cnt;
		}
		return cnt;
	}

}