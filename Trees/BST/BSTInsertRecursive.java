class Solution{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node root, int Key)
    {
        if (root == null) {
            return new Node (Key);
        }
        
        if (root.data > Key) {
            root.left = insert (root.left, Key);
        }
        
        if (root.data < Key) {
            root.right = insert (root.right, Key);
        }
        
        return root;
    }
}
