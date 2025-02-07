// Z:\JAV1\examples\09_Use_Interfaces\c_vererbungVonInterfaces

interface WertSendung // extends Sendung
{
  // public static final int MAX_WERT = 5_000;
  public static final int MAX_WERT = Start.getMax();
  
  // finale Variablen MÜSSEN exakt ein Mal ein Wert 
  // zugewiesen bekommen.
    
  public abstract int getWert();
}