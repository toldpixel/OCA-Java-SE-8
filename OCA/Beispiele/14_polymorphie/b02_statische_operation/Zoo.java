// Z:\JAV1\examples\14_polymorphie\b02_statische_operation

public class Zoo
{
  public static void main(String[] args)
  {
    // Aufruf von statischen Methoden an der jeweiligen Klasse
    Animal.saySomething();
    Cat.saySomething();
    
    // Statische Operation an einem Objekt der Klasse
    Cat cat = new Cat();
    cat.saySomething();
    
    // Auch statische Operationen werden vererbt
    Animal.whoAreYou();
    Cat.whoAreYou();
    cat.whoAreYou();
    
    // Bei statische Operationen gibt es KEINE Polymorphie
    Animal animal = new Cat();
    animal.saySomething();
    
    animal = null;
    System.out.println(animal);
    animal.saySomething();
  }
}