package tree;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        System.out.println(height(root));
    }
    static int height(TreeNode root)
    {
        // code here
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}
