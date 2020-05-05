public class BST {
    Node root;
    
    public void add(int val) { 
 
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

    }
    
     public boolean isEmpty() {
        return size() == 0;
    }
}
