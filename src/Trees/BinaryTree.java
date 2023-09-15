package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
    BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void firstInDepthTraverse() {
         if (root != null)
            root.traverseInDepth();
    }

    public void firstInBreadthTraverse() {
        Queue<BinaryTreeNode> queue = new ArrayDeque<>();
        if (root != null)
            queue.offer(root);

        if (!queue.isEmpty())
            queue.poll().traverseInBreadth(queue);


    }

}
