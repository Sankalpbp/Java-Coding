class BinaryTree
{
    
    static void preorder (Node root, ArrayList<Integer> arr) {
        
        if (root != null) {
            arr.add(root.data);
            preorder(root.left, arr);
            preorder (root.right, arr);
        }
    }
    
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        preorder (root, arr);
        
        return arr;
    }
}
