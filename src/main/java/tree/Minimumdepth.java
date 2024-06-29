package tree;

public class Minimumdepth {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(root.left!=null && root.right!=null){
            return Math.min(left,right)+1;
        }
        return Math.max(left,right)+1;
    }
}
