// Z:\JAV2\examples\08_Exceptions

public class O_throwsGelogen
{
  public static void main(String[] args)
  {
    // tuWas();
    /*
        Weil die Operation tuWas() behauptet, dass sie
        eine checked Exception werfen kann, MUSS sie hier
        aufgefangen oder weiter geworfen werden.
    */
    
    try
    {
      tuWas();
    }
    catch (java.io.IOException e) {}
  }
  
  public static void tuWas() throws java.io.IOException
  {
    /*
        Der compiler prüft nicht, ob die Behauptung "throws" strimmt.
        Hier ist es gelogen.
    */
  }  
}