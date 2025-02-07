// Z:\JAV2\examples\08_Exceptions

public class M_newThrowable
{
  public static void main(String[] args)
  {
    int  zahl = 128;
    byte kleineZahl;
    
    // throw new Throwable();
    // unreported exception Throwable; 
    // must be caught or declared to be thrown
    
    try
    {
      if (zahl > 127)
        throw new Throwable("Zu gross: " + zahl);
      
      /*
          In der Regel haben nur Interfaces die Endung "able".
          Throwable ist aber eine konkrete Klasse, daher können
          auch Throwable-Objekte erzeugt werden.
      */
      
      kleineZahl = (byte) zahl;
    }
    catch (Exception e) {} 
    catch (Throwable t) {}
    finally
    {
      System.out.println("... finally.");
      // Nur finally reicht nicht
    }
  }
}