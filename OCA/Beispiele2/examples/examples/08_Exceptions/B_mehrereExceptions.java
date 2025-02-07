// Z:\JAV2\examples\08_Exceptions

public class B_mehrereExceptions
{
  public static void main(String[] args)
  {
    int z = 12, n, q = -1;
    
    try
    {
      n = Integer.parseInt(args[0]);
      q = z / n;
    }
    /*
    catch (Exception e)
    {
      System.out.println("catch (Exception e)"); 
    }
        Darf hier nicht stehen, weil dann die NumberFormatException
        und ... mitgefangen werden.
    */
    catch (NumberFormatException nfe)
    {
      System.out.println("Die Eingabe ist keine Zahl");
    }
 // System.out.println("Soweit alles gut...");
 // error: 'catch' without 'try'
    catch (ArithmeticException ae)
    {
      System.out.println("Der Nenner ist 0"); 
    }
    catch (ArrayIndexOutOfBoundsException aioobe)
    {
      System.out.println("Kein Parameter beim Programmstart");
    }
    catch (Exception e)
    {
      System.out.println("Generelle Exception geworfen.");
    }
    System.out.println("q = " + q);
    System.out.println("Programm wird beendet.");
  }
}