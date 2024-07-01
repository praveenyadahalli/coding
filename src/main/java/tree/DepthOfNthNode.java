package tree;

public class DepthOfNthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(5);
		tree.left = new TreeNode(4);
		tree.right = new TreeNode(15);
		tree.left.left = new TreeNode(7);
		tree.right.right = new TreeNode(8);
		tree.left.left.left = new TreeNode(9);
		tree.right.right.right = new TreeNode(14);

		int n = nthNodeDepth(tree, 5, 0);
		System.out.println(n);

	}

	public static int nthNodeDepth(TreeNode root, int x, int depth) {
		if (root == null) {
			return -1;
		}

		if (root.val == x) {
			return depth;
		}
		int find = nthNodeDepth(root.left, x, depth + 1);

		// if x found in left subtree then return the depth
		if (find != -1) {
			return depth;
		}

		return nthNodeDepth(root.right, x, depth + 1);
	}

}
