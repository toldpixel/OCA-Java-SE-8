// Z:\JAV2\examples\08_Exceptions

public class F_catchMitContinue
{
  public static void main(String[] args)
  {
    int z = 12, n, q;
    
    for (n = 3; n > -3; n--)
    {
      try
      {
        q = z / n;
        System.out.println("q = " + q);
      }
      catch (Exception e)
      {
        System.out.println("Fehler");
        continue;
      }
      finally
      {
        System.out.println("finally");
        // finally wird auch beim continue ausgeführt
      }
      System.out.println("Schleife läuft bis zum Ende");
    }
    System.out.println("Programm läuft bis zum Ende.");
  }
}