package Trees;

import java.util.Queue;

public class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public boolean addLeft(BinaryTreeNode node) {
        if (left == null) {
            left = node;
            return true;
        } else {
            return false;
        }
    }

    public boolean addRight(BinaryTreeNode node) {
        if (right == null) {
            right = node;
            return true;
        } else {
            return false;
        }
    }

    public void traverseInDepth() {
        System.out.println(value);
        if (left != null)
            left.traverseInDepth();
        if (right != null)
            right.traverseInDepth();
    }

    public void traverseInBreadth(Queue<BinaryTreeNode> queue) {
        System.out.println(value);
        if (left != null)
            queue.offer(left);
        if (right != null)
            queue.offer(right);
        if (!queue.isEmpty())
            queue.poll().traverseInBreadth(queue);
    }

}
