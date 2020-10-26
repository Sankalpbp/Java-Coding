class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        
        Stack<Node> pending = new Stack<Node> ();
        Node current = root; 
        
        while (current != null || pending.isEmpty() == false) {
            
            while (current != null) {
                pending.push(current);
                current = current.left;
            }
            
            current = pending.pop();
            
            arr.add(current.data);
            
            current = current.right;
        }
        
        return arr;
    }
}
