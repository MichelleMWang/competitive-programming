import java.io.*; 
import java.util.*; 

class buckets {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("buckets.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out")));
	    int[] B = new int[2]; 
	    int[] R = new int[2]; 
	    int[] L = new int[2]; 
	    
	    char[][] farm = new char[10][10]; 
	    for (int i = 0; i < 10; i++) {
	    	System.out.print(i);
	    	for(int j = 0; j < 10; j++) {
	    		
	    		char dot = (char)f.read(); 
	    		while(dot != '.' ) {
	    			if (dot == 'B') break; 
	    			else if (dot == 'R') break; 
	    			else if (dot == 'L') break; 
	    			else dot = (char)f.read(); 
	    		}
	    		System.out.print(dot); 
	    		farm[i][j] = dot; 
	    		if (dot == 'B') {
	    			//System.out.println("ohboy"); 
	    			B[0] = i; B[1] = j;  
	    		}
	    		else if (dot == 'R') {
	    			R[0] = i; R[1] = j; 
	    		}
	    		else if (dot == 'L') {
	    			L[0] = i; L[1] = j; 
	    			//System.out.println("ohboy"); 
	    		}
	    	}
	    }
	    int distance = Math.abs((B[1] - L[1])) + Math.abs((B[0] - L[0])) -1; 
	    System.out.println("B: " + B[0] + " " + B[1] + " L: " + L[0] + " " + L[1] + " R: " +R[0] + " " +R[1] + " ");
	    if ((B[1]== R[1] && B[1]== R[1] || B[0]== R[0] && B[0]== R[0])){
	    	distance++; 
	    	//System.out.println("frick"); 
	    }
	    out.println(distance); 
	    out.close(); f.close(); 
	}

}
