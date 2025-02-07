// Z:\JAV2\examples\08_Exceptions

public class J_eigeneException
{
  public static void main(String[] args)
  {
    int  zahl = 128;
    byte kleineZahl;
    
 // throw new J_ZahlZuGrossException(zahl);
 /*
     error: unreported exception J_ZahlZuGrossException; 
     must be caught or declared to be thrown
     
     ... weil J_ZahlZuGrossException eine checked Exception ist
 */
    
 // throw new ArithmeticException();
 // Geht, weil ArithmeticException eine RuntimeException ist
 
    try
    {
      if (zahl < -128 || zahl > 127)
        throw new J_ZahlZuGrossException(zahl);
      
      kleineZahl = (byte) zahl;
    }
    catch (J_ZahlZuGrossException zzge)
    {
      System.out.println(zzge.getMessage());
    }
    System.out.println("Programm lauft bis zum Ende");
  }
}