class Solution{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node root, int Key)
    {
        Node current = root;
        Node parent = null;
        
        while (current != null) {
            if (current.data > Key) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        
        if (parent == null) {
            return new Node (Key);
        }
        
        if (parent.data > Key) {
            parent.left = new Node (Key);
        } else if (parent.data < Key) {
            parent.right = new Node (Key);
        }
        
        return root;
    }
}
