package dfs;

import java.util.*;

public class 트리의부모찾기 {

	private static List<Integer> list[];
	private static boolean[] visited;
	private static int[] parent;
	
	private static int rootNode = 1;
	
	private static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		parent = new int[N+1];
		
		for(int i=0 ; i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<N-1;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			list[n1].add(n2);
			list[n2].add(n1);
		}
		
		Stack<Integer> stack = new Stack();
		stack.push(1);
		visited[1] = true;
		
		while(!stack.isEmpty()) {
			int start = stack.pop();
			
			for(int i=0; i<list[start].size();i++) {
				int end = list[start].get(i);
				if(!visited[end]) {
					parent[end] = start;
					stack.push(end);
					visited[end] = true;
				}
			}
		}
		
		for(int i=2; i<parent.length;i++) {
			System.out.println(parent[i]);
		}
		
	}
	
	
	public static void dfs(int x, int y) {
		
	}

}
