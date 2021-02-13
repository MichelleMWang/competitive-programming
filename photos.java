import java.io.*; 
import java.util.*; 
class photos {
	public static void main (String[] args ) throws IOException{
		Scanner stdin = new Scanner(System.in);
		int numCows = Integer.parseInt(stdin.nextLine()); 
		String cows1 = stdin.nextLine(); 
		ArrayList<Integer> cows = new ArrayList<>(); 
		StringTokenizer st = new StringTokenizer(cows1); 
		for (int i = 0; i < numCows; i++) {
			cows.add(i, Integer.parseInt(st.nextToken())); 
		}
		int numGroups = 0; 
		int smallestEven = 101; 
		int indexSE = 1001; 
		
	for (int g = 0; g < numCows/2; g++) {
			
		for (int i = 0; i < cows.size(); i++) {
			if ((cows.get(i) < smallestEven)&& cows.get(i) % 2 == 0) {
				smallestEven = cows.get(i); 
				indexSE = i; 
			}	
		} 
		if (indexSE != 1001) { // remove index of smallest even 
				numGroups++; 
			cows.remove(indexSE);
		}else {	//if no evens, find 2 smallest nums and add 
			int smlOdd = 101; 
			int smlOdd2 = 101; 
			int ind = 1001; 
			int ind2 = 1001; 
			for (int r = 0; r < cows.size(); r++) {
				if (cows.get(r) < smlOdd2) {
					if (cows.get(r) < smlOdd) {
						smlOdd = cows.get(r);
						ind = r; 
					} else {
						smlOdd2 = cows.get(r); 
						ind2 = r; 
					}
				}
		}   if (ind != 1001 && ind2 != 1001) {
				cows.remove(ind);
				if (cows.size() == 0) {
					break;
				} else {
			cows.remove(ind2); 
			numGroups++; }
		} else {
			break; 
		}
		}
		if (cows.size() == 0) break; 		
		int smallestOdd = 101; 
		int indexSO = 1001; 
		for (int f = 0; f < cows.size(); f++) {
			if ((cows.get(f) < smallestOdd)&& cows.get(f) % 2 == 1) {
				smallestOdd = cows.get(f); 
				indexSO = f; 
			}
		} if (indexSO != 1001) {
		cows.remove(indexSO); numGroups++; } else break; 
		
	}System.out.println(numGroups-1); 
	}
}
