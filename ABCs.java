import java.io.*; 
import java.util.*; 
public class ABCs {
	public static void main(String[] args) throws IOException{
	Scanner stdin = new Scanner(System.in); 
	 int[] nums = new int[7]; 
	 for(int i = 0; i < nums.length; i++) {
		 nums[i] = stdin.nextInt(); 
	 }
	 Arrays.sort(nums); 
	 int a = nums[0]; 
	 int b = nums[1]; 
	 int c = nums[6] - a - b; 
	 System.out.println(a + " " + b + " " + c); 
	}
}
