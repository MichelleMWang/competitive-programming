import java.util.*; 
import java.io.*; 
class badmilk {
	public static void main (String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("badmilk.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("badmilk.out")));
	    StringTokenizer st = new StringTokenizer(f.readLine()); 
	    int n = Integer.parseInt(st.nextToken()); 
	    int m = Integer.parseInt(st.nextToken()); 
	    int d = Integer.parseInt(st.nextToken()); 
	    int s = Integer.parseInt(st.nextToken()); 
	    int[][] all = new int[d][3];
	    for (int i = 0; i < d; i++) {
	    	StringTokenizer stt = new StringTokenizer(f.readLine()); 
	    	all[i][0] = Integer.parseInt(stt.nextToken());
	    	all[i][1] = Integer.parseInt(stt.nextToken());
	    	all[i][2] = Integer.parseInt(stt.nextToken());
	    }
	    int[][] sick = new int[s][3]; 
	    for (int i = 0; i < s; i++) {
	    	StringTokenizer stt = new StringTokenizer(f.readLine()); 
	    	sick[i][0] = Integer.parseInt(stt.nextToken());
	    	sick[i][1] = Integer.parseInt(stt.nextToken());
	    }
	    
	    ArrayList<Integer> badmilk = new ArrayList<>(); 
	    ArrayList<Integer> temp = new ArrayList<>(); 
	    
	    for (int i = 0; i < s; i++) {  	
	    	for (int j = 0; j < d; j++) {
	    		 if (i == 0 && sick[i][0] == all[j][0] && sick[i][1] > all[j][2]) {
	    			 badmilk.add(all[j][1]); 
	    			 //System.out.println("badmilk: " + badmilk); 
	    		 } else if (sick[i][0] == all[j][0] && sick[i][1] > all[j][2]) {
	    			 //if its the sick person and it's before they got sick 
	    			 temp.add(all[j][1]);    			 
	    		 }
	    	} //end of loop through all ppl 
	
	    	if (i > 0) { 
	    	for (int k = 0; k < badmilk.size(); k++) { // if badmilk does not contain one of the ints in temp 
	    		if (temp.contains(badmilk.get(k)) == false){
	    			badmilk.remove(k); 
	    		}
	    	}
	    	temp.clear(); 
	    	}
	    }//end of loop through all sick ppl
	    	
	    	//'System.out.println("final: " + badmilk); 
	    //System.out.println(all[847][1]); 
	    	int numMed = 0; 
	    	String hasMed = "";  
	    	for (int j = 0; j < d; j++) {
	    	for (int i = 0; i < badmilk.size(); i++) {
	    		if (all[j][1] == badmilk.get(i) && hasMed.contains(" " + all[j][0] + " ") == false) {
	    			//System.out.println(hasMed); 
	    			numMed++; hasMed += " " + all[j][0] + " "; 
	    		}
	    	}
	    	} //System.out.println(numMed); 
	    	//System.out.println(hasMed); 
	    	out.println(numMed); 
	    	out.close(); f.close(); 
	    } 
	}



