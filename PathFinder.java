import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathFinder {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\Lilo\\Desktop\\cities.txt");// The
																		// name
																		// of
																		// the
																		// file
																		// to
																		// open.

		int id = 0;
		Scanner scan = new Scanner(file);
		int verticles = scan.nextInt();
		Graph gr = new Graph(verticles + 1);
		String[] arr = new String[verticles + 1];
		for (int i = 1; i < arr.length; i++) {

			arr[i] = scan.nextLine();
			gr.addConnection(id, arr[i]);
		}

		int source = 0;
		bfs search = new bfs(gr, source);

		for (int vertex = source + 1; vertex < gr.verticesInGraph(); vertex++) {
			System.out.print("Path from " + source + " to " + vertex + " : ");
		}

		Stack pathStack = new Stack();

		// Make sure that there is path to the vertex
		if (search.hasPathTo(id)) {
			List path = new ArrayList();
			// Put the path in a list (this will be a backwards path)
			path = search.pathTo(id);

			// Put the path in a Stack so we can reverse it
			for (int connection : path)
				pathStack.push(connection);

			// Go over the stack to print a path
			while (!pathStack.isEmpty()) {
				// Remove an item form the stack and put it in theVertex
				// variable
				int theVertex = pathStack.pop();

				if (theVertex == source)
					System.out.print(theVertex);
				else
					System.out.print("-" + theVertex);
			}
			System.out.println();
		}

	}
}