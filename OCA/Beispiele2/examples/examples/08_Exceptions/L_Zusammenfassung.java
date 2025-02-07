// Z:\JAV2\examples\08_Exceptions

public class L_Zusammenfassung
{
  public static void main(String[] args)
  {
    try
    {
      nix();
      /*
          Die Operation nix() behauptet eine checked Exception werfen zu können. Sie MUSS daher hier behandelt werden.
      */
    }
    catch (L_CheckedException1 e) {}
    // Es wird geprüft, ob sie geworfen werden kann.
    // Es genügt aber, dass die Methode es behauptet.
    
    // catch (L_CheckedException2 e) {}
    // Es dürfen nur der behauptete checked Exception oder
    // Unterklassen davon aufgefangen werden.
    
    // catch (Exception e) {}
    // Es wird nicht geprüft, ob sie geworfen wird, oder ob
    // überhaupt irgend eine Exception geworfen wird.
    
    catch (L_UncheckedException1 e) {}
    // Es wird nicht geprüft, ob eine unchecked Exception 
    // (RuntimeException) geworfen wird, oder geworfen werden kann.
    
    catch (Error e) {}
    // Es wird nicht geprüft, ob er geworfen wird
    
    catch (Throwable t) {}
    // Es wird nicht geprüft, ob er geworfen wird
    
    /*
        Nur bei checked Exceptions wird geprüft,
        ob sie überhaupt geworfen werden können.
    */
  }
  
  private static void nix() throws L_CheckedException1
  /*
      Hier wirf behauptet, dass die Operation nix() eine L_CheckedException1 werfen kann, obwohl sie es nicht macht. Hier kann ALLES behauptet werden, auch wenn es nicht stimmt.
  */
  {
    // throw new L_CheckedException2();
    // checked Exception, MUSS aufgefangen oder erklärt werden
    
    // throw new Exception();
    // muss aufgefangen oder erklärt werden.
    
    // throw new L_UncheckedException2();
    // RuntimeException, muss NICHT aufgefangen oder erklärt werden.
    
    // throw new Error();
    // Error muss nicht aufgefangen oder erklärt werden.
    
    // throw new Throwable();
    // muss aufgefangen oder erklärt werden.
    
    /*
        Checked Exceptions und Exception und Throwable
        müssen aufgefangen oder erklärt werden.
    */
  }
}

class L_CheckedException1 extends Exception{}
class L_CheckedException2 extends Exception{}
class L_UncheckedException1 extends RuntimeException{}
class L_UncheckedException2 extends RuntimeException{}