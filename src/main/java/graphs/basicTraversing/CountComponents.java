package graphs.basicTraversing;

import java.util.*;

// leetcode: connected components problem 323, it's premium
// neetcode: 150 - for problem statement.
public class CountComponents {
	public static void main(String[] args) {
//		int n = 5;
//		int[][] edges = { { 0, 1 }, { 1, 2 }, { 3, 4 } };
		int n = 5;
		int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 4 } };
		System.out.println(countComponents(n, edges));
	}

	public static int countComponents(int n, int[][] edges) {
		List<List<Integer>> adj = adjacency(n, edges);
		boolean[] vis = new boolean[n];

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (vis[i]) {
				continue;
			}
			count++;
//			bfs(i, adj, vis);
			dfs(i, adj, vis);
		}

		return count;
	}

	// TC=O(E+V) SC=O(E+V)
	public static void dfs(int i, List<List<Integer>> adj, boolean[] vis) {
		if (vis[i]) {
			return;
		}
		vis[i] = true;

		for (Integer neighbour : adj.get(i)) {
			if (!vis[neighbour]) {
				dfs(neighbour, adj, vis);
			}
		}
	}

	// TC=O(E+V) SC=O(E+V)
	public static void bfs(int i, List<List<Integer>> adj, boolean[] vis) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			if (vis[node]) {
				continue;
			}
			vis[node] = true;

			for (Integer neighbour : adj.get(node)) {
				if (!vis[neighbour]) {
					queue.add(neighbour);
				}
			}
		}

	}

	public static List<List<Integer>> adjacency(int n, int[][] edges) {
		List<List<Integer>> adj = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}

		for (int i = 0; i < edges.length; i++) {
			int arr[] = edges[i];
			int a = arr[0];
			int b = arr[1];

			adj.get(a).add(b);
			adj.get(b).add(a);
		}

		return adj;
	}
}
