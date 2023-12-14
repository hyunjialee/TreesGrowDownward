/**
 * Created by kristofer on 7/13/20.
 */
public class TreeOneZero {
    Node root;

    private Node addRecursive(Node current, Integer value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public void add(Integer value) {
        this.root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, Integer value) {
        if (current == null) {
            return false;
        }
        if (value.equals(current.value)) {
            return true;
        }
        if (value < current.value) {
            return containsNodeRecursive(current.left, value);
        } else {
            return containsNodeRecursive(current.right, value);
        }
    }

    public boolean containsNode(Integer value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, Integer value) {
        if (current == null) {
            return null;
        }
        if (value.equals(current.value)) {
                // Case 1: Node to be deleted has no children (leaf node)
                if (current.left == null && current.right == null) {
                    return null;
                }
                // Case 2: Node to be deleted has one child
                if (current.right == null) {
                    return current.left;
                } else if (current.left == null) {
                    return current.right;
                }
        } return current;
    }

    public void deleteNode (Integer value){
            root = deleteRecursive(root, value);
    }


    //Traversing the Tree
    // - Depth First search, Breadth-First search,

}
