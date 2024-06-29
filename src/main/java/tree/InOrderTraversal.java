package tree;

public class InOrderTraversal {
    TreeNode root;
    InOrderTraversal(){root=null;};

    static void printInOrder(TreeNode node){
        if(node==null)
            return;
        printInOrder(node.left);
        System.out.println(node.val+" ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        InOrderTraversal inOrderTraversal=new InOrderTraversal();
        inOrderTraversal.root=new TreeNode(1);
        inOrderTraversal.root.left=new TreeNode(2);
        inOrderTraversal.root.right=new TreeNode(3);
        inOrderTraversal.root.left.left=new TreeNode(4);
        inOrderTraversal.root.left.right=new TreeNode(5);

        System.out.println("Preorder Traversal of the Tree is ");
        inOrderTraversal.printInOrder(inOrderTraversal.root);
    }
}
