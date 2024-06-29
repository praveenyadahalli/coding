package tree;

public class PreOrderTraversal {
    TreeNode root;
    PreOrderTraversal(){root=null;};

    static void printPreOrder(TreeNode node){
        if(node==null)
            return;
        System.out.println(node.val+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args) {
        PreOrderTraversal preOrderTraversal=new PreOrderTraversal();
        preOrderTraversal.root=new TreeNode(1);
        preOrderTraversal.root.left=new TreeNode(2);
        preOrderTraversal.root.right=new TreeNode(3);
        preOrderTraversal.root.left.left=new TreeNode(4);
        preOrderTraversal.root.left.right=new TreeNode(5);

        System.out.println("Preorder Traversal of the Tree is ");
        preOrderTraversal.printPreOrder(preOrderTraversal.root);
    }
}
