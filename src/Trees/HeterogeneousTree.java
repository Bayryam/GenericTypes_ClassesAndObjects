package Trees;

public class HeterogeneousTree {
    NodeInterface root;

    public HeterogeneousTree(NodeInterface root)
    {
     this.root = root;
    }
    public void traverse(){
        root.traverseNode();
    }

    public void add(NodeInterface newNode)
    {
        root.addNode(newNode);
    }
}
