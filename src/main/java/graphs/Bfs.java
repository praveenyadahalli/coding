package graphs;

import java.util.*;

// Time complexity : O(V) + O(2E) where E is the number edges 
// Space complexity : O(V)

// Note : The sum of the lengths of all adjacency lists is 2E (each edge is counted 
// twice in an undirected graph, once for each vertex it connects), resulting in 
// O(E) time for handling the edges.
public class Bfs {
	
	public static void main(String[] args) {
        // Example graph represented as adjacency list
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(0);
        adj.get(3).add(1);
        adj.get(4).add(1);

        // Creating Bfs object and calling bfsOfGraph method
        Bfs bfs = new Bfs();
        ArrayList<Integer> bfsResult = bfs.bfsOfGraph(V, adj);

        // Printing the result of BFS
        System.out.println("BFS traversal of the graph:");
        for (Integer node : bfsResult) {
            System.out.print(node + " ");
        }
    }

	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		// Code here
		ArrayList<Integer> bfs = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<>();
		boolean vis[] = new boolean[V];

		// starting index point of queue
		q.add(0);

		// adding first node into queue, marking it as visited
		vis[0] = true;

		while (!q.isEmpty()) {
			Integer node = q.poll();
			bfs.add(node);

			// get all adjacent vertices of dequeued vertices
			// if adjacent has not yet visited then mark it as visited
			// enqueue it
			for (Integer it : adj.get(node)) {
				if (vis[it] == false) {
					vis[it] = true;
					q.add(it);
				}
			}
		}

		return bfs;
	}
}
