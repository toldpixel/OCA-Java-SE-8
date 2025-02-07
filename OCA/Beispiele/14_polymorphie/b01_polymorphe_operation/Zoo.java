// Z:\JAV1\examples

public class Zoo
{
  public static void main(String[] args)
  {
    Animal a1 = new Cat();
    Animal a2 = new Dog();
    Animal a3 = new Salmon();
 // Animal a4 = new Animal();
 // Animal is abstract; cannot be instantiated
 
    a1.saySomething();
    a2.saySomething();
    a3.saySomething();
    
    a1.askAnimal();
    a2.askAnimal();
    a3.askAnimal();
    
    /*
        Der GLEICE Operationsaufruf an mehrere Variablen
        des GLEICHEN Typs hat unterschiedliche Wirkungen.
        Das ist Polymorphie!
    */
  }
}