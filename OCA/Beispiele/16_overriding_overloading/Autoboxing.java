// Z:\JAV1\examples\16_overriding_overloading

public class Autoboxing
{
  public static void main(String[] args)
  {
    int ip = 42;
 // System.out.println(ip.toString());
 // error: int cannot be dereferenced
 
 // String is = ip;
 // error: incompatible types: int cannot be converted to String
 
    setInteger(ip);
    // Autoboxing: Primitive Variable können automatisch in
    // Objekte der entsprechende Wrapperklassen verpackt werden,
    // falls ein Objekt erwartet wird.
  }
  
  static void setInteger(Integer io)
  {
 // String is0 = io;
 // error: incompatible types: Integer cannot be converted to String
    
    String is = io.toString();
    System.out.println(is);
    
    int ip = io;
    // Autounboxing: Bei eine Zuweisung zu eine primitive Variable,
    // wird das Objekt ausgepackt.
    System.out.println(ip);
  }
}

/*  primitiv    Wrapperklasse
    byte    <-> Byte
    short   <-> Short
    char    <-> Character
    int     <-> Integer
    long    <-> Long
    float   <-> Float
    double  <-> Double
    
    boolean <-> Bool
*/