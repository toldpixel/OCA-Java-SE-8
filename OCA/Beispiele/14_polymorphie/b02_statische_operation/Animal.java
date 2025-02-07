// Z:\JAV1\examples\14_polymorphie\b02_statische_operation

public abstract class Animal
{
  public static void saySomething()
  {
    System.out.println("????");
  }
  
  public static void whoAreYou()
  {
    System.out.println("Animal");
  }
  
  // public static abstract void doSomething();
  // error: illegal combination of modifiers: abstract and static
  // public static abstract void doSomething();
  //                             ^
  
  // Eine Operation darf nicht static UND abstract sein, weil sie
  // über den Klassennamen aufgerufen werden könnte.
}