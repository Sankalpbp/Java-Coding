class Node {
	int data;
	Node next;

	public Node (int data) {
		this.data = data;	
		this.next = null;
	}
}

public class LinkedList {
		
	public Node head;

	public LinkedList () {
		head = null;
	}

	public void insert (int data) {
		System.out.println (data);
		Node newNode = new Node (data);

		newNode.next = head;
		head = newNode;
	}
}
