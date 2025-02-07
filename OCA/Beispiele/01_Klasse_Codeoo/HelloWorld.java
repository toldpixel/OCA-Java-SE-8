// Z:\JAV1\examples\01_Klasse_Code 

class HelloWorld extends Object           // <- Klasse
                 implements Iface         // <- Interface
{                                         //    Vererbung
  String s = "Hello World!";              // <- Zustand
  privat long l;
  
  public static void main(String[] args)  // <- Verhalten
  {
    HelloWorld hw1 = new HelloWorld();    // <- Objekt
    System.out.println(hw1.s);
    
    hw1.doIt();
  }
  
  // Constructor
  public HelloWorld()
  {
    super();
  }
  
  int doIt()
  {
    return 42;
  }
  
  void setValue(long l)
  {
    if (l >= 0)
      this.l = l;
  }
}

interface Iface {}
/*
    stdin  -> Tastatur
    stdout -> Konsole
    stderr -> Konsole
*/