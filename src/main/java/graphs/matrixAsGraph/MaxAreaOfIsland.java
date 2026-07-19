package graphs.matrixAsGraph;

import java.util.*;

public class MaxAreaOfIsland {
	public static void main(String[] args) {
		int[][] grid1 = {
				{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		int[][] grid2 = {{0,0,0,0,0,0,0,0}};
		
		System.out.println(maxAreaOfIsland(grid2));
	}


	public static int maxAreaOfIsland(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		int max = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int count = 0;
					count = dfs(grid, i, j, m, n, count);
					max = Math.max(count, max);
				}
			}
		}
		return max;
	}

	public static int dfs(int[][] grid, int i, int j, int m, int n, int count) {
		if (i > m - 1 || j > n - 1 || i < 0 || j < 0 || grid[i][j] == 0) {
			return count;
		}
		count++;
		grid[i][j] = 0;
		count=dfs(grid, i + 1, j, m, n, count);
		count=dfs(grid, i, j + 1, m, n, count);
		count=dfs(grid, i - 1, j, m, n, count);
		count=dfs(grid, i, j - 1, m, n, count);
		return count;
	}
}
