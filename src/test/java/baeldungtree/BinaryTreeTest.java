package baeldungtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = BinaryTree.createBinaryTree();

        assertTrue(bt.containsNode(5));

    }

    @Test
    public void testInPreOrder(){
        BinaryTree bt = BinaryTree.createBinaryTree();
        bt.traverseInPreOrder(bt.root);
    }


}