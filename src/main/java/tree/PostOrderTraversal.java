package tree;

public class PostOrderTraversal {
	TreeNode root;

	PostOrderTraversal() {
		root = null;
	};

	static void printPostOrder(TreeNode node) {
		if (node == null)
			return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.val + " ");
	}

	public static void main(String[] args) {
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
		postOrderTraversal.root = new TreeNode(1);
		postOrderTraversal.root.left = new TreeNode(2);
		postOrderTraversal.root.right = new TreeNode(3);
		postOrderTraversal.root.left.left = new TreeNode(4);
		postOrderTraversal.root.left.right = new TreeNode(5);

		System.out.println("Preorder Traversal of the Tree is ");
		postOrderTraversal.printPostOrder(postOrderTraversal.root);
	}
}
