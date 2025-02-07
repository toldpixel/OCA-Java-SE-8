// Z:\JAV2\examples\08_Exceptions

public class A_eineException
{
  public static void main(String[] args)
  {
    int z = 12, n, q;
    
    // n = Integer.parseInt("a");
    // java.lang.NumberFormatException
    
    try
    {
      n = Integer.parseInt("a");
    } 
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      System.out.println("");
      System.out.println(e.toString());
      System.out.println("");
      e.printStackTrace();      
      
    }
    
    System.out.println("Programm lauft bis zum Ende");
  }
}