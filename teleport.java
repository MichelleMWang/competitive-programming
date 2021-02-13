import java.io.*; 
import java.util.*;
class teleport {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("teleport.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
	    String input = f.readLine(); 
	    StringTokenizer str = new StringTokenizer(input); 
	    int[] path = new int[str.countTokens()]; 
	    int count = 0; 
	    while (str.hasMoreTokens()) {
	    	path[count] = Integer.parseInt(str.nextToken()); 
	    	count++; 
	    }
	    //System.out.println(Arrays.toString(path)); 
	    Arrays.sort(path);
	    int highest = 0;
	   
	    for (int i = 0; i < path.length-1; i++) {
	    	if (path[i+1] - path[i] > highest) {
	    	    //System.out.println(path[i+1]  + " " + path[i]);
	    		highest = path[i+1] - path[i]; 
	    		//System.out.println(highest + " " + i); 
	    	}
	    }
	    int distance = path[path.length - 1] - path[0] - highest;
	    out.println(distance); 
	    out.close(); f.close(); 
	}
}
