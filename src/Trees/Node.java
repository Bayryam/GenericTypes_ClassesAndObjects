package Trees;

import java.util.ArrayList;

public class Node<T> implements NodeInterface
{
    T value;
    ArrayList<NodeInterface> children;

    public Node(T value)
    {
     this.value = value;
        children = new ArrayList<>();
    }

    public void traverseNode(){
        System.out.println(value);
        for (int i = 0;i<children.size();i++)
            children.get(i).traverseNode();
    }

    public void addNode(NodeInterface node)
    {
        children.add(node);
    }
}
