// JAV3\beispiele\06_exceptions

public class G_catchMitExit
{
  public static void main(String[] args)
  {
    int z = 12, n, q;
    
    for(n = 3; n > -3; n--)
    {
      try
      {
        q = z / n;
        System.out.println("q = " + q);
      }
      catch (Exception e)
      {
        System.out.println("Fehler");
        System.exit(0);
        // Bei System.exit(int) wird der finally-Block
        // nicht ausgeführt
      }
      finally
      {
        System.out.println("... finally");
      }
      System.out.println("Schleife lauft bis zum Ende");
    }
    System.out.println("Programm lauft bis zum Ende");
  }
}