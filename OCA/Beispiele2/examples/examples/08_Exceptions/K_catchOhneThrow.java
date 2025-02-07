// Z:\JAV2\examples\08_Exceptions

public class K_catchOhneThrow
{
  public static void main(String[] args)
  {
    int zahl = 128;
    byte kleineZahl;
    
    try
    {
      if (zahl > 127)
        throw new ArithmeticException("Zahl zu gross: " + zahl);
      
      kleineZahl = (byte) zahl;
      System.out.println("kleineZahl = " + kleineZahl);
    }
    /*
    catch (J_ZahlZuGrossException zzge)
    {
      System.out.println("zzge.getMessage()");
    }
        error: exception J_ZahlZuGrossException is never thrown in body of corresponding try statement
    */
    /*
    catch (java.io.IOException ioe)
    {
      System.out.println("ioe.getMessage()");
    }
        error: exception IOException is never thrown in body of corresponding try statement
    */
    /*
        Die IOException und die selbst geschrieben J_ZahlZuGrossException dürfen hier nicht gefangen werden, weil sie checked Exceptions sind, und im try-Block nicht geworfen werden (können).
        
        Checked Exceptions sind Exception und alle Unterklassen von Exception, die aber nicht RuntimeException oder Unterklassen von RuntimeException sind.
        
        Der Compile überprüft, ob eine checked Exception überhaupt geworfen wird oder geworfen werden kann.
    */
    catch (ArithmeticException e)
    {
      System.out.println(e.getMessage());
    }
    catch (NumberFormatException e)
    // Geht, weil NumberFormatException unchecked ist
    {
      System.out.println(e.getMessage());
    }
    finally
    {
      System.out.println("... finally.");
    }
    
    try 
    {
      throw new Exception();
    }
    catch (Throwable t)
    {
      /*
          Wenn eine checked Exception geworfen wird, MUSS ein catch-Block folgen!
      */
      System.out.println(t.getMessage());
    }
    finally
    {
      System.out.println("... nur finally reicht nicht");
    }
  }
}