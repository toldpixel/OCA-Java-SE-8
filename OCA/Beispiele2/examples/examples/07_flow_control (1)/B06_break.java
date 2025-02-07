// Z:\JAV2\examples\07_flow_control

public class B06_break
{
  public static void main(String[] args)
  {
    int i = 1;
    
    outer:
    while (true)
    {
      System.out.println("outer:  " + i);
      
      middle:
      while (true)
      {
        System.out.println("middle: " + i);
        
        inner:
        while (true)
        {
          System.out.println("inner:  " + i);
          
          i++;
          
          if (i == 3) break inner;
          
          if (i == 5) break middle;
          
          if (i == 10) break outer;
        }
      }
    }
  }
}