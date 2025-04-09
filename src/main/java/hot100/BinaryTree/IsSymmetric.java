package hot100.BinaryTree;

/*
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */

import hot100.utils.TreeNode;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        // 如果同时满足下面的条件，两个树互为镜像：
        // a. 它们的两个根结点具有相同的值
        // b. 每个树的右子树都与另一个树的左子树镜像对称
        return check(root.left, root.right);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
