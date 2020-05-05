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
        
        return root; 
    } 
            
    }
    
     public boolean isEmpty() {
        return size() == 0;
    }
}
