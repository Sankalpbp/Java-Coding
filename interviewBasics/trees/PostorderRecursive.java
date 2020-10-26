class Tree
{
    
    void postOrder (Node root, ArrayList<Integer> arr) {
        
        if (root != null) {
            postOrder (root.left, arr);
            postOrder (root.right, arr);
            arr.add(root.data);
        }
    }
    
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        
        postOrder (root, arr);
        
        return arr;
    }
}
