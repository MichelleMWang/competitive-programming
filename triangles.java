import java.io.*; 
import java.util.*; 
class triangles {
	public static void main (String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("triangles.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
	    int n = Integer.parseInt(f.readLine());
	    int[] x = new int[n]; 
	    int[] y = new int[n]; 
	    for (int i = 0; i < n; i++) {
	    	StringTokenizer st = new StringTokenizer(f.readLine());
	    	x[i] = Integer.parseInt(st.nextToken()); 
	    	y[i] = Integer.parseInt(st.nextToken()); 	
	    }
	    int maxX = 0; 
	    int maxY = 0; 
	    int maxA = 0; 
	    for (int i = 0; i < n; i++) {
	    	for (int j = 0; j < n; j++) {
	    		if (x[j] == x[i] && Math.abs(y[j] - y[i]) > maxY) {
	    			maxY = Math.abs(y[j] - y[i]); 
	    		}
	    		if (y[j] == y[i] && Math.abs(x[j] - x[i]) > maxX) {
	    			maxX = Math.abs(x[j] - x[i]); 
	    		}
	    	}
	    	if (maxX * maxY > maxA) {
	    		maxA = maxX * maxY; 
	    	}
	    	maxX = 0; maxY = 0; 
	    }
	    out.println(maxA); 
	    f.close(); out.close(); 
	}

}
