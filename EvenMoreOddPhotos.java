import java.io.*; 
import java.util.*; 

class EvenMoreOddPhotos {
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine()); 
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int[] ID = new int[N]; 
		int numOdds = 0; 
		int numEvens = 0; 
		for (int i = 0; i < N; i++) {
			int nextID = Integer.parseInt(st.nextToken());
			if (nextID%2 == 0) {
				numEvens++; 
			}else {
				numOdds++; 
			}
			ID[i] = nextID; 
		}
	   // System.out.println(numOdds); 
		int maxGroups = 0; 
		if (numEvens == numOdds || numEvens == numOdds + 1) {
			maxGroups = numEvens + numOdds; 
		}
		else if (numEvens > numOdds + 1) {
			maxGroups = numOdds + numOdds + 1; 
		}
		else if (numEvens < numOdds) {
			//System.out.println(numEvens); 
			if (numOdds == numEvens + 1) {
				maxGroups = numOdds + numEvens - 2; //check this 
			}
			else {
				//System.out.println("a???"); 
				int it = 0; 
				//System.out.println(numEvens + " " + numOdds); 
				while (numEvens < numOdds){
					//System.out.println(numEvens + " " + numOdds); 
					if (it % 2 == 0) {
					numEvens++; 
					numOdds -= 2; 
					it++; 
				} else {
					it++; 
				}
			} maxGroups = numOdds + numEvens; 
				if (numEvens - numOdds > 1) {
					maxGroups = numOdds + numEvens - 1; 
				}
				
			}//System.out.println("ah"); 
		}
		System.out.println(maxGroups); 
		sc.close(); 
	}
}
