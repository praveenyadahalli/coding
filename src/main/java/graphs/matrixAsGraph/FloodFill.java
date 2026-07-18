package graphs.matrixAsGraph;

// leetcode: 733
public class FloodFill {

	public static void main(String[] args) {
		int[][] image= {
				{1,1,1},
				{1,1,0},
				{1,0,1}
		};
		int sr=1,sc=1,color=2;
		
		image=floodFill(image, sr, sc, color);
		
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int rows = image.length - 1;
		int cols = image[0].length - 1;
		int originVal = image[sr][sc];
		return fill(image, sr, sc, color, rows, cols, originVal);
	}

	public static int[][] fill(int[][] image, int sr, int sc, int color, int rows, int cols, int originVal) {
		if (sr > rows || sc > cols || sr < 0 || sc < 0 || originVal == color || image[sr][sc] != originVal) {
			return image;
		}

		image[sr][sc] = color;
		fill(image, sr + 1, sc, color, rows, cols, originVal);
		fill(image, sr, sc + 1, color, rows, cols, originVal);
		fill(image, sr - 1, sc, color, rows, cols, originVal);
		fill(image, sr, sc - 1, color, rows, cols, originVal);

		return image;
	}

}
