// Z:\JAV1\examples\02_bezeichner

public class Identifier
{
  // Bezeichner müssen mit einen Buchstaben, $ oder _ anfangen
  
  int xx = 0; // Java ist case sensitive!
  int Xx = 0;
  int $x = 0;
  int _x = 0;
  // int 5x = 0; // Geht nicht!
  
  
  
  public static void main(String[] args)
  {
  
  }
  
  static
  {
    
  }
  
  {
    // Konventionen
    
    /* Klassen, Interfaces, Enums
       1. Erstes Zeichen gross
       2. Jeder neuer Wortteil gross
       3. Alles andere kleine
       4. Keine Unterstriche ....
       
       Auto
       NadelDrucker <- CamelCase
       
       Klassennamen -> Substantive
       Interfaces   -> Fähigkeiten
    */
    
    /* Methoden, Operationen
       1. Erste Buchstabe klein
       2. CamelCase
       
       // JavaBeans Regeln
       setVariable
       getVariable
       isVariable
    */
    
    /* Variablen
       1. wie Methoden
    */
    
    /* Konstanten
       Konstanten sind finale Variablen!
       
       MAX_VALUE
    */
  }
}