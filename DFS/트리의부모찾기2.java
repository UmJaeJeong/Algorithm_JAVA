package dfs;

import java.util.*;
public class 트리의부모찾기2 {

	private static int N;
	
	private static List<Integer>[] list;
	
	private static boolean visited[];
	private static int[] parents;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		parents = new int[N+1];
		
		for(int i=0; i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<N-1;i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			list[node1].add(node2);
			list[node2].add(node1);
		}
		
		dfs(1,0);
		
		
		for(int i=2; i<=N;i++) {
			System.out.println(parents[i]);
		}
		
	}
	
	public static void dfs(int node, int preNode) {
		visited[node] = true;
		parents[node] = preNode;
		
		if(list[node].size() !=0) {
			for(int i=0; i<list[node].size();i++) {
				int leaf = list[node].get(i);
				if(!visited[leaf]) {
					for(int j=0; j<list[leaf].size();j++) {
						dfs(leaf, node);
					}
				}
			}
		}
	}
}
