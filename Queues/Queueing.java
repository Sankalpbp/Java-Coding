import java.util.*;
import java.io.*;

public class Queueing {
		
	public static void main (String [] args) throws Exception {
			
		ArrQueue q = new ArrQueue ();

		q.push (1);
		q.push (2);

		System.out.println (q.front ());

		q.pop ();

		System.out.println (q.front ());

		q.pop ();

		System.out.println (q.front ());

		q.pop ();
	}
}
