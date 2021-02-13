import java.io.*; 
import java.util.*; 
class stalling {
	public static void main (String[] args) throws IOException{
		Scanner stdin = new Scanner(System.in);
		int numCows = Integer.parseInt(stdin.nextLine()); 
		StringTokenizer st = new StringTokenizer(stdin.nextLine());
		int[] heights = new int[numCows]; 
		for (int i = 0; i < numCows; i++) {
			heights[i] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(heights); 
		StringTokenizer st2 = new StringTokenizer(stdin.nextLine()); 
		int[] stallHeight = new int[numCows]; 
		for (int i = 0; i < numCows; i++) {
			stallHeight[i] = Integer.parseInt(st2.nextToken()); 
		}
		long total = 1; 
		int numPass = 0; 
		for (int i = numCows-1; i > -1; i--) {
			//System.out.println(numPass + " " + total); 
			numPass = 0; 
			for (int j = 0; j < numCows; j++) {
				if (heights[i] <= stallHeight[j]) {
					numPass++; 
				}
			} total *= numPass - (numCows - i-1);
		}
		System.out.println(total); 
	}
}
