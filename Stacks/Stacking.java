import java.util.*;
import java.io.*;

public class Stacking {
		
	public static void main (String [] args) throws Exception {
			
		LinkedStack st = new LinkedStack ();

		st.push(1);
		System.out.println (st.top());

		st.push(2);
		System.out.println (st.top());

		st.push(3);
		System.out.println (st.top());

		st.push(4);
		System.out.println (st.top());

		st.push(5);
		System.out.println (st.top());

		st.pop();
		System.out.println (st.top());

		st.pop();
		System.out.println (st.top());

		st.pop();
		System.out.println (st.top());

		st.pop();
		System.out.println (st.top());

		st.pop();
		System.out.println (st.top());

		st.pop();
		System.out.println (st.top());
	}
}
