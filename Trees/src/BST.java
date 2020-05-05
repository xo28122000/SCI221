public class BST {
    Node root;
    
    public void add(Node root, int val) { 
 Node newLeaf = new Node(val);
        
        if (root == null) { 
            root = new Node(val); 
            return root; 
        } 
        if (this.val < root.val) 
            root.left = add(root.left, val); 
        else if (this.val > root.val) 
            root.right = add(root.right, val); 
        return root; 
    }
         }

    public void print(){
System.out.println("Congrats! You've added" + val);
    }

    public void delete(int val) {
 if (root == null)  return root; 
        if (val < root.key) 
            root.left = delete(root.left, val); 
        else if (va; > root.val) 
            root.right = delete(root.right, val); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.key); 
        } 
  
        return root; 
    } 
            
    }
    
     public boolean isEmpty() {
        return size() == 0;
    }
}
