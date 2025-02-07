// Z:\JAV2\examples\08_Exceptions

public class I_newException
{
  public static void main(String[] args) // throws Exception
    /*
        Exception ist eine checked Exception, wenn er geworfen
        wird, MUSS er aufgefangen oder wie hier weiter geworfen
        werden.
    */
  {
    int z = 12, n = 1, q, ze;
    byte b;
    
    try
    {
      ze = 12 * z / n;
      
      if (ze > 127 || ze < -128)
        throw new Exception("Ausserhalb des byte-Bereichs: " + ze);
      
      b = (byte) ze;
      System.out.println("b = " + b);
    }
    /*
        Eine checked Exception, die im try-Block geworfen wird,
        MUSS aufgefangen oder weitergeworfen werden.
    */
    catch (Exception e)
    {
      System.out.println("Exception: " +  e.getMessage());
    }
    finally
    {
      System.out.println("... finally.");
    }
  }
}