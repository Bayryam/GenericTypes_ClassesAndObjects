
import Trees.*;
import superheroes.Hero;
import superheroes.Mage;
import superheroes.Rogue;
import superheroes.Warrior;
import superheroes.Battlefield;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Hero warrior = new Warrior(1, 1, 1);
        Hero mage = new Mage(1, 1, 1);
        Hero rogue = new Rogue(1, 1, 1);
        ArrayList<Hero> heroes  =new ArrayList<>();

        heroes.add(warrior);
        heroes.add(mage);
        heroes.add(rogue);
        Battlefield battle = new Battlefield(heroes);
        battle.startBattle();




//        BinaryTreeNode first = new BinaryTreeNode(1);
//        BinaryTreeNode second = new BinaryTreeNode(2);
//        BinaryTreeNode third = new BinaryTreeNode(3);
//        BinaryTreeNode a = new BinaryTreeNode(4);
//        BinaryTreeNode b = new BinaryTreeNode(5);
//        BinaryTreeNode c = new BinaryTreeNode(6);
//        BinaryTreeNode d = new BinaryTreeNode(7);
//        BinaryTree tree = new BinaryTree(first);
//        second.addLeft(a);
//        second.addRight(b);
//        third.addLeft(c);
//        first.addLeft(second);
//        first.addRight(third);
//        //tree.firstInDepthTraverse();
//        //tree.firstInBreadthTraverse();
//        System.out.println(tree.insert(d));


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