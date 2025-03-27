package hot100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import hot100.utils.TreeNode;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        // 建立一个队列, 将当前层所有节点出队列, 再将下一层所有节点入队列
        Queue<TreeNode> q = new ArrayDeque<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                l.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            res.add(l);
        }
        return res;
    }
}
