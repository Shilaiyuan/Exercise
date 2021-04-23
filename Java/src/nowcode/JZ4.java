package nowcode;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x; }
}
public class JZ4 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in){
        if (pre == null || in ==null || pre.length == 0|| in.length == 0 || pre.length != in.length){
            return null;
        }
        return build(pre,0,pre.length-1,in,0,in.length-1);
    }

    public static TreeNode build(int[] pre,int preStart, int preEnd, int[] in, int inStart, int inEnd){
        if (preStart>preEnd||inStart>inEnd)return null;
        int rootINdex = inStart;
        int rootvalue = pre[preStart];
        TreeNode root = new TreeNode(rootvalue);
        //通过递归构造子树
        for (int i = rootINdex; i<inEnd; i++){
            if (in[i] == rootvalue){
                root.left = build(pre, preStart+1, i, in, inStart, i-1);
                root.right = build(pre, i+1, preEnd, in, i+1, inEnd);
                break;
            }
        }
        return root;
    }

    public static void main (String[] args){
        JZ4 temp = new JZ4();
        int[] a,b;
        a = new int[]{1, 2, 3, 4, 5, 6, 7};
        b = new int[]{3, 2, 4, 1, 6, 5, 7};
        temp.reConstructBinaryTree(a,b);
        System.out.println(temp.reConstructBinaryTree(a,b).toString());
    }
}
