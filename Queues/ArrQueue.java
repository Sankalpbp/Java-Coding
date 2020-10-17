import java.util.*;
import java.io.*;

public class ArrQueue {
		
	private List<Integer> q;
	private int front;
	private int rear;

	public ArrQueue () {
		q = new ArrayList <Integer> ();

		front = -1;
		rear = -1;
	}

	public void push (int x) {

		if (q.isEmpty() == false) {
			front = 0;
		}

		q.add (x);
		++rear;
	}

	public void pop () throws Exception {
		if (front == -1 || front > rear) {
			throw new Exception ("Queue underflow");
		}

		++front;
	}

	public int front () throws Exception {
		if (front == -1 || front > rear) {
			throw new Exception ("Queue underflow");
		}

		return q.get(front);
	}
}
