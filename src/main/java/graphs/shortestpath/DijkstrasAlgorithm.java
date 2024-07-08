package graphs.shortestpath;
import java.util.*;

public class DijkstrasAlgorithm {

	public static void main(String[] args) {
		// Number of vertices
        int V = 5;
        // Adjacency list representation of the graph
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        // Adding edges to the graph
        // Edge 0-1 (weight 2), 0-2 (weight 4)
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(2, 4)));
        
        // Edge 1-2 (weight 1), 1-3 (weight 7)
        adj.get(1).add(new ArrayList<>(Arrays.asList(2, 1)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(3, 7)));
        
        // Edge 2-4 (weight 3)
        adj.get(2).add(new ArrayList<>(Arrays.asList(4, 3)));
        
        // Edge 3-4 (weight 2)
        adj.get(3).add(new ArrayList<>(Arrays.asList(4, 2)));
        
        // Edge 3-0 (weight 5)
        adj.get(3).add(new ArrayList<>(Arrays.asList(0, 5)));

        // Source vertex
        int S = 0;

        // Calculate shortest paths from source vertex
        int[] dist = dijkstra(V, adj, S);

        // Print the distances
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println("Node: " + i+ " \t\t " +"Distance: "+ dist[i]);
        }

	}
	
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj,int S) {
		
		// min heap
		PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
		int []dist=new int[V];
		for(int i=0;i<V;i++) dist[i]=(int)(1e9);
		
		dist[S]=0;
		pq.add(new Pair(0,S));
		
		while(pq.size()!=0) {
			int dis=pq.peek().distance;
			int node=pq.peek().node;
			pq.remove();
			
			for(int i=0;i<adj.get(node).size();i++) {
				int edgeWeight=adj.get(node).get(i).get(1);
				int adjNode=adj.get(node).get(i).get(0);
				
				if(dis+edgeWeight<dist[adjNode]) {
					dist[adjNode]=dis+edgeWeight;
					pq.add(new Pair(dist[adjNode], adjNode));
				}
			}
		}
		return dist;
	}

}
