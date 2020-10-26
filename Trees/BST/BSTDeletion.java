class BSTDeletion
{
    
    public static Node minValueNode (Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        
        return minValueNode (root.left);
    }
    
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int X)
	{
        if (root == null) {
            return root;
        }
        
        if (root.data > X) {
            root.left = deleteNode (root.left, X);
        } else if (root.data < X) {
            root.right = deleteNode (root.right, X);
        } else {
            
            // we found the Node with X as its data
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                
                Node temp = minValueNode (root.right);
                
                root.data = temp.data;
                
                root.right = deleteNode (root.right, temp.data);
            }
        }
        
        return root;
	}
}
