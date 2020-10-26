class BSTSearchIterative
{
    boolean search(Node root, int x)
    {
        Node current = root;
        
        while (current != null) {
            if (current.data == x) {
                return true;
            } else if (current.data > x) {
                current = current.left;
            } else if (current.data < x) {
                current = current.right;
            }
        }    
        
        return false;
    }
}
