import java.util.*;
import java.io.*;

public class AdjacencyMatrix {

	public int vertices;
	public int edges;
	public boolean [][] adjMatrix;

	public BufferedReader input;

	public AdjacencyMatrix (int vertices, int edges) throws IOException {
			
		this.vertices = vertices;
		this.edges = edges;

		input = new BufferedReader (new InputStreamReader (System.in));

		adjMatrix = new boolean[vertices][vertices];

		for (int i = 0; i < vertices; ++i) {
			for (int j = 0; j < vertices; ++j) {
				adjMatrix[i][j] = false;
			}
		}

		for (int i = 0; i < edges; ++i) {
			int source = Integer.parseInt (input.readLine());
			int destination = Integer.parseInt (input.readLine());

			addEdge(source, destination);
		}
	}

	public void addEdge (int source, int destination) {
		adjMatrix[source][destination] = true;
		adjMatrix[destination][source] = true;
	}

	public void printAdjacencyMatrix () {
			
		for (int i = 0; i < vertices; ++i) {
			for (int j = 0; j < vertices; ++j) {
				System.out.print (adjMatrix[i][j] + "\t");
			}

			System.out.println ();
		}
	}
		
	public static void main (String [] args) throws IOException {
			
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		int vertices = Integer.parseInt (input.readLine());
		int edges = Integer.parseInt (input.readLine());

		AdjacencyMatrix graph = new AdjacencyMatrix (vertices, edges);
		
		graph.printAdjacencyMatrix ();
	}
}
















