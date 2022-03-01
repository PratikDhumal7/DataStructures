package bootstrap;

import domain.Node;
import java.util.Scanner;

public class Driver {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Node tree = createTree();
        System.out.println(tree);
    }

    static Node createTree() {

        Node root;
        System.out.println("Enter the data for the node");
        float rootData = sc.nextFloat();
        if (rootData == -1) {
            return null;
        }
        root = new Node(rootData);

        System.out.println("Enter the data for left node of " + root.getData());
        root.setLeftChild(createTree());

        System.out.println("Enter the data for right node of " + root.getData());
        root.setRightChild(createTree());

        return root;

    }
}
