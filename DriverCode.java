package project5;

import java.util.Scanner;

/*This class tests the code*/
public class DriverCode {

	public static void main(String[] args) throws Exception {
		
		Edge[] distance = {new Edge(70, 0, 1), new Edge(50, 0, 2), new Edge(70, 0, 3), new Edge(60, 1, 2), new Edge(75, 1, 4), 
				new Edge(70, 1, 5), new Edge(30, 2, 4), new Edge(60, 2, 3), new Edge(70, 3, 6),new 
			    Edge(75, 4, 5), new Edge(75, 4, 6), new Edge(70, 4, 7), new Edge(80, 5, 7), new Edge(80, 6, 7)};
			    
		Graph myMall = new Graph(distance); //create an object of Graph class
		myMall.ShortestPath(); //calculate shortest path
		
		
		System.out.println("Welcome to The Mall. Press 1 to see the shortest distance to all stores from you!");
		try (Scanner scan = new Scanner(System.in)) {
			int input = scan.nextInt();
			if(input == 1) {
				myMall.print_output();
			}
		}
			    
		   	   
		}
		
	}

