
public class Tuple<X,Y> { 
  public final String x; 
  public final boolean y; 

  public Tuple(String x, boolean y) { 
	    this.x = x; 
	    this.y = y; 
	  } 
  
  public String getX() {
	return x;
  }

  public boolean getY() {
	return y;
  }
} 
