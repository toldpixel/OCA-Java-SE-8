// Z:\JAV2\examples\08_Exceptions

public class N_newError
{
  public static void main(String[] args)
  {
    int  zahl = 128;
    byte kleineZahl;
    
    // throw new Error();
    // Error ist unchecked, kann also ohne Ankündigung
    // oder Fehlerbehandlung geworfen werden.
    
    try
    {
      if (zahl > 127)
        throw new Error("Zu gross: " + zahl);
      
      /*
          Error ist eine konkrete Klasse, also können
          Error-Objekte erzeugt werden.
      */
      
      kleineZahl = (byte) zahl;
      System.out.println("kleineZahl = " + kleineZahl);
    }
    catch (Exception e) {}
    catch (Error e)
    {
      System.out.println(e.getMessage());
      /*
          Auch ein Erro kann aufgefangen werden, obwohl das in
          der Praxis in der Regel nicht sinnvoll ist.
      */
    }
  }
}