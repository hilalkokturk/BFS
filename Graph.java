import java.util.ArrayList;
import java.util.List;

public class Graph
{
    private int n;
    private List[] adj;
    
    //Create a Graph and take the number of vertices in the graph as a parameter
    public Graph(int numberOfVertices) 
    {
        n = numberOfVertices;
        adj = (List[])new List[n];		//Our array will contain lists of type Integer (our adjacency list)
     
        for (int i = 0; i < n; i++) 			//Initialize each item in the array
            adj[i] = new ArrayList();
    }

    public void addConnection(int vertexA, String vertexB)
    {
        adj[vertexA].add(vertexB);
    }
    
    //Return the amount of vertices in a graph
    public int verticesInGraph()
    {
    	    return adj.length;
    }
    
    //This method returns all vertices connected to vertex v
    public List getVerticesConnectedTo(int v)
    {
    	    return adj[v];
    }
}