import java.io.*; 
import java.util.*; 
import java.awt.Rectangle; 

class billboard {
	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new FileReader("billboard.in")); 
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
	    int x1 = f.nextInt(); int y1 = f.nextInt(); int x2 = f.nextInt(); int y2 = f.nextInt();
	    Rectangle lawn = new Rectangle(x1, -y1, x2-x1, y2-y1); 
	    //System.out.println(lawn); 
	    int x11 = f.nextInt(); int y11 = f.nextInt(); int x22 = f.nextInt(); int y22 = f.nextInt();
	    Rectangle feed = new Rectangle(x11, -y11, x22-x11, y22-y11); 
	    //System.out.println(feed); 
	    int area = 0; 
	    Rectangle intersect = feed.intersection(lawn); 
	    if (intersect.getWidth() < 1 || intersect.getHeight() < 1) {
	    	out.println(0); 
	    }else {
	    //System.out.println(intersect); 
	    if (y22 >= y2 && y11 <= y1) {//lawn is in between widths of feed
	    	if (x11 > x1 && x22<x2) {
	    		area = (x2-x1) * (y2-y1); 
	    	} else {
	    		area = ((x2-x1) * (y2-y1)) - ((int)intersect.getHeight() * (int)intersect.getWidth()); 
	    	}
	    }
	    else if (x11 <= x1 && x11 >= x2 && y2 > y22) {
	    	area = ((x2-x1) * (y2-y1)) - ((int)intersect.getHeight() * (int)intersect.getWidth()); 
	    }
	    else {
	    	//System.out.println("uh"); 
	    	area =  (x2-x1) * (y2-y1); 
	
	    }
	    out.println(area); 
	    }
	    
	   
	     
	    out.close(); f.close(); 
	}
}
