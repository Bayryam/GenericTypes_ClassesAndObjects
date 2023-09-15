package Trees;

import java.util.Queue;

public class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public int getValue() {
        return value;
    }

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

    public boolean searchFor(BinaryTreeNode node) {
        if (value == node.getValue())
            return true;
        else if (left  == null && right == null)
            return false;
        else if (left == null)
            return right.searchFor(node);
        else if(right == null)
            return left.searchFor(node);
        else
            return left.searchFor(node) || right.searchFor(node);



    }

    public void insertIn(BinaryTreeNode newNode)
    {
        if (left == null) {
            left = newNode;
        }
        else {
            left.insertIn(newNode);
        }
    }
}
