import java.util.*;
import java.io.*;

public class ArrStack {
		
	private ArrayList <Integer> stack = null;
	private int topp;

	public ArrStack () {
		stack = new ArrayList <Integer> ();
		topp = -1;	
	}

	public int size () {
		return topp + 1;
	}

	public void push (int x) {
		stack.add(x);
		topp += 1;
	}

	public void pop () throws Exception {
		if (topp < 0) {
			throw new Exception ("Stack Overflow");
		}

		stack.remove (topp);
		--topp;
	}

	public int top () throws Exception {

		if (topp < 0) {
			throw new Exception ("Stack Overflow");
		}
		return stack.get(topp);
	}
}
