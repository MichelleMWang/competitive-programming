import java.io.*; 
import java.util.*; 

class wordprocessor {
	public static void main (String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("word.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
	    StringTokenizer nums = new StringTokenizer(f.readLine());
	    int n = Integer.parseInt(nums.nextToken()); 
	    int k = Integer.parseInt(nums.nextToken()); 
	    StringTokenizer st = new StringTokenizer(f.readLine());
	    int soFar = 0; 
	    String line = ""; 
	    for (int i = 0; i < n; i++) {
	    	String next = st.nextToken(); 
	    	//System.out.println(next); 
	    	if (soFar + next.length() <= k) { // there is space for this word 
	    		soFar += next.length(); 
	    		line += next + " "; 
	    		if (i == n-1) {
	    			out.println(line.substring(0, line.length()-1)); 
	    		}
	    	} else { // if too big 
	    		out.println(line.substring(0, line.length()-1)); //print previous line 
	    		line = ""; 
	    		soFar = 0; 
	    		soFar += next.length(); 
	    		line += next + " "; 
	    		if (i == n-1) {
	    			out.println(line.substring(0, line.length()-1)); 
	    		}
	    	}
	    
	    }
	
	
	
	
	f.close(); out.close(); 
	}
}
