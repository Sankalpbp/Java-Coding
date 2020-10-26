class Tree
{
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        
        Stack<Node> pending = new Stack<Node> ();
        Stack<Integer> finall = new Stack<Integer> ();
        
        Node current = root;
        pending.push(root);
        
        while (pending.isEmpty() == false) {
            
            current = pending.pop();
            finall.push(current.data);
            
            if (current.left != null) {
                pending.push(current.left);
            }
            
            if (current.right != null) {
                pending.push(current.right);
            }
        }
        
        while (finall.isEmpty() == false) {
            arr.add(finall.pop());
        }
        
        return arr;
    }
}
