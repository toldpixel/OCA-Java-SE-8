// Z:\JAV2\examples\08_Exceptions

@Deprecated
public class P_wichtigeExceptions
{
  public static void main(String[] args)
  {
    // ArrayIndexOutOfBoundsException <-- JVM, RuntimeException 
    int[] intArray = {42};
    try
    {
      intArray[9] = 43;
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
    
    // ClassCastException <-- JVM, RuntimeException 
    try
    {
      Object  string = new String("42");
      Integer zahl   = (Integer) string;
    }
    catch (ClassCastException e)
    {
      System.out.println(e);
    }
    
    // IllegalArgumentException <-- Programm, RuntimeException 
    try
    {
      new java.util.Date("heute");
    }
    catch (IllegalArgumentException e)
    {
      System.out.println(e);
    }
    
    // NullPointerException <-- JVM, RuntimeException 
    String keinString = null;
    try
    {
      keinString.length();
    }
    catch (NullPointerException e)
    {
      System.out.println(e);
    }
    
    // ExceptionInInitializerError <-- JVM, Error 
    // betrifft NUR statische Initialisierung
    try
    {
      new P_InitTest();
    }
    catch (ExceptionInInitializerError e)
    {
      System.out.println(e);
    }
    
    // StackOverflowError <-- JVM, Error
    try
    {
      rekursion();
    }
    catch (StackOverflowError e)
    {
      System.out.println(e);
    }
    
    // NoClassDefFoundError <-- JVM, Error 
    /*
        Die Klasse P_TestIstWeg.class muss nach dem
        compilieren gelöscht oder verschoben werden.
    */
    try
    {
      new P_TestIstWeg();
    }
    catch (NoClassDefFoundError e)
    {
      System.out.println(e);
    }
    
    // ArithmeticException <-- JVM, RuntimeException 
    try
    {
      int i = 1 / 0;
    }
    catch (ArithmeticException e)
    {
      System.out.println(e);
    }
    
    // KEIN Exception
    double d = 1.0 / 0.0; // Infinity
    System.out.println(d);
    
    // NumberFormatException <-- Programm, RuntimeException
    try
    {
      Integer.parseInt("3000000000");
    }
    catch (NumberFormatException e)
    {
      System.out.println(e);
    }
    
    // FileNotFoundException <-- Programm, checked Exception
    try
    {
      java.io.FileInputStream datei = new java.io.FileInputStream("NichtDa.txt");
    }
    catch (java.io.FileNotFoundException e)
    {
      System.out.println(e);
    }
  }
  
  static void rekursion()
  {
    rekursion();
  }
}

class P_InitTest
{
  static int[] intArray = new int[2];
  
  // Statische Initialisierung
  static
  {
    intArray[3] = 0;
  }
}

class P_TestIstWeg {}