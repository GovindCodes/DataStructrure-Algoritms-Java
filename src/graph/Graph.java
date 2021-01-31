package graph;

import java.util.*;

public class Graph {
	
	public static void printHelper(int edges[][] , int sv, boolean visited[]) {
		System.out.print(sv);
		visited[sv] = true;
		for(int i=0; i<edges[sv].length; i++) {
			if(edges[sv][i]!=0 && !visited[i]) {
				printHelper(edges, i , visited);
			}
		}
	}
	
	
	public static void print(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i=0; i<edges.length; i++) {
			if(!visited[i])
			printHelper(edges, i, visited);
		}
		
	}
	
	public static void printHelper1(int edges[][], int sv, boolean visited[]) {
		
		visited[sv] = true;
		for(int i=0; i<edges.length; i++) {
			if(edges[sv][i] == 1 && !visited[i]) {
				
			}
		}
	}
	
	public static void print1() {
		Queue<Integer> mq = new ArrayDeque<>();
		mq.add(sv);
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt(); //vertices
		int e = sc.nextInt(); //edges
		
		int edges[][] = new int[n][n];
		
		for(int i=0; i<e ;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			edges[v1][v2] = 1;
			edges[v2][v1]=  1;
		}
		
		print(edges);
		
		
		
	}

}
