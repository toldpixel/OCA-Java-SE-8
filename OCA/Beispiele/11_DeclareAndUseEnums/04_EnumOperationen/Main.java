// Z:\JAV1\examples\11_DeclareAndUseEnums\04_EnumOperationen

import static pack.Risiko.*;

public class Main
{
  public static void main(String[] args)
  {
    Laune aktuell = Laune.MITTEL;
    
    System.out.println(aktuell);
    System.out.println(aktuell instanceof Laune);
    
    // Die Methode values() liefert ein Array
    Laune[] array = Laune.values();
    
    for (Laune laune : array)
      System.out.println(laune);
    
    System.out.println(Laune.values()[2]);
    
    // Die Methode ordinal() liefert die Position
    // die ein enum-Objekt innerhalb des enums hat
    System.out.println(Laune.MITTEL.ordinal());
    
    // Die Methode name() liefert den enum-Wert als String
    System.out.println(Laune.MITTEL.name());
    System.out.println(Laune.MITTEL.name() instanceof String);
    
    // toString() liefert ebenfalls den enum-Wert als String
    System.out.println(Laune.MITTEL.toString());
    
    // import static geht nur wenn der enum in einem
    // 'echten' package steht (nicht default package)
    System.out.println(HOCH);
    System.out.println(HOCH.ordinal());
  }
}