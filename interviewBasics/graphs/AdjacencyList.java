import java.util.*;
import java.io.*;

public class AdjacencyList {

	public int vertices, edges;
	public LinkedList [] adjList;

	public AdjacencyList (int vertices) {
			
		this.vertices = vertices;
		adjList = new LinkedList [vertices];
		for (int i = 0; i < vertices; ++i) {
			adjList[i] = new LinkedList ();
		}
	}

	public void addEdge (int source, int destination) {
		
		System.out.println (source + " " + destination);
		adjList[source].insert (destination);
		adjList[destination].insert (source);
	}

	public void print () {
		
		System.out.println ("\n\n");

		for (int i = 0; i < vertices; ++i) {
			
			Node ptr = adjList[i].head;
			while (ptr != null) {
				System.out.print (ptr.data + " -> ");
				ptr = ptr.next;
			}
			System.out.println ("");
		}

		System.out.println ("\n\n");
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int vertices = Integer.parseInt (input.readLine ());
		int edges = Integer.parseInt (input.readLine ());

		AdjacencyList graph = new AdjacencyList (vertices);

		graph.addEdge (0, 1);
		graph.addEdge (1, 2);
		graph.addEdge (2, 3);
		graph.addEdge (3, 1);

		graph.print();
	}
}

