package ¹®ÀÚ¿­;

import java.util.*;

//https://www.acmicpc.net/problem/5430
public class AC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String cmd = sc.nextLine();
			int cnt = sc.nextInt();
			sc.nextLine();
			String values = sc.nextLine();

			values = values.replace('[', ' ').replace(']', ' ').trim();
			String[] arrValue = values.split(",");
			try {

				for (int j = 0; j < cmd.length(); j++) {
					if (cmd.charAt(j) == 'R') {
						arrValue = reverse(arrValue);
					} else {
						arrValue = delete(arrValue);
					}
				}
				System.out.println(Arrays.toString(arrValue));
			} catch (Exception e) {
				System.out.println("error");
			}
		}
	}

	public static int countD(String cmd) {
		int cnt = 0;
		for (int i = 0; i < cmd.length(); i++) {
			if (cmd.charAt(i) == 'D')
				cnt++;
		}
		return cnt;
	}

	public static String[] reverse(String[] valuse) {
		String[] temp = new String[valuse.length];
		for (int i = 0; i < valuse.length; i++) {
			temp[i] = valuse[valuse.length - 1 - i];
		}
		return temp;
	}

	public static String[] delete(String[] valuse) {
		String[] temp = new String[valuse.length - 1];
		for (int i = 1; i < valuse.length; i++) {
			temp[i - 1] = valuse[i];
		}
		return temp;
	}

}
