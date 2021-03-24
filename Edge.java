package project5;

public class Edge {
	  private int weight; //length in between
	  private int startIndex; //from source vertex
	  private int targetIndex; // to target vertex
	  
	  
	  
	  public Edge(int weight, int startIndex, int targetIndex) {
		this.weight = weight;
		this.startIndex = startIndex;
	    this.targetIndex = targetIndex;
	    	  }
	  public int getWeight() {
		    return weight;
		  }
	  public int getstartIndex() {
	    return startIndex;
	  }
	  public int getTargetIndex() {
	    return targetIndex;
	  }
	  
	  
	  // considers the adjacent node of a supplied node,
	  //based on the two nodes connected by this points
	  public int getAdjacentIndex(int nodeIndex) {
	    if (this.startIndex == nodeIndex) {
	      return this.targetIndex;
	    } else {
	      return this.startIndex;
	   }
	  }
}

