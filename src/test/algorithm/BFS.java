package test.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }

    private TreeNode bfs(TreeNode node, int val){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            if(n.val == val){
                return n;
            }
            queue.add(n.left);
            queue.add(n.right);
        }
        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
