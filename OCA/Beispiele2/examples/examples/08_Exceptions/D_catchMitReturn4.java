// Z:\JAV2\examples\08_Exceptions

public class D_catchMitReturn4
{
  static int rueckgabe = 0;
  
  public static void main(String[] args)
  {
 // System.out.println(doNothing());
 // error: 'void' type not allowed here
 
    while (true)
      System.out.println(rechne("0"));
    // System.out.println("Programm wird beendet.");
    // System.out.println(rueckgabe);
  }
  
  static void doNothing() { }
  
  static int rechne(String param)
  {
    int z = 12, n, q;
    
    try
    {
      n = Integer.parseInt(param);
      q = z / n;
      System.out.println("q = " + q);
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("Die Eingabe ist keine Zahl.");
      return -1;
    }
    catch (ArithmeticException ae)
    {
      System.out.println("Division durch 0.");
      rueckgabe = 1;
      /*
          Der Rückgabe wird im catch-Block festgelegt, die Änderung im
          finally-Block wird nicht berücksichtigt...
      */
      return 3;
    }
    finally
    {
      System.out.println("... finally.");
      return 5;
      /*
          Der finally-Block wird vor den return in den catch-Blöcken
          ausgeführt.
      */
    }
    
    // return -2;
  }
}