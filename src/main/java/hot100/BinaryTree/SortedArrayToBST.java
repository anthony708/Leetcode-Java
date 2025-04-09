package hot100.BinaryTree;

import hot100.utils.TreeNode;

/*
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 平衡 二叉搜索树。
 * 
 * 高度平衡的定义是每个节点的左右子树高度差不超过1
 */

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        // 选择中间元素作为根节点，然后递归构建左右子树。
        // 选择中间元素呢: 保证左右子树的节点数量尽可能相等，从而保持树的平衡
        return buildBST(nums, 0, nums.length - 1);
    }

    public TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (right - left) / 2 + left;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }
}
