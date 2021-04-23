package nowcode;
//二叉树的最小深度
/*题目描述
        求给定二叉树的最小深度。最小深度是指树的根结点到最近叶子结点的最短路径上结点的数量。
示例1
     输入
        {1,2,3,4,5}
     返回值
        2*/
//含有数据类型TreeNode

import javax.swing.tree.TreeNode;



public class LC1 {
    private static TreeNode TreeNode;
    /* @param root TreeNode类
   *  @return int
   * */

   public class TreeNode{
       int val = 0;
       TreeNode left = null;
       TreeNode right =null;
   }

    public int run(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = run(root.left);
        int right = run(root.right);
        if(left*right>0){
            return (left>right?right:left)+1;
        }
        else {
            return (left>right?left:right)+1;
        }
    }

}
