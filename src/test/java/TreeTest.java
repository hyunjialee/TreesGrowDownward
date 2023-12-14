import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        TreeOneZero bt = new TreeOneZero();

        bt.add(6);
        bt.add(4);
        bt.add(1);


        Assert.assertTrue(bt.containsNode(6));
        Assert.assertTrue(bt.containsNode(4));

        Assert.assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        TreeOneZero bt = new TreeOneZero();

        Assert.assertTrue(bt.containsNode(9));
        bt.deleteNode(9);
        Assert.assertFalse(bt.containsNode(9));
    }
}
