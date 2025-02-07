// Z:\JAV1\examples\10_DeclareClassMembers\f_sychronized

// public syncronized class Test
// error: modifier synchronized not allowed here

public class Test
{
  // public synchronized static int x = 1;
  // error: modifier synchronized not allowed here
  
  public static int x = 1;
  // public syncronized       int y = 2;
  // error: modifier synchronized not allowed here
  
  public        int y = 2;
  
  public static void main(String[] args)
  {
  
  }
  
  public static synchronized void doIt1() {}
  
  public synchronized Test doIt2() 
  {
    return new Test();
  }
}