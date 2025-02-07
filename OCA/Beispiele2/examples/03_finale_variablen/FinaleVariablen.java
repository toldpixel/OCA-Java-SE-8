// Z:\JAV2\examples\03_finale_variablen

public class FinaleVariablen
{
  static final int statfinVar1 = 1;
  static final int statfinVar2;
  static final int statfinVar3;
  
         final int finObjAttr1 = 0;
         final int finObjAttr2;
 // error: variable finObjAttr2 might not have been initialized
         final int finObjAttr3;
         
  public FinaleVariablen()
  {
 // statfinVar2 = 1;
 // error: cannot assign a value to final variable statfinVar2
 
 // letzte Möglichkeit ein finales Objektattribut zu initialisieren
    finObjAttr3 = 21;
  }
  
  static
  {
    // letzte Möglichkeit eine final statische Variable
    // zu initialisieren
    statfinVar2 = 1;
    statfinVar3 = new Main().getInt();
  }
  
  {
    // initialisierung finale Objektattribute
    finObjAttr2 = 1;
  }
  
  public FinaleVariablen(int x)
  {
 // letzte Möglichkeit ein finales Objektattribut zu initialisieren
    finObjAttr3 = x;
  }
}