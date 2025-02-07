// Z:\JAV2\examples\07_flow_control

public class B04_while
{
  public static void main(String[] args)
  {
    int i = 1;
    
    while (i != 10)
    {
      System.out.println("i = " + i++);
    }
    
    while (i++ <= 20)
      if (i % 2 == 0)
        System.out.println("i = " + i);
      
    if (debug) System.out.println("i = " + i);
  }
}