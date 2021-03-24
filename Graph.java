package project5;

import java.util.ArrayList;
/*This class Graph sets up the methods related to creation of a graph containing nodes & edges*/

public class Graph {
	  private Node[] arr_nodes;
	  private Edge[] arr_edges;
	  private int totalnodes;
	  private int totaledges;
	  
	  //constructor 
	  public Graph(Edge[] arr_edges) {
		  this.arr_edges = arr_edges;
		  //create nodes for the graph
		  totalnodes = NoofNodes(arr_edges);
		  arr_nodes = new Node[totalnodes];
		  for (int i = 0; i < totalnodes; i++) {
			  arr_nodes[i] = new Node();
		  }
		  //create edges for the nodes of the graph
		  totaledges = arr_edges.length;
		  for (int i = 0; i < totaledges; i++) {
			  arr_nodes[arr_edges[i].getstartIndex()].getEdge_List().add(arr_edges[i]);
			  arr_nodes[arr_edges[i].getTargetIndex()].getEdge_List().add(arr_edges[i]);
		  }
	  }
	 
	 //getters & setters
	 public Node[] getArr_Nodes() {
		return arr_nodes;
	 }

	 public void setArr_Nodes(Node[] arr_nodes) {
		this.arr_nodes = arr_nodes;
	 }

	 public int getTotalnodes() {
		return totalnodes;
	 }

	 public void setTotalnodes(int totalnodes) {
		this.totalnodes = totalnodes;
	 }

	 public Edge[] getArr_Edges() {
		return arr_edges;
	 }

	 public void setArr_Edges(Edge[] arr_edges) {
		this.arr_edges = arr_edges;
	 }

	 public int getTotaledges() {
		return totaledges;
	 }

	 public void setTotaledges(int totaledges) {
		this.totaledges = totaledges;
	 }

		
	// Calculate the number of nodes in an array of edges 
	private int NoofNodes(Edge[] edge) {
	    int nodes = 0; // to start with total node is  0
	    for (Edge edges : edge) {
	      if (edges.getTargetIndex() > nodes)
	    	  nodes = edges.getTargetIndex();
	    }
	    nodes++; // increase node by 1
	    return nodes; // return updated nodes
	 }
	
	//calculate shortest path
	 public void ShortestPath() throws Exception {
	    arr_nodes[0].setDistance_source(0);
	    int next = 0; //next node
	    // traverse through every node
	    for (int i = 0; i < arr_nodes.length; i++) {
	      // loop around the edges of current node
	      ArrayList<Edge> current = arr_nodes[next].getEdge_List(); // current node
	      for (int j = 0; j < current.size(); j++) {
	        int Index = current.get(j).getAdjacentIndex(next);
	        // traverse only if not visited
	        if (!arr_nodes[Index].isVisitednodes()) {
	          int dist = arr_nodes[next].getDistance_source() + current.get(j).getWeight();
	          if (dist < arr_nodes[Index].getDistance_source()) {
	        	  arr_nodes[Index].setDistance_source(dist);
	          }
	        }
	      }
	      arr_nodes[next].setVisitednodes(true);
	      next = shortestDistance();
	   }
	  }

	  private int shortestDistance() {
	    int curr_node = 0;
	    int node_distance = Integer.MAX_VALUE;
	    for (int i = 0; i < arr_nodes.length; i++) {
	      int current_distance = arr_nodes[i].getDistance_source();
	      if (!arr_nodes[i].isVisitednodes() && current_distance < node_distance) {
	    	  node_distance = current_distance;
	        curr_node = i;
	      }
	    }
	    return curr_node;
	  }
 
	  //print output
	  public void print_output() {	
		  for (int i = 0; i < arr_nodes.length; i++) {
			  System.out.println("The shortest distance from current location to store " + i + " is " + arr_nodes[i].getDistance_source()+ " meters.");

		  }
	  }
}
