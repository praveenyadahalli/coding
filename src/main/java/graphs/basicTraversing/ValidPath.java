package graphs.basicTraversing;

import java.util.*;

// leetcode: 1971
public class ValidPath {
	public static void main(String[] args) {
		int edges[][] = { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } };
		int n = 6, source = 0, destination = 5;
		boolean status = validPath(n, edges, source, destination);

//		int edges[][] = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
//		int n = 3, source = 0, destination = 2;
//		boolean status = validPath(n, edges, source, destination);

//		int edges[][]= {};
//		int n=1,source=0,destination=0;
//		boolean status=validPath(n, edges, source, destination);

		System.out.println(status);
	}

	// TC=o(V+E) SC=o(V+E)
	public static boolean validPath(int n, int[][] edges, int source, int destination) {
		List<List<Integer>> adj = buildAdjacency(edges, n);
		boolean vis[] = new boolean[n];
		boolean ans = false;
		boolean bool = dfsPathValidation(adj, source, destination, vis);
//		boolean bool = bfsPathValidation(adj, source, destination, vis);
		return bool;
	}

	public static boolean dfsPathValidation(List<List<Integer>> adj, int source, int destination, boolean vis[]) {
		vis[source] = true;
		if (source == destination) {
			return true;
		}
		for (Integer neighbour : adj.get(source)) {
			if (!vis[neighbour]) {
				boolean bool = dfsPathValidation(adj, neighbour, destination, vis);
				if (bool) {
					return bool;
				}
			}
		}
		return false;
	}

	public static boolean bfsPathValidation(List<List<Integer>> adj, int source, int destination, boolean vis[]) {
		Queue<Integer> bfs = new LinkedList<>();
		bfs.offer(source);

		while (!bfs.isEmpty()) {
			int node = bfs.poll();
			vis[node] = true;
			if (node == destination) {
				return true;
			}

			for (Integer neighbour : adj.get(node)) {
				if (!vis[neighbour]) {
					bfs.offer(neighbour);
				}
			}
		}
		return false;
	}

	public static List<List<Integer>> buildAdjacency(int[][] edges, int n) {
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < edges.length; i++) {
			int[] arr = edges[i];
			int a = arr[0];
			int b = arr[1];
			
			adj.get(a).add(b);
			adj.get(b).add(a);

		}

		return adj;
	}
}
