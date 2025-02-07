// Z:\JAV2\examples\08_Exceptions

public class H_throwsException
{
  public static void main(String[] args) throws Throwable
  {
    /*
        Mögliche Exceptions werden in der Operation nicht
        aufgefangen und behandelt, sondern an die aufrufende
        Stelle weiter geworfen.
    */
    rechne(args[0]);
  }
  
  static void rechne(String param) throws ArithmeticException,
                                          NumberFormatException,
                                          RuntimeException,
                                          java.io.IOException,
                                          Throwable,
                                          Error,
                                          Exception
                                          
  /*
      throws ist eine Warnung, damit die aufrufende Stelle eine
      entsprechende Fehlerbehandlung beinhalten kann / muss.
  */
  {
    int n = Integer.parseInt(param);
    int q = 12 / n;
    System.out.println("q = " + q);
  }
}