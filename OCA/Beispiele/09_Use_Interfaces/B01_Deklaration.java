// Z:\JAV1\examples\09_Use_Interfaces

/*
    Regeln:
    1. Interfacemethoden sind implizit public und abstract, ausser
       wenn sie alt static oder default deklariert sind.
    2. Variablen in interfaces sind public, static und final.
    3. Interfacemethoden können NICHT final, strictfp oder native sein.
    4. Ein interface kann interfaces erweitern (extends).
    5. Ein interface kann keine Klasse erweitern.
    6. Ein interface kann klassen oder andere interfaces nicht
       implementieren.
    7. Ein interface wird deklariert mit dem Schlüsselwort interface.
    8. Interfaces können für polymorphe Operationen verwendet werden.
*/

interface Interface
{
  // public abstract void doIt(int x);
  //        abstract void doIt(int x);
                     void doIt(int x);
  // final           void doIt(int x);
  // error: modifier protected not allowed here
  // error: modifier final not allowed here
}

class Implementator implements Interface
{
  public void doIt(int x)
  {
    System.out.println("public void doIt(int x)");
  }
  
  public void doMore()
  {
    System.out.println("public void doMore()");
  }
}

public class B01_Deklaration
{
  public static void main(String[] args)
  {
    Interface iface = new Implementator();
    iface.doIt(42);
    // iface.doMore();
    iface.hashCode();
    
    Interface i2    = new Imp2();
    i2.doIt(42);
    // i2.doSomethingElse();
    i2.hashCode();
    
    Interface[] iArr = {iface, i2};
    for (Interface i : iArr)
      i.doIt(42);
    
    // Implementator imp3 = (Implementator)i2;
    // java.lang.ClassCastException
    
    Implementator imp3 = new Implementator();
    Imp2          imp4 = new Imp2();
    
    Interface[] iArr2 = {imp3, imp4};
    
    if (imp4 instanceof Imp2) System.out.println("Imp2");
    if (imp4 instanceof Interface) System.out.println("Interface");
    if (imp4 instanceof Object) System.out.println("Object");
  }
}

class Imp2 implements Interface
{
  public void doIt(int x)
  {
    System.out.println("Imp2.public void doIt(int x): " + x);
  }
  
  public void doSomethingElse()
  {
    System.out.println("public void doSomethingElse()");
  }
}