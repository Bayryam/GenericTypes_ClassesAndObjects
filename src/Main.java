
import Trees.*;

public class Main {
    public static void main(String[] args) {

        BinaryTreeNode first = new BinaryTreeNode(1);
        BinaryTreeNode second = new BinaryTreeNode(2);
        BinaryTreeNode third = new BinaryTreeNode(3);
        BinaryTreeNode a = new BinaryTreeNode(4);
        BinaryTreeNode b = new BinaryTreeNode(5);
        BinaryTreeNode c = new BinaryTreeNode(6);
        BinaryTree tree = new BinaryTree(first);
        second.addLeft(a);
        second.addRight(b);
        third.addLeft(c);
        first.addLeft(second);
        first.addRight(third);
        tree.firstInDepthTraverse();
        tree.firstInBreadthTraverse();


        //NodeInterface first = new Node<>("f");
        //NodeInterface second = new Node<>('s');
        //NodeInterface third = new Node<>('t');
        //NodeInterface a = new Node<>('a');
        //NodeInterface b = new Node<>('b');
        //NodeInterface c = new Node<>('c');
        //HeterogeneousTree tree = new HeterogeneousTree(first);
        //second.addNode(a);
        //second.addNode(b);
        //third.addNode(c);
        //tree.add(second);
        //tree.add(third);
        //tree.traverse();



    }
}