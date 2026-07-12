package graphs;

import java.util.*;

public class NumberOfProvinces {
	public static void main(String[] args) {
//		int[][] isConnected = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int[][] isConnected = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(findCircleNum(isConnected));
	}

	public static int findCircleNum(int[][] isConnected) {
		int n = isConnected.length;
		boolean vis[] = new boolean[n];
		List<List<Integer>> adj = adjacencyList(isConnected);

		int count = dfs(n, adj, vis);

		return count;

	}

	public static int dfs(int n, List<List<Integer>> adj, boolean vis[]) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!vis[i]) {
				count++;
				dfsHelper(i, adj, vis);
			}
		}
		return count;
	}

	public static void dfsHelper(int node, List<List<Integer>> adj, boolean vis[]) {
		vis[node] = true;
		for (int neighbour : adj.get(node)) {
			if (!vis[neighbour]) {
				dfsHelper(neighbour, adj, vis);
			}
		}
	}

	public static int bfs(int n, List<List<Integer>> adj, boolean vis[]) {
		int count = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue = new LinkedList<>();
			queue.offer(i);
			if (!vis[i]) {
				count++;
			}

			while (!queue.isEmpty()) {
				int node = queue.poll();
				vis[node] = true;

				for (int neighbour : adj.get(node)) {
					if (!vis[neighbour]) {
						queue.offer(neighbour);
					}
				}
			}

		}
		return count;
	}

	public static List<List<Integer>> adjacencyList(int[][] isConnected) {
		List<List<Integer>> adj = new ArrayList<>();
		int n = isConnected.length;

		for (int i = 0; i < n + 1; i++) {
			adj.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++) {
			int arr[] = isConnected[i];
			adj.get(i).add(i);
			for (int j = 0; j < n; j++) {
				if (arr[j] == 1 && i != j) {
					adj.get(i).add(j);
				}
			}
		}

		return adj;
	}
}
