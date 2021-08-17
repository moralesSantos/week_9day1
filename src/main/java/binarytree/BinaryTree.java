package binarytree;

public class BinaryTree {

    public Node root;

    public Node insertNode(Node current, int key){
        /**
         * This checks to see if the node we're working with is null,
         * and returns a new node if it is.
         */
        if (current== null){
            return new Node(key);
        } else if (key < current.getKey()){
            /*
            checks to see if leftNode key is lessor than currently handled key
             and places to the left
             */
            current.setLeftNode(insertNode(current.getLeftNode(),key));
        } else if (key > current.getKey()) {
            /*
            check to see if the rightNode is greater than currently handled key
            and places to the right
             */
            current.setRightNode(insertNode(current.getRightNode(), key));
        }else {
            return current;
        }
        return current;
    }

    public void add(int key){
        root = insertNode(root , key);
    }

    @Override
    public String toString() {
        return "binarytree.BinaryTree{" +
                "root=" + root +
                '}';
    }
}
