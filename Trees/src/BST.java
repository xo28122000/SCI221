
public class BST {

    Node root;

    public void add(int val) {
        Node addNode = new Node(val);
        if (root == null) {
            root = addNode;
            return;
        }

        Node tempNode = root;
        while (true) {
            if (val > root.value) {
                if (tempNode.right == null) {
                    // add new node here
                    tempNode.right = addNode;
                    break;
                }
                tempNode = tempNode.right;
            }
            
            else if (val < tempNode.value) {
                if (tempNode.left == null) {
                    tempNode.left = addNode;
                    // add new node here
                    break;
                }
                tempNode = tempNode.left;
            }
            
            else {
                break;
            }
        }
    }
    
    public void recursivePrintHelper(Node node) {
        // check if node is null - stop if it is
        // print
        // recursivePrintHelper(left)
        // recursivePrintHelper(right)
        if (node == null) {
        }
        else {
            System.out.println(node.value);     // pre order traversal
            recursivePrintHelper(node.left);
            recursivePrintHelper(node.right);
        }
    }

    public void print() {
        // check if root is null
        // make temp node
        // recursivePrintHelper(root)
        if (root == null) {
            return;
        }
        recursivePrintHelper(root);
    }

    public void delete(int val) {

    }
}
