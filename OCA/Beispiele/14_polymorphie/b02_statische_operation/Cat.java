// Z:\JAV1\examples\14_polymorphie\b02_statische_operation

public class Cat extends Animal
{
  /*
  @Override
  
      error: method does not override or implement a method from a supertype
        @Override
        ^
      1 error
  */
  
  public static void saySomething()
  {
    System.out.println("miau!");
  }
}