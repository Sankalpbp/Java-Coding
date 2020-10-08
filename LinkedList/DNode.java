import java.util.*;

public class DNode {
		
	public int data;
	public DNode previous;
	public DNode next;

	public DNode (int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}
}
