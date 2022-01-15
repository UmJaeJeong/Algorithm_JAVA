package dfs;

import java.util.*;

public class 영역나누기 {
	// M x N
	private static int M, N, K;

	private static int[][] arr;
	private static boolean[][] visited;

	private static int[] dx = { 0, 0, 1, -1 };
	private static int[] dy = { 1, -1, 0, 0 };

	private static List<Integer> result = new ArrayList<>();

	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();

		arr = new int[M][N];
		visited = new boolean[M][N];
		
		for (int i = 0; i < K; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			for (int x = x1; x <x2; x++) {
				for (int y = y1; y <y2; y++) {
					arr[y][x] = 1;
				}
			}
		}

		

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					if (arr[i][j] == 0) {
						count = 0;
						count++;
						dfs(i, j);
						result.add(count);
					}
				}
			}
		}

		System.out.println(result.size());
		Collections.sort(result);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
				if (!visited[nx][ny] && arr[nx][ny] == 0) {
					count++;
					dfs(nx, ny);
				}
			}
		}
	}
}