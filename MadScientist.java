import java.io.*; 
import java.util.*; 

class MadScientist {
	public static void main (String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("breedflip.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
	    int n = Integer.parseInt(f.readLine());
	    char[] a = f.readLine().toCharArray(); 
	    char[] b = f.readLine().toCharArray(); 
	    boolean mismatch = false; 
	    int numFlip = 0; 
	    for (int i = 0; i < n; i++) {
	    	if (a[i] != b[i]) {//if a and b are not the same 
	    		if (mismatch == false) { //if first time mismatched 
	    			mismatch = true; 
	    			numFlip++; 
	    		} 
	    		 
	    	}else {mismatch = false;} 
	    }
	
	    
	     out.println(numFlip); 
	    f.close(); out.close(); 
	
	    }
}
