package graphs.basicTraversing;

// leetcode : 841
import java.util.*;

public class KeysAndRooms {
	public static void main(String[] args) {
		List<List<Integer>> rooms = new ArrayList<List<Integer>>();

		// case 1
		rooms.add(Arrays.asList(1));
		rooms.add(Arrays.asList(2));
		rooms.add(Arrays.asList(3));
		rooms.add(Arrays.asList());

		// case 2
//		rooms.add(Arrays.asList(1, 3));
//		rooms.add(Arrays.asList(3, 0, 1));
//		rooms.add(Arrays.asList(2));
//		rooms.add(Arrays.asList(0));

		System.out.println(canVisitAllRooms(rooms));
	}

	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		int totalRooms = rooms.size();
		boolean vis[] = new boolean[totalRooms];

//		vis=bfs(vis, rooms);
		dfs(0, vis, rooms);

		for (int i = 0; i < totalRooms; i++) {
			if (!vis[i]) {
				return false;
			}
		}

		return true;
	}

	public static boolean[] bfs(boolean vis[], List<List<Integer>> rooms) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(0);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			vis[node] = true;

			for (Integer neighbour : rooms.get(node)) {
				if (!vis[neighbour]) {
					queue.offer(neighbour);
				}
			}
		}

		return vis;
	}

	public static void dfs(int node, boolean vis[], List<List<Integer>> rooms) {
		vis[node] = true;
		for (Integer neighbour : rooms.get(node)) {
			if (!vis[neighbour]) {
				dfs(neighbour, vis, rooms);
			}
		}
	}

}
