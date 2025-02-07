// Z:\JAV2\examples\08_Exceptions

public class J_ZahlZuGrossException extends Exception
{
  private int falscheZahl;
  
  public J_ZahlZuGrossException(int zahl)
  {
    falscheZahl = zahl;
  }
  
  @Override
  public String getMessage()
  {
    return falscheZahl + " passt nicht in byte";
  }
}