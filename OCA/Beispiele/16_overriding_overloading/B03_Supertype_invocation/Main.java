// Z:\JAV1\examples\16_overriding_overloading\B03_Supertype_invocation

public class Main
{
  public static void main(String[] args)
  {
    Horse horse = new Horse();
    horse.eat();
    
    Animal animal = new Horse();
    animal.eat();
    
 // System.out.println(horse.eat());
 // error: 'void' type not allowed here
 
 // animal.printYourself();
    System.out.println(animal.printYourself());
    
    System.out.println(animal.toString());
    
    horse.setAttributes("black", 4, "Knut");
    horse.setAttributes(4, "black", "Knut");
    new Animal().setAttributes(4, "black", "Knut");
    animal.setAttributes("black", 4, "Knut");
  }
}