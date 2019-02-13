package 완전탐색;

import java.util.Arrays;
import java.util.Collections;

public class 땅따먹기 {
	static int length = 0;
	static int Max = 0;

	public static void main(String[] args) {
		int[][] land = new int[][] { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		//System.out.println(solution(land));
		int[] a= new int[] {5,2,4,1,2};
 		Arrays.sort(a);

	}

	/*
	 * 
	 * | 1 | 2 | 3 | 5 |
	 * 
	 * | 5 | 6 | 7 | 8 |
	 * 
	 * | 4 | 3 | 2 | 1 |
	 */

	// 시간 초과

	/*
	 * public static int solution(int[][] land) { length = land.length; dfs(-1, 0,
	 * 0, land); return Max; }
	 * 
	 * int[] d = new int[4];
	 * 
	 * public static void dfs(int prev_col, int row, int sum, int[][] land) { if
	 * (row == length-1) { if (Max < sum) Max = sum; return; }
	 * 
	 * for (int i = 0; i < land[0].length; i++) { if (prev_col != i) { dfs(i, row +
	 * 1, sum + land[row][i], land); } } }
	 */

	
	public static int solution(int[][] land) {
		int result = 0;
		int size = land.length;
        // 함수를 완성하세요.
        for (int i = 0; i < size - 1; i++) {
        	land[i + 1][0] += Math.max(land[i][1], Math.max(land[i][2], land[i][3]));
        	land[i + 1][1] += Math.max(land[i][0], Math.max(land[i][2], land[i][3]));
        	land[i + 1][2] += Math.max(land[i][0], Math.max(land[i][1], land[i][3]));
        	land[i + 1][3] += Math.max(land[i][0], Math.max(land[i][1], land[i][2]));
        }
        result = Math.max(land[size-1][0], Math.max(land[size-1][1], Math.max(land[size-1][2], land[size-1][3])));
        return result;

	}

}
