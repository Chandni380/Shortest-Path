package project5;
import java.util.ArrayList;
/*This class Node sets up the methods related to Nodes*/

public class Node {
	
	private int distance_source = Integer.MAX_VALUE; //initialize the distance from source node to any other node to infinity 
	private boolean visitednodes;
	private ArrayList<Edge> edge_list = new ArrayList<Edge>(); //arraylist of edges
	
	//check if a node is visited
	public boolean isVisitednodes() {
		return visitednodes;
	}
	//getters & setters  
	public int getDistance_source() {
		return distance_source;
	}
	  	
	public void setDistance_source(int distance_source) {
		this.distance_source = distance_source;
	}
			
	public void setVisitednodes(boolean visitednodes) {
		this.visitednodes = visitednodes;
	}
		
	public ArrayList<Edge> getEdge_List() {
		return edge_list;
	}
		
	public void setEdge_List(ArrayList<Edge> edge_list) {
		this.edge_list = edge_list;
	}
}
