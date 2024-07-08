package graphs;

import java.util.ArrayList;

//Time complexity : O(V) + O(2E) where E is the number edges 
//Space complexity : O(V)

public class Dfs {

	public static void main(String[] args) {
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}

		// Add edges to the graph
		adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(1).add(3);
		adj.get(1).add(4);
		adj.get(2).add(3);
		adj.get(3).add(4);

		ArrayList<Integer> result = dfsOfGraph(V, adj);

		// Print the result
		System.out.println("DFS Traversal of the graph: " + result);
	}

	// Function to return a list containing the DFS traversal of the graph
	public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean vis[] = new boolean[V];
		ArrayList<Integer> ls = new ArrayList<>();
		dfs(0, vis, adj, ls);
		return ls;
	}

	// DFS utility method
	public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
		vis[node] = true;
		ls.add(node);

		for (Integer it : adj.get(node)) {
			if (!vis[it]) {
				dfs(it, vis, adj, ls);
			}
		}
	}

}
