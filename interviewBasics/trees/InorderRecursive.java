class Tree
{
    void inorder(Node root, ArrayList<Integer> arr) {
        
        if (root != null) {
            inorder(root.left, arr);
            arr.add(root.data);
            inorder(root.right, arr);
        }
    }
    
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        inorder(root, arr);
        
        return arr;
    }
}
