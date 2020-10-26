class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        
        Stack<Node> pending = new Stack<Node> ();
        pending.push(root);
        Node current = null;
        
        while (pending.isEmpty() == false) {
            
            current = pending.pop();
            arr.add(current.data);
            
            if (current.right != null) {
                pending.push(current.right);
            }
            
            if (current.left != null) {
                pending.push(current.left);
            }
            
        }
        
        return arr;
    }
}
