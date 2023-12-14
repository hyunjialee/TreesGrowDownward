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

}
