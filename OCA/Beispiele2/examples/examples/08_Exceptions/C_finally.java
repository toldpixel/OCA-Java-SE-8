// Z:\JAV2\examples\08_Exceptions

public class C_finally
{
  public static void main(String[] args)
  {
    int z = 12, n, q = -1;
    
    try
    {
      n = Integer.parseInt(args[0]);
      q = z / n;
    }
    // error: 'try' without 'catch', 'finally'
    catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException");
      System.exit(23);
    }
    catch (Exception e)
    {
      System.out.println("Exception gefangen.");
    }
 // System.out.println("Text.");
 // Zwischen try und catch / finally darf kein code stehen.
    finally
    {
      System.out.println("...finally");
      /*
          wird IMMER ausgeführt, egal ob ein Exception geworfen wird
          oder nicht. Ausnahme: System.exit(int) im catch-Block.
          
          Muss als letztes, nach allen catch-Blöcke stehen,
          ist auch ohne catch-Bloch erlaubt.
      */
    }
    System.out.println("q = " + q);
    System.out.println("Programm wird beendet.");
  }
}