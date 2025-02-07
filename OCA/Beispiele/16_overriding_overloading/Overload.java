// Z:\JAV1\examples\16_overriding_overloading

public class Overload
{
  public static void main(String[] args)
  {
    byte primitiveByte = 42;
    Byte byteObjekt    = new Byte(primitiveByte);
    long primitiveLong = 43;
    
    rechne(primitiveByte);
    /*
        Wenn eine Methode mit einem primitiven Typ als Parameter
        passt und auch eine Methode, bei der Boxing nötig ist, dann
        wird IMMER die Methode ohne Boxing benutzt.
    */
    
    schreib(byteObjekt);
    /*
        Wenn eine Methode mit einem Wrapper-Objekt als Parameter
        passt und auch eine Methode, bei der Unboxing nötig ist,
        dann wird IMMER die Methode ohne Unboxing benutzt.
    */
    
    primitiv(primitiveByte);
    /*  
        Typumwandlung byte -> int
        Der kleinste passende Datentyp wird benutzt.
    */
    
    primitiv(byteObjekt);
    /*
        Unboxing Byte -> byte,
        Typumwandlung byte -> int.
    */
    
 // longObjekt(primitiveByte);
 // error: incompatible types: byte cannot be converted to Long
    /*
        Boxing von byte -> Byte wird zuerst gemacht. Byte ist aber
        keine Unterklasse von Long, und kann daher nicht zu Long
        gecastet werden.
    */
    
    // Methode static void longObjekt(Byte zahl) hinzugefügt
    // longObjekt(primitiveByte); // Nach Test auskommentiert
    /*
        Boxing byte -> Byte
    */
    
    numberObj(primitiveByte);
    /*
        Boxing byte -> Byte,
        casting zu Number.
        
        void numberObj(Byte... zahl) würde auch passen,
        wird aber wgen variable Argumentenliste nicht benutzt,
        wenn irgend eine andere Methode passt.
    */
    
    System.out.println("\nvariable Parameterliste");
    
    primitive(primitiveByte);
    /*
        Typumwandlung byte -> long
    */
    
    primitive(byteObjekt);
    /*
        Unboxing Byte -> byte,
        Typumwandlung byte -> long
    */
    
    objekte(primitiveByte);
    /*
        Boxing byte -> Byte,
        casting Byte -> Number
    */
  }
  
  static void rechne(int zahl)
  {
    System.out.println("void rechne(int zahl)");
  }

  static void rechne(Byte zahl)
  {
    System.out.println("void rechne(Byte zahl)");
  }

  static void schreib(byte zahl)
  {
    System.out.println("void schreib(byte zahl)");
  }

  static void schreib(Number zahl)
  {
    System.out.println("void schreib(Number zahl)");
  }

  static void schreib(Integer zahl)
  {
    System.out.println("void schreib(Integer zahl)");
  }

  static void primitiv(int zahl)
  {
    System.out.println("void primitiv(int zahl)");
  }

  static void primitiv(long zahl)
  {
    System.out.println("void primitiv(long zahl)");
  }
  
  static void longObjekt(Long zahl)
  {
    System.out.println("void longObjekt(Long zahl)");
  }

  /*
  // Hinzugefügt nach Test mit (Long zahl)
  static void longObjekt(Byte zahl)
  {
    System.out.println("void longObjekt(Byte zahl)");
  }
  // Nach dem Test auskommentiert
  */
  
  static void numberObj(Byte... zahl)
  {
    System.out.println("void numberObj(Byte... zahl)");
  }
  
  static void numberObj(Number zahl)
  {
    System.out.println("void numberObj(Number zahl)");
  }
  
  static void primitive(long... zahlen)
  {
    System.out.println("void primitive(long... zahlen)");
  }
  
  static void objekte(Number... zahlen)
  {
    System.out.println("void objekte(Number... zahlen)");
  }  
}