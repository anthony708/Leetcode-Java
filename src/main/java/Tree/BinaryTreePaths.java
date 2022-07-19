package main.java.Tree;

import main.java.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * #257 Binary Tree Paths
 * Easy
 * @author zhuduan
 * 2018/11/13
 */

public class BinaryTreePaths {
    public List<String> binaryTreePath(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root != null) {
            searchBT(root, "", res);
        }
        return res;
    }

    private void searchBT(TreeNode root, String path, List<String> res) {
        if (root.left == null && root.right == null) {
            res.add(path + root.val);
        }
        if (root.left != null) {
            searchBT(root.left, path + root.val + "->", res);
        }
        if (root.right != null) {
            searchBT(root.right, path + root.val + "->", res);
        }
    }
}
